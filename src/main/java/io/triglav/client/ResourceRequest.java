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


/**
 * ResourceRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-13T12:22:07.411+09:00")
public class ResourceRequest   {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("cluster_name")
  private String clusterName = null;

  @SerializedName("consumable")
  private Boolean consumable = null;

  @SerializedName("notifiable")
  private Boolean notifiable = null;

  public ResourceRequest uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ResourceRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResourceRequest clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Get clusterName
   * @return clusterName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public ResourceRequest consumable(Boolean consumable) {
    this.consumable = consumable;
    return this;
  }

   /**
   * Get consumable
   * @return consumable
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getConsumable() {
    return consumable;
  }

  public void setConsumable(Boolean consumable) {
    this.consumable = consumable;
  }

  public ResourceRequest notifiable(Boolean notifiable) {
    this.notifiable = notifiable;
    return this;
  }

   /**
   * Get notifiable
   * @return notifiable
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getNotifiable() {
    return notifiable;
  }

  public void setNotifiable(Boolean notifiable) {
    this.notifiable = notifiable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceRequest resourceRequest = (ResourceRequest) o;
    return Objects.equals(this.uri, resourceRequest.uri) &&
        Objects.equals(this.description, resourceRequest.description) &&
        Objects.equals(this.clusterName, resourceRequest.clusterName) &&
        Objects.equals(this.consumable, resourceRequest.consumable) &&
        Objects.equals(this.notifiable, resourceRequest.notifiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, description, clusterName, consumable, notifiable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRequest {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    consumable: ").append(toIndentedString(consumable)).append("\n");
    sb.append("    notifiable: ").append(toIndentedString(notifiable)).append("\n");
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

