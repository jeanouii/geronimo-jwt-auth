/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.microprofile.jwt;

import java.security.Principal;

/**
 * Mark an injection as being lazily evaluated.
 * The content is loaded form the JWT.
 *
 * @param <TYPE> the expected type of the value.
 */
public interface ClaimValue<TYPE> extends Principal {

    /**
     * This is the name of the claim we need an injection for.
     * Check out org.eclipse.microprofile.jwt.Claims for a list of well known claims.
     *
     * @return name of the claim
     */
    @Override
    String getName();

    /**
     * The value of the claim extracted from the JWT for the key defined above.
     *
     * @return the value of the claim
     */
    TYPE getValue();
}
