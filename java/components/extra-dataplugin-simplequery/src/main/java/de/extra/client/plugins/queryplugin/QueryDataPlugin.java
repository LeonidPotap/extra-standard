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
package de.extra.client.plugins.queryplugin;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.extra.client.plugins.queryplugin.interfaces.IQueryPluginController;
import de.extrastandard.api.model.content.IInputDataContainer;
import de.extrastandard.api.plugin.IDataPlugin;

/**
 * @deprecated
 * 
 *             Wird nicht mehr verwendet.
 * 
 */
// @Named("queryDataPlugin")
public class QueryDataPlugin implements IDataPlugin {

	private static final Logger LOG = LoggerFactory
			.getLogger(QueryDataPlugin.class);

	@Inject
	@Named("queryPluginController")
	private IQueryPluginController queryController;

	@Override
	public IInputDataContainer getData() {
		LOG.info("Start des Versands");
		LOG.debug("Erstelle Query");
		return queryController.getData();
	}

	@Override
	public boolean hasMoreData() {
		return queryController.hasMoreData();
	}

	@Override
	public boolean isEmpty() {
		return queryController.isEmpty();
	}
}
