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
package de.extra.client.plugins.dataplugin;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.inject.Named;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.extra.client.core.annotation.PluginConfigType;
import de.extra.client.core.annotation.PluginConfiguration;
import de.extra.client.core.annotation.PluginValue;
import de.extra.client.core.model.inputdata.impl.ContentInputDataContainer;
import de.extrastandard.api.model.content.IInputDataContainer;
import de.extrastandard.api.plugin.IDataPlugin;

/**
 * @author DPRS
 * @version $Id: FileDataPlugin.java 765 2012-10-16 13:26:30Z
 *          potap.rentenservice@gmail.com $
 */
@Named("fileDataPlugin")
@PluginConfiguration(pluginBeanName = "fileDataPlugin", pluginType = PluginConfigType.DataPlugins)
public class FileDataPlugin implements IDataPlugin {

    private static final Logger logger = LoggerFactory.getLogger(FileDataPlugin.class);

    @PluginValue(key = "inputVerzeichnis")
    private File inputDirectory;

    @PluginValue(key = "inputDataLimit")
    private Integer inputDataLimit;

    private final AtomicBoolean isResultPrepared = new AtomicBoolean(false);

    private Collection<File> inputFiles = new ArrayList<File>();

    private Iterator<File> inputFilesIterator;

    private synchronized void initInputData() {
        if (inputDirectory == null || !inputDirectory.exists() || !inputDirectory.isDirectory())  {
            throw new IllegalArgumentException(String.format("Verzeichnis nicht lesbar: %s", inputDirectory));
        }
        inputFiles = FileUtils.listFiles(inputDirectory, TrueFileFilter.INSTANCE, null);
        inputFilesIterator = inputFiles.iterator();
        logger.info("FileData Plugin instanziiert for Directory: {}. Found {} files", inputDirectory, inputFiles.size());
        isResultPrepared.getAndSet(true);
    }

    @Override
    public boolean hasMoreData() {
        if (!isResultPrepared.get()) {
            initInputData();
        }
        return inputFilesIterator.hasNext();
    }

    @Override
    public IInputDataContainer getData() {
        if (!isResultPrepared.get()) {
            initInputData();
        }
        final ContentInputDataContainer inputDataContainer = new ContentInputDataContainer();
        for (Integer counter = 0; inputFilesIterator.hasNext() && counter < inputDataLimit; counter++) {
            final File inputFile = inputFilesIterator.next();
            inputDataContainer.addSingleInputData(inputFile);
        }
        return inputDataContainer;
    }

    @Override
    public boolean isEmpty() {
        if (!isResultPrepared.get()) {
            initInputData();
        }
        return inputFiles.isEmpty();
    }

    /**
     * @param inputDataLimit
     *            the inputDataLimit to set
     */
    public void setInputDataLimit(final Integer inputDataLimit) {
        this.inputDataLimit = inputDataLimit;
    }

    /**
     * @return the inputDirectory
     */
    public File getInputDirectory() {
        return inputDirectory;
    }

    /**
     * @param inputDirectory
     *            the inputDirectory to set
     */
    public void setInputDirectory(final File inputDirectory) {
        this.inputDirectory = inputDirectory;
    }

}
