package org.apache.maven.plugins.surefire.report;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.maven.doxia.siterenderer.Renderer;
import org.apache.maven.model.ReportPlugin;
import org.apache.maven.project.MavenProject;
import org.apache.maven.reporting.AbstractMavenReport;
import org.apache.maven.reporting.MavenReportException;
import org.codehaus.plexus.util.PathTool;
import org.codehaus.plexus.util.StringUtils;


/**
 * Creates a nicely formatted Surefire Test Report in html format.
 *
 * @author <a href="mailto:jruiz@exist.com">Johnny R. Ruiz III</a>
 * @version $Id: SurefireReportMojo.java 1144289 2011-07-08 12:39:32Z stephenc $
 * @goal report
 * @execute phase="test" lifecycle="surefire"
 */
public class SurefireReportMojo
    extends AbstractSurefireReportMojo
{

    /**
     * The filename to use for the report.
     *
     * @parameter expression="${outputName}" default-value="surefire-report"
     * @required
     * @noinspection UnusedDeclaration
     */
    private String outputName;

    protected File getSurefireReportsDirectory( MavenProject subProject )
    {
        String buildDir = subProject.getBuild().getDirectory();
        return new File( buildDir + "/surefire-reports" );
    }

    public String getOutputName()
    {
        return outputName;
    }

}
