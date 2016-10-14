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
import org.joda.time.DateTime;


/**
 * MessageResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-15T01:47:58.977+09:00")
public class MessageResponse   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("resource_uri")
  private String resourceUri = null;

  @SerializedName("datetime")
  private String datetime = null;

  @SerializedName("conditions")
  private String conditions = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public MessageResponse id(Long id) {
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

  public MessageResponse resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * Get resourceUri
   * @return resourceUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }

  public MessageResponse datetime(String datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * Datetime formatted by ISO 8601
   * @return datetime
  **/
  @ApiModelProperty(example = "null", value = "Datetime formatted by ISO 8601")
  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public MessageResponse conditions(String conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConditions() {
    return conditions;
  }

  public void setConditions(String conditions) {
    this.conditions = conditions;
  }

  public MessageResponse payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public MessageResponse createdAt(DateTime createdAt) {
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

  public MessageResponse updatedAt(DateTime updatedAt) {
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
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(this.id, messageResponse.id) &&
        Objects.equals(this.resourceUri, messageResponse.resourceUri) &&
        Objects.equals(this.datetime, messageResponse.datetime) &&
        Objects.equals(this.conditions, messageResponse.conditions) &&
        Objects.equals(this.payload, messageResponse.payload) &&
        Objects.equals(this.createdAt, messageResponse.createdAt) &&
        Objects.equals(this.updatedAt, messageResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceUri, datetime, conditions, payload, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

