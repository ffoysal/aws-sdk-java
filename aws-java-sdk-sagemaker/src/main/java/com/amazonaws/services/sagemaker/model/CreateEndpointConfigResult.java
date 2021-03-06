/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     */
    private String endpointConfigArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigArn
     *        The Amazon Resource Name (ARN) of the endpoint configuration.
     */

    public void setEndpointConfigArn(String endpointConfigArn) {
        this.endpointConfigArn = endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint configuration.
     */

    public String getEndpointConfigArn() {
        return this.endpointConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint configuration.
     * </p>
     * 
     * @param endpointConfigArn
     *        The Amazon Resource Name (ARN) of the endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointConfigResult withEndpointConfigArn(String endpointConfigArn) {
        setEndpointConfigArn(endpointConfigArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointConfigArn() != null)
            sb.append("EndpointConfigArn: ").append(getEndpointConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointConfigResult == false)
            return false;
        CreateEndpointConfigResult other = (CreateEndpointConfigResult) obj;
        if (other.getEndpointConfigArn() == null ^ this.getEndpointConfigArn() == null)
            return false;
        if (other.getEndpointConfigArn() != null && other.getEndpointConfigArn().equals(this.getEndpointConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointConfigArn() == null) ? 0 : getEndpointConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointConfigResult clone() {
        try {
            return (CreateEndpointConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
