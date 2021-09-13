/*
 *     Copyright 2021 ujar Knowledge Base @ http://ujar.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ujar.learn.howto.simply.parsejson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Parser {

    public static void main(String [] args)
    {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person user = mapper.readValue("{\"name\": \"John\"}", Person.class);
            System.out.println(user.getName()); //John
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
}
