
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

package com.os.services.interceptor.rest;

import com.os.services.interceptor.pdfextractor.PdfPageSelectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PdfPageSelectorRestController
{
    @Autowired
    private PdfPageSelectorService pdfPageSelectorService;

   
    @PostMapping(value = "/dms/objects/{objectId}", headers = "content-type=application/json")
    public void getContentByPostRequest(@RequestBody Map<String, Object> dmsApiObjectList,
                                        @PathVariable("objectId") String objectId,
                                        @RequestHeader(value = "Authorization", required = false) String authorization,
                                        HttpServletRequest servletRequest,
                                        HttpServletResponse servletResponse) throws IOException
    {
        
        servletResponse.setContentType(MediaType.APPLICATION_PDF_VALUE);
        pdfPageSelectorService.extract(servletResponse.getOutputStream(), dmsApiObjectList, objectId, authorization);

    }

}
