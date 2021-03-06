/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.extra.client.core.plugin.dummies;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.activation.DataHandler;
import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.XmlMappingException;
import org.springframework.util.Assert;

import com.sun.istack.ByteArrayDataSource;

import de.drv.dsrv.extra.marshaller.IExtraMarschaller;
import de.drv.dsrv.extra.marshaller.IExtraUnmarschaller;
import de.drv.dsrv.extra.schemaversion.ExtraSchemaVersion;
import de.drv.dsrv.extrastandard.namespace.components.Base64CharSequenceType;
import de.drv.dsrv.extrastandard.namespace.components.ClassifiableIDType;
import de.drv.dsrv.extrastandard.namespace.components.DataType;
import de.drv.dsrv.extrastandard.namespace.components.ElementSequenceType;
import de.drv.dsrv.extrastandard.namespace.components.FlagCodeType;
import de.drv.dsrv.extrastandard.namespace.components.FlagType;
import de.drv.dsrv.extrastandard.namespace.components.ReceiverType;
import de.drv.dsrv.extrastandard.namespace.components.ReportType;
import de.drv.dsrv.extrastandard.namespace.components.RequestDetailsType;
import de.drv.dsrv.extrastandard.namespace.components.ResponseDetailsType;
import de.drv.dsrv.extrastandard.namespace.components.SenderType;
import de.drv.dsrv.extrastandard.namespace.components.TextType;
import de.drv.dsrv.extrastandard.namespace.messages.DataRequest;
import de.drv.dsrv.extrastandard.namespace.messages.DataRequestArgument;
import de.drv.dsrv.extrastandard.namespace.messages.DataRequestQuery;
import de.drv.dsrv.extrastandard.namespace.messages.Operand;
import de.drv.dsrv.extrastandard.namespace.messages.OperandSet;
import de.drv.dsrv.extrastandard.namespace.request.RequestTransport;
import de.drv.dsrv.extrastandard.namespace.request.RequestTransportBody;
import de.drv.dsrv.extrastandard.namespace.response.ResponsePackage;
import de.drv.dsrv.extrastandard.namespace.response.ResponsePackageBody;
import de.drv.dsrv.extrastandard.namespace.response.ResponsePackageHeader;
import de.drv.dsrv.extrastandard.namespace.response.ResponseTransport;
import de.drv.dsrv.extrastandard.namespace.response.ResponseTransportBody;
import de.drv.dsrv.extrastandard.namespace.response.ResponseTransportHeader;
import de.extra.client.core.observer.impl.TransportInfoBuilder;
import de.extrastandard.api.exception.ExtraOutputPluginRuntimeException;
import de.extrastandard.api.observer.ITransportInfo;
import de.extrastandard.api.observer.ITransportObserver;
import de.extrastandard.api.plugin.IOutputPlugin;

/**
 * Setzt die erwarteten Felder für ein FetchResponse. Dieser Implementierung
 * simuliert ein Response auf eine DataRequest.Query
 * 
 * @author Leonid Potap
 * @version $Id$
 */
@Named("dummyQueryDataResponceOutputPlugin")
public class DummyQueryDataResponceOutputPlugin implements IOutputPlugin {

	private static final Logger LOG = LoggerFactory
			.getLogger(DummyQueryDataResponceOutputPlugin.class);

	private static final String TEST_INDICATOR = "http://www.extra-standard.de/test/NONE";

	@Inject
	@Named("extraMarschaller")
	private IExtraMarschaller marshaller;

	@Inject
	@Named("extraUnmarschaller")
	private IExtraUnmarschaller extraUnmarschaller;

	@Inject
	@Named("transportObserver")
	private ITransportObserver transportObserver;

	@Inject
	@Named("transportInfoBuilder")
	private TransportInfoBuilder transportInfoBuilder;

	@Override
	public ResponseTransport outputData(final RequestTransport request) {
		LOG.info("request={}", request);
		final ResponseTransport response = createExtraResponse(request);

		return response;

	}

