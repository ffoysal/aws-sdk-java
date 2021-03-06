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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetGraphqlApi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGraphqlApiResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>GraphqlApi</code> object.
     * </p>
     */
    private GraphqlApi graphqlApi;

    /**
     * <p>
     * The <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param graphqlApi
     *        The <code>GraphqlApi</code> object.
     */

    public void setGraphqlApi(GraphqlApi graphqlApi) {
        this.graphqlApi = graphqlApi;
    }

    /**
     * <p>
     * The <code>GraphqlApi</code> object.
     * </p>
     * 
     * @return The <code>GraphqlApi</code> object.
     */

    public GraphqlApi getGraphqlApi() {
        return this.graphqlApi;
    }

    /**
     * <p>
     * The <code>GraphqlApi</code> object.
     * </p>
     * 
     * @param graphqlApi
     *        The <code>GraphqlApi</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGraphqlApiResult withGraphqlApi(GraphqlApi graphqlApi) {
        setGraphqlApi(graphqlApi);
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
        if (getGraphqlApi() != null)
            sb.append("GraphqlApi: ").append(getGraphqlApi());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGraphqlApiResult == false)
            return false;
        GetGraphqlApiResult other = (GetGraphqlApiResult) obj;
        if (other.getGraphqlApi() == null ^ this.getGraphqlApi() == null)
            return false;
        if (other.getGraphqlApi() != null && other.getGraphqlApi().equals(this.getGraphqlApi()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphqlApi() == null) ? 0 : getGraphqlApi().hashCode());
        return hashCode;
    }

    @Override
    public GetGraphqlApiResult clone() {
        try {
            return (GetGraphqlApiResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
