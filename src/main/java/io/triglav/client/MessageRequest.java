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
 * MessageRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T10:59:36.226+09:00")
public class MessageRequest   {
  @SerializedName("resource_uri")
  private String resourceUri = null;

  @SerializedName("resource_unit")
  private String resourceUnit = null;

  @SerializedName("resource_time")
  private Integer resourceTime = null;

  @SerializedName("resource_timezone")
  private String resourceTimezone = null;

  @SerializedName("payload")
  private String payload = null;

  public MessageRequest resourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * URI of Resource
   * @return resourceUri
  **/
  @ApiModelProperty(example = "null", required = true, value = "URI of Resource")
  public String getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }

  public MessageRequest resourceUnit(String resourceUnit) {
    this.resourceUnit = resourceUnit;
    return this;
  }

   /**
   * Time unit of resource to monitor such as daily, or hourly
   * @return resourceUnit
  **/
  @ApiModelProperty(example = "null", required = true, value = "Time unit of resource to monitor such as daily, or hourly")
  public String getResourceUnit() {
    return resourceUnit;
  }

  public void setResourceUnit(String resourceUnit) {
    this.resourceUnit = resourceUnit;
  }

  public MessageRequest resourceTime(Integer resourceTime) {
    this.resourceTime = resourceTime;
    return this;
  }

   /**
   * Time of Resource in unix timestamp such as 1476025200 (2016-10-10 in +09:00)
   * @return resourceTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "Time of Resource in unix timestamp such as 1476025200 (2016-10-10 in +09:00)")
  public Integer getResourceTime() {
    return resourceTime;
  }

  public void setResourceTime(Integer resourceTime) {
    this.resourceTime = resourceTime;
  }

  public MessageRequest resourceTimezone(String resourceTimezone) {
    this.resourceTimezone = resourceTimezone;
    return this;
  }

   /**
   * Timezone of resource time, that is, timezone of %Y-%m-%d for hdfs://path/to/%Y-%m-%d such as +09:00
   * @return resourceTimezone
  **/
  @ApiModelProperty(example = "null", required = true, value = "Timezone of resource time, that is, timezone of %Y-%m-%d for hdfs://path/to/%Y-%m-%d such as +09:00")
  public String getResourceTimezone() {
    return resourceTimezone;
  }

  public void setResourceTimezone(String resourceTimezone) {
    this.resourceTimezone = resourceTimezone;
  }

  public MessageRequest payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Any json string
   * @return payload
  **/
  @ApiModelProperty(example = "null", value = "Any json string")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRequest messageRequest = (MessageRequest) o;
    return Objects.equals(this.resourceUri, messageRequest.resourceUri) &&
        Objects.equals(this.resourceUnit, messageRequest.resourceUnit) &&
        Objects.equals(this.resourceTime, messageRequest.resourceTime) &&
        Objects.equals(this.resourceTimezone, messageRequest.resourceTimezone) &&
        Objects.equals(this.payload, messageRequest.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceUri, resourceUnit, resourceTime, resourceTimezone, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRequest {\n");
    
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    resourceUnit: ").append(toIndentedString(resourceUnit)).append("\n");
    sb.append("    resourceTime: ").append(toIndentedString(resourceTime)).append("\n");
    sb.append("    resourceTimezone: ").append(toIndentedString(resourceTimezone)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