	private ResponseTransport createExtraResponse(final RequestTransport request) {
		try {

			// Ich gehe davon aus, dass requestId ein Mandatory Feld ist
			final String requestId = request.getTransportHeader()
					.getRequestDetails().getRequestID().getValue();
			final de.drv.dsrv.extrastandard.namespace.response.ResponseTransport response = new de.drv.dsrv.extrastandard.namespace.response.ResponseTransport();
			response.setVersion(ExtraSchemaVersion.CURRENT_SCHEMA_VERSION
					.getVersion());
			response.setProfile("http://code.google.com/p/extra-standard/profile/1");
			final ResponseTransportHeader transportHeader = new ResponseTransportHeader();
			transportHeader.setTestIndicator(TEST_INDICATOR);
			final ResponseDetailsType responseDetailsType = new ResponseDetailsType();
			responseDetailsType.setTimeStamp(new GregorianCalendar());
			final ClassifiableIDType idType = new ClassifiableIDType();
			idType.setValue("42");
			responseDetailsType.setResponseID(idType);
			final ReportType reportType = createPositiveReportType();
			reportType
					.setHighestWeight("http://www.extra-standard.de/weight/OK");
			responseDetailsType.setReport(reportType);
			transportHeader.setResponseDetails(responseDetailsType);
			final RequestDetailsType requestDetailsType = new RequestDetailsType();
			final ClassifiableIDType requestIdType = new ClassifiableIDType();
			requestIdType.setValue(requestId);
			requestDetailsType.setRequestID(requestIdType);
			transportHeader.setRequestDetails(requestDetailsType);
			response.setTransportHeader(transportHeader);
			final SenderType sender = createDummySender();
			transportHeader.setSender(sender);
			final ReceiverType receiver = createDummyReceiver();
			transportHeader.setReceiver(receiver);
			final de.drv.dsrv.extrastandard.namespace.request.RequestTransportHeader requestHeader = new de.drv.dsrv.extrastandard.namespace.request.RequestTransportHeader();
			requestHeader.setRequestDetails(requestDetailsType);
			final ITransportInfo transportInfo = transportInfoBuilder
					.createTransportInfo(requestHeader);
			final ResponseTransportBody transportBody = new ResponseTransportBody();
			response.setTransportBody(transportBody);
			final List<String> queryArguments = getQueryArguments(request);
			for (final String queryArgument : queryArguments) {
				final ResponsePackage trancportBodyPackage = new ResponsePackage();
				final ResponsePackageBody packageBody = createDummyBodyResponse(queryArgument);
				trancportBodyPackage.setPackageBody(packageBody);
				final ResponsePackageHeader packageHeader = new ResponsePackageHeader();
				packageHeader.setTestIndicator(TEST_INDICATOR);
				final SenderType dummyPackageSender = createDummySender();
				packageHeader.setSender(dummyPackageSender);
				final ReceiverType dummyPackageReceiver = createDummyReceiver();
				packageHeader.setReceiver(dummyPackageReceiver);
				// Dummy ResponseId
				final ClassifiableIDType packageHeaderResponseDetailsIdType = new ClassifiableIDType();
				packageHeaderResponseDetailsIdType.setValue(queryArgument);
				final ResponseDetailsType packageResponseDetailsType = new ResponseDetailsType();
				packageResponseDetailsType
						.setResponseID(packageHeaderResponseDetailsIdType);
				packageHeader.setResponseDetails(packageResponseDetailsType);
				// Dummy RequestId
				final ClassifiableIDType packageHeaderRequestIdType = new ClassifiableIDType();
				// (14.11.12) Die Request-Id der Anfage wird verwendet (nicht
				// queryArgument)
				packageHeaderRequestIdType.setValue(requestId);
				final RequestDetailsType headerRequestDetailsType = new RequestDetailsType();
				headerRequestDetailsType
						.setRequestID(packageHeaderRequestIdType);
				packageHeader.setRequestDetails(headerRequestDetailsType);

				final ReportType packageReportType = createPositiveReportType();

				packageResponseDetailsType.setReport(packageReportType);
				packageResponseDetailsType
						.setTimeStamp(new GregorianCalendar());
				trancportBodyPackage.setPackageHeader(packageHeader);
				transportBody.getPackage().add(trancportBodyPackage);
			}
			transportObserver.requestFilled(transportInfo);
			transportObserver.requestForwarded("dummy, keine Weiterleitung", 0);
			return response;
		} catch (final XmlMappingException xmlMappingException) {
			throw new ExtraOutputPluginRuntimeException(xmlMappingException);
		} catch (final IOException ioException) {
			throw new ExtraOutputPluginRuntimeException(ioException);
		}
	}

	/**
	 * @return
	 */
	private ReceiverType createDummyReceiver() {
		final ReceiverType receiver = new ReceiverType();
		final TextType receiverName = new TextType();
		receiverName.setValue("TEST_RECEIVER");
		final ClassifiableIDType receiverId = new ClassifiableIDType();
		receiverId.setValue("RECEIVER_ID");
		receiverId.setClazz("TEST_CLASS");
		receiver.setReceiverID(receiverId);
		receiver.setName(receiverName);
		return receiver;
	}

	/**
	 * @return
	 */
	private SenderType createDummySender() {
		final SenderType sender = new SenderType();
		final TextType testSender = new TextType();
		testSender.setValue("TEST SENDER");
		sender.setName(testSender);
		final ClassifiableIDType senderId = new ClassifiableIDType();
		senderId.setValue("SENDER_ID");
		senderId.setClazz("TestClass");
		sender.setSenderID(senderId);
		return sender;
	}

	/**
	 * @param responseDetailsType
	 */
	private ReportType createPositiveReportType() {
		final ReportType reportType = new ReportType();
		reportType.setHighestWeight("http://www.extra-standard.de/weight/OK");
		final FlagType flagType = new FlagType();
		final FlagCodeType flagCodeType = new FlagCodeType();
		flagCodeType.setValue("C00");
		flagType.setCode(flagCodeType);
		flagType.setWeight("http://www.extra-standard.de/weight/OK");
		final TextType flagCodeText = new TextType();
		flagCodeText.setValue("O.K.");
		flagType.setText(flagCodeText);
		reportType.getFlag().add(flagType);
		return reportType;

	}

