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
import io.triglav.client.ClusterInput;
import io.triglav.client.Cluster;
import io.triglav.client.ErrorModel;
import io.triglav.client.ClusterEach;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClustersApi
 */
public class ClustersApiTest {

    private final ClustersApi api = new ClustersApi();

    
    /**
     * 
     *
     * Creates a new cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClusterTest() throws ApiException {
        ClusterInput cluster = null;
        // Cluster response = api.createCluster(cluster);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes single cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClusterTest() throws ApiException {
        String idOrName = null;
        // api.deleteCluster(idOrName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a single cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClusterTest() throws ApiException {
        String idOrName = null;
        // Cluster response = api.getCluster(idOrName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all clusters from the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClustersTest() throws ApiException {
        // List<ClusterEach> response = api.listClusters();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates a single cluster
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateClusterTest() throws ApiException {
        String idOrName = null;
        ClusterInput cluster = null;
        // Cluster response = api.updateCluster(idOrName, cluster);

        // TODO: test validations
    }
    
}
