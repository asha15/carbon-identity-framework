/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.core.util;

import org.apache.commons.lang.StringUtils;
import org.wso2.carbon.identity.base.IdentityException;
import org.wso2.carbon.identity.core.util.IdentityKeyStoreResolverConstants.ErrorMessages;

/**
 * Exception type for IdentityKeyStoreManager class.
 */
public class IdentityKeyStoreResolverException extends IdentityException {

    public IdentityKeyStoreResolverException(String message) {

        super(message);
    }

    public IdentityKeyStoreResolverException(String message, Throwable e) {

        super(message, e);
    }

    public IdentityKeyStoreResolverException(String errorCode, String message) {

        super(errorCode, message);
    }

    public IdentityKeyStoreResolverException(String errorCode, String message, Throwable e) {

        super(errorCode, message, e);
    }

    public IdentityKeyStoreResolverException(ErrorMessages errorMessage) {

        super(errorMessage.getCode(), errorMessage.getMessage());
    }

    public IdentityKeyStoreResolverException(ErrorMessages errorMessage, Throwable e) {

        super(errorMessage.getCode(), errorMessage.getMessage(), e);
    }
}