	/**
	 * @return Dummy Body Response
	 * @throws MalformedURLException
	 */
	private ResponsePackageBody createDummyBodyResponse(
			final String queryArgument) throws MalformedURLException {
		final ResponsePackageBody packageBody = new ResponsePackageBody();
		final DataType value = new DataType();
		final String stringValue = "DUMMY Response for Query Argument:"
				+ queryArgument;
		// final byte[] decodeBase64Value = Base64.encodeBase64(stringValue
		// .getBytes());
		final Base64CharSequenceType base64CharSequenceType = new Base64CharSequenceType();

		final DataHandler dataHandler = new DataHandler(
				new ByteArrayDataSource(stringValue.getBytes(), "*/*"));

		base64CharSequenceType.setValue(dataHandler);
		value.setBase64CharSequence(base64CharSequenceType);
		packageBody.setData(value);
		return packageBody;
	}

	/**
	 * Liefert QueryArguments als List
	 * 
	 * @return
	 */
	private List<String> getQueryArguments(final RequestTransport requestXml) {
		final RequestTransportBody transportBody = requestXml
				.getTransportBody();
		Assert.notNull(transportBody, "ResponseTransportBody is null");
		final DataType data = transportBody.getData();
		Assert.notNull(data, "TransportData is null");
		final ElementSequenceType elementSequence = data.getElementSequence();
		Assert.notNull(elementSequence, "TransportData.elementSequence is null");
		final List<Object> any = elementSequence.getAny();
		Assert.notNull(any, "ElementSequence is empty is null");
		Assert.isTrue(any.size() == 1,
				"ElementSequense beinhaltet mehr als ein Element");
		final Object dataRequestObject = any.get(0);
		Assert.isAssignable(
				DataRequest.class,
				dataRequestObject.getClass(),
				"Unexpectede ElementSequence entry"
						+ dataRequestObject.getClass()
						+ " Expected DataRequest.");
		final DataRequest dataRequest = (DataRequest) dataRequestObject;
		final DataRequestQuery query = dataRequest.getQuery();
		Assert.notNull(query, "Query is null");
		final List<DataRequestArgument> argument = query.getArgument();
		Assert.notNull(argument, "DataRequestArgument List is null");
		// Assert.isTrue(argument.size() == 1,
		// "DataRequestArgument List beinhaltet mehr als ein Element");
		final DataRequestArgument dataRequestArgument = argument.get(0);
		Assert.notNull(dataRequestArgument, "DataRequestArgument is null");
		final List<JAXBElement<?>> dataRequestArgumentContent = dataRequestArgument
				.getContent();
		Assert.notNull(dataRequestArgumentContent,
				"DataRequestArgument.content is null");
		Assert.isTrue(dataRequestArgumentContent.size() == 1,
				"DataRequestArgument.content  beinhaltet mehr als ein Element");
		final JAXBElement<?> jaxbElement = dataRequestArgumentContent.get(0);

		// TODO MAXRESP (06.11.12)
		boolean assignableOperand = false;
		final Object operandSetObject = jaxbElement.getValue();
		final List<String> queryArgumentList = new ArrayList<String>();
		// OperandSet oder Operand?
		if (operandSetObject.getClass().isAssignableFrom(OperandSet.class)) {
			assignableOperand = true;
			final OperandSet operandSet = (OperandSet) operandSetObject;
			final List<Operand> operandEQ = operandSet.getEQ();
			Assert.notNull(operandEQ, "operandEQ is null");
			Assert.notEmpty(operandEQ, "operandEQ is empty");
			for (final Operand operand : operandEQ) {
				final String operandValue = operand.getValue();
				queryArgumentList.add(operandValue);
			}
		} else if (operandSetObject.getClass().isAssignableFrom(Operand.class)) {
			// Für Fachverfahren 'Sterbedaten Abgleich'!
			// Als OperandValue wird die maximale ResponseId erwartet (z.B. 31)
			// Als Dummy Server Antwort werden drei aufeinanderfolgende ID'S
			// (z.B. 32,33,34) generiert
			assignableOperand = true;
			final Operand operand = (Operand) operandSetObject;
			final String operandValue = operand.getValue();
			try {
				final long operandValueAsLong = Long.parseLong(operandValue);
				for (long respId = operandValueAsLong + 1; respId <= operandValueAsLong + 3; respId++) {
					queryArgumentList.add(String.valueOf(respId));
				}
			} catch (final NumberFormatException ex) {
				// Anderes Fachverfahren?
				queryArgumentList.add(operandValue);
			}
		}

		Assert.isTrue(assignableOperand,
				"Unexpected dataRequestArgumentContent entry"
						+ dataRequestObject.getClass()
						+ " Expected OperandSet or Operand.");
		return queryArgumentList;
	}
}
