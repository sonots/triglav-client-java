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
import io.triglav.client.JobRequest;
import io.triglav.client.ResourceResponse;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


/**
 * JobResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-20T12:17:01.839+09:00")
public class JobResponse   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("logical_op")
  private String logicalOp = null;

  @SerializedName("input_resources")
  private List<ResourceResponse> inputResources = new ArrayList<ResourceResponse>();

  @SerializedName("output_resources")
  private List<ResourceResponse> outputResources = new ArrayList<ResourceResponse>();

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public JobResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JobResponse uri(String uri) {
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

  public JobResponse logicalOp(String logicalOp) {
    this.logicalOp = logicalOp;
    return this;
  }

   /**
   * Get logicalOp
   * @return logicalOp
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLogicalOp() {
    return logicalOp;
  }

  public void setLogicalOp(String logicalOp) {
    this.logicalOp = logicalOp;
  }

  public JobResponse inputResources(List<ResourceResponse> inputResources) {
    this.inputResources = inputResources;
    return this;
  }

   /**
   * Input resources
   * @return inputResources
  **/
  @ApiModelProperty(example = "null", value = "Input resources")
  public List<ResourceResponse> getInputResources() {
    return inputResources;
  }

  public void setInputResources(List<ResourceResponse> inputResources) {
    this.inputResources = inputResources;
  }

  public JobResponse outputResources(List<ResourceResponse> outputResources) {
    this.outputResources = outputResources;
    return this;
  }

   /**
   * Output resources
   * @return outputResources
  **/
  @ApiModelProperty(example = "null", value = "Output resources")
  public List<ResourceResponse> getOutputResources() {
    return outputResources;
  }

  public void setOutputResources(List<ResourceResponse> outputResources) {
    this.outputResources = outputResources;
  }

  public JobResponse createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public JobResponse updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.id, jobResponse.id) &&
        Objects.equals(this.uri, jobResponse.uri) &&
        Objects.equals(this.logicalOp, jobResponse.logicalOp) &&
        Objects.equals(this.inputResources, jobResponse.inputResources) &&
        Objects.equals(this.outputResources, jobResponse.outputResources) &&
        Objects.equals(this.createdAt, jobResponse.createdAt) &&
        Objects.equals(this.updatedAt, jobResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, logicalOp, inputResources, outputResources, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    logicalOp: ").append(toIndentedString(logicalOp)).append("\n");
    sb.append("    inputResources: ").append(toIndentedString(inputResources)).append("\n");
    sb.append("    outputResources: ").append(toIndentedString(outputResources)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

