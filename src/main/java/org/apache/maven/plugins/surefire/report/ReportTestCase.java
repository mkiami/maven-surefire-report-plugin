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

import java.util.HashMap;
import java.util.Map;

/**
 * @version $Id: ReportTestCase.java 803879 2009-08-13 13:43:01Z vsiveton $
 */
public class ReportTestCase
{
    private String fullClassName;

    private String className;

    private String fullName;

    private String name;

    private float time;

    private Map failure;

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getFullClassName()
    {
        return fullClassName;
    }

    public void setFullClassName( String name )
    {
        this.fullClassName = name;
    }

    public String getClassName()
    {
        return className;
    }

    public void setClassName( String name )
    {
        this.className = name;
    }

    public float getTime()
    {
        return time;
    }

    public void setTime( float time )
    {
        this.time = time;
    }

    public Map getFailure()
    {
        return failure;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName( String fullName )
    {
        this.fullName = fullName;
    }

    public void addFailure( String message, String type )
    {
        failure = new HashMap();
        failure.put( "message", message );
        failure.put( "type", type );
    }

    /** {@inheritDoc} */
    public String toString()
    {
        return fullName;
    }
}
