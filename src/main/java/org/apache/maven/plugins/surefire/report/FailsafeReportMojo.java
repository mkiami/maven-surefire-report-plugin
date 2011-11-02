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

import org.apache.maven.project.MavenProject;

import java.io.File;


/**
 * Creates a nicely formatted Failsafe Test Report in html format.
 * This goal does not run the tests, it only builds the reports.
 * See <a href="http://jira.codehaus.org/browse/SUREFIRE-257">http://jira.codehaus.org/browse/SUREFIRE-257</a>
 *
 * @author Stephen Connolly
 * @version $Id: FailsafeReportMojo.java 1144289 2011-07-08 12:39:32Z stephenc $
 * @goal failsafe-report-only
 * @execute phase="validate" lifecycle="surefire"
 * @since 2.10
 */
public class FailsafeReportMojo
    extends AbstractSurefireReportMojo
{

    /**
     * The filename to use for the report.
     *
     * @parameter expression="${outputName}" default-value="failsafe-report"
     * @required
     * @noinspection UnusedDeclaration
     */
    private String outputName;

    protected File getSurefireReportsDirectory( MavenProject subProject )
    {
        String buildDir = subProject.getBuild().getDirectory();
        return new File( buildDir + "/failsafe-reports" );
    }

    public String getOutputName()
    {
        return outputName;
    }

}
