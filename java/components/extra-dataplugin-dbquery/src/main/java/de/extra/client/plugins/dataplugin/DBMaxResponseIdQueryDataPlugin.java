/**
 * 
 */
package de.extra.client.plugins.dataplugin;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import de.extra.client.core.annotation.PluginConfigType;
import de.extra.client.core.annotation.PluginConfiguration;
import de.extra.client.core.annotation.PluginValue;
import de.extra.client.core.model.inputdata.impl.CriteriaQueryInputDataContainer;
import de.extrastandard.api.model.content.IInputDataContainer;
import de.extrastandard.api.model.content.QueryArgumentType;
import de.extrastandard.api.model.execution.IExecutionPersistence;
import de.extrastandard.api.model.execution.PhaseQualifier;
import de.extrastandard.api.plugin.IDataPlugin;

/**
 * Ermittelt für eine Serveranfrage die maximale Response-Id für eine Procedure
 * und Phase. (Anwendungsfall: Sterbedaten-Abgleich: Procedure 2, Phase 1)
 * 
 * @author r52gma
 * @since 1.0.0-M2
 * 
 */
@Named("dbMaxResponseIdQueryDataPlugin")
@PluginConfiguration(pluginBeanName = "dbMaxResponseIdQueryDataPlugin", pluginType = PluginConfigType.DataPlugins)
public class DBMaxResponseIdQueryDataPlugin implements IDataPlugin {

	@Inject
	@Named("executionPersistenceJpa")
	IExecutionPersistence executionPersistence;

	@Value("${core.execution.phase}")
	private String executionPhase;

	@Value("${core.execution.procedure}")
	private String executionProcedure;

	@PluginValue(key = "subquery")
	private String subquery;

	private static final Logger logger = LoggerFactory
			.getLogger(DBQueryDataPlugin.class);

	CriteriaQueryInputDataContainer dbQueryMaxResponseIdInputData = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.extrastandard.api.plugin.IDataPlugin#getData()
	 */
	@Override
	public synchronized IInputDataContainer getData() {
		if (dbQueryMaxResponseIdInputData == null) {
			final PhaseQualifier phaseQualifier = PhaseQualifier
					.resolveByName(executionPhase);
			final String maxResponseId = executionPersistence
					.maxResponseIdForExecution(executionProcedure,
							phaseQualifier, subquery);
			dbQueryMaxResponseIdInputData = new CriteriaQueryInputDataContainer(
					String.valueOf(maxResponseId),
					QueryArgumentType.GREATER_THEN, executionProcedure,
					subquery);

			logger.info("For Procedury and Phase {} MaxResponseId: {}",
					executionProcedure + "->" + executionPhase,
					String.valueOf(maxResponseId));
		}

		return dbQueryMaxResponseIdInputData;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.extrastandard.api.plugin.IDataPlugin#hasMoreData()
	 */
	@Override
	public boolean hasMoreData() {
		return (dbQueryMaxResponseIdInputData == null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.extrastandard.api.plugin.IDataPlugin#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return false;
	}

	/**
	 * @param subquery
	 *            the subquery to set
	 */
	public void setSubquery(final String subquery) {
		this.subquery = subquery;
	}

}
