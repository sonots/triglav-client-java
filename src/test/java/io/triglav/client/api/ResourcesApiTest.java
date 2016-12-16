/**
 * Triglav API
 * Triglav API Reference
 *
 * OpenAPI spec version: 1.0.0
 * Contact: triglav_admin_my@dena.jp
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.triglav.client.api;

import io.triglav.client.ApiException;
import io.triglav.client.ResourceResponse;
import io.triglav.client.ErrorModel;
import io.triglav.client.ResourceRequest;
import io.triglav.client.AggregatedResourceEachResponse;
import io.triglav.client.ResourceEachResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourcesApi
 */
public class ResourcesApiTest {

    private final ResourcesApi api = new ResourcesApi();

    
    /**
     * 
     *
     * Creates a new resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createResourceTest() throws ApiException {
        ResourceRequest resource = null;
        // ResourceResponse response = api.createResource(resource);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes single resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteResourceTest() throws ApiException {
        String idOrUri = null;
        // api.deleteResource(idOrUri);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a single resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResourceTest() throws ApiException {
        String idOrUri = null;
        // ResourceResponse response = api.getResource(idOrUri);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns aggregated resources to be monitored
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAggregatedResourcesTest() throws ApiException {
        String uriPrefix = null;
        // List<AggregatedResourceEachResponse> response = api.listAggregatedResources(uriPrefix);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listResourcesTest() throws ApiException {
        String uriPrefix = null;
        // List<ResourceEachResponse> response = api.listResources(uriPrefix);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates a single resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateResourceTest() throws ApiException {
        String idOrUri = null;
        ResourceRequest resource = null;
        // ResourceResponse response = api.updateResource(idOrUri, resource);

        // TODO: test validations
    }
    
}
