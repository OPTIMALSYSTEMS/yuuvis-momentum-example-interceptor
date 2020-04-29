/*
 * Copyright 2020 OPTIMAL SYSTEMS GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.os.services.interceptor.domain;


public class Pages
{

    private int startPage;
    private int endPage;
    
    
    public Pages(int startPage, int endPage)
    {
        this.startPage = startPage;
        this.endPage = endPage;
    }


    public int getStartPage()
    {
        return startPage;
    }


    public int getEndPage()
    {
        return endPage;
    }
    
}
