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


package io.triglav.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.triglav.client.ResourceRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * JobRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-13T12:22:07.411+09:00")
public class JobRequest   {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("contact_id")
  private Integer contactId = null;

  @SerializedName("input_resources")
  private List<ResourceRequest> inputResources = new ArrayList<ResourceRequest>();

  @SerializedName("output_resources")
  private List<ResourceRequest> outputResources = new ArrayList<ResourceRequest>();

  public JobRequest uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public JobRequest contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public JobRequest inputResources(List<ResourceRequest> inputResources) {
    this.inputResources = inputResources;
    return this;
  }

   /**
   * New resources are created if it does not exit. Need to use Resource API to update
   * @return inputResources
  **/
  @ApiModelProperty(example = "null", value = "New resources are created if it does not exit. Need to use Resource API to update")
  public List<ResourceRequest> getInputResources() {
    return inputResources;
  }

  public void setInputResources(List<ResourceRequest> inputResources) {
    this.inputResources = inputResources;
  }

  public JobRequest outputResources(List<ResourceRequest> outputResources) {
    this.outputResources = outputResources;
    return this;
  }

   /**
   * New resources are created if it does not exit. Need to use Resource API to update
   * @return outputResources
  **/
  @ApiModelProperty(example = "null", value = "New resources are created if it does not exit. Need to use Resource API to update")
  public List<ResourceRequest> getOutputResources() {
    return outputResources;
  }

  public void setOutputResources(List<ResourceRequest> outputResources) {
    this.outputResources = outputResources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobRequest jobRequest = (JobRequest) o;
    return Objects.equals(this.uri, jobRequest.uri) &&
        Objects.equals(this.contactId, jobRequest.contactId) &&
        Objects.equals(this.inputResources, jobRequest.inputResources) &&
        Objects.equals(this.outputResources, jobRequest.outputResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, contactId, inputResources, outputResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRequest {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    inputResources: ").append(toIndentedString(inputResources)).append("\n");
    sb.append("    outputResources: ").append(toIndentedString(outputResources)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

