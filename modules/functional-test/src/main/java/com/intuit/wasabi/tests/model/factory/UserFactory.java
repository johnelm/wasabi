/*******************************************************************************
 * Copyright 2016 Intuit
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
 *******************************************************************************/
package com.intuit.wasabi.tests.model.factory;

import com.google.gson.GsonBuilder;
import com.intuit.wasabi.tests.library.util.Constants;
import com.intuit.wasabi.tests.model.User;

/**
 * A factory for Users.
 */
public class UserFactory {

    /**
     * Only used to create unique User labels.
     */
    private static int internalId = 0;

    /**
     * Creates a basic User with the required default values.
     *
     * @return a default User.
     */
    public static User createUser() {
        return createUser(Constants.DEFAULT_PREFIX_USER + internalId++);
    }

    /**
     * Creates a user with a name. The name is prefixed.
     * @param name the username
     * @return the created user
     */
    public static User createUser(String name) {
        return new User(name);
    }

    /**
     * Creates an User from a JSON String.
     *
     * @param json the JSON String.
     * @return an User represented by the JSON String.
     */
    public static User createFromJSONString(String json) {
        return new GsonBuilder().create().fromJson(json, User.class);
    }
}
