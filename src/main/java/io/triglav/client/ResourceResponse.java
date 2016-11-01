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
import org.joda.time.DateTime;


/**
 * ResourceResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-02T03:15:25.251+09:00")
public class ResourceResponse   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("span_in_days")
  private Integer spanInDays = null;

  @SerializedName("consumable")
  private Boolean consumable = null;

  @SerializedName("notifiable")
  private Boolean notifiable = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public ResourceResponse id(Long id) {
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

  public ResourceResponse description(String description) {
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

  public ResourceResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * URI of Resource
   * @return uri
  **/
  @ApiModelProperty(example = "null", required = true, value = "URI of Resource")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ResourceResponse unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Time unit of resource to monitor such as daily, or hourly
   * @return unit
  **/
  @ApiModelProperty(example = "null", value = "Time unit of resource to monitor such as daily, or hourly")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ResourceResponse timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone of resource time, that is, timezone of %Y-%m-%d for hdfs://path/to/%Y-%m-%d such as +09:00
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "Timezone of resource time, that is, timezone of %Y-%m-%d for hdfs://path/to/%Y-%m-%d such as +09:00")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ResourceResponse spanInDays(Integer spanInDays) {
    this.spanInDays = spanInDays;
    return this;
  }

   /**
   * Time span of resource to monitor, default is 32
   * @return spanInDays
  **/
  @ApiModelProperty(example = "null", value = "Time span of resource to monitor, default is 32")
  public Integer getSpanInDays() {
    return spanInDays;
  }

  public void setSpanInDays(Integer spanInDays) {
    this.spanInDays = spanInDays;
  }

  public ResourceResponse consumable(Boolean consumable) {
    this.consumable = consumable;
    return this;
  }

   /**
   * True if this resource should be consumed
   * @return consumable
  **/
  @ApiModelProperty(example = "null", value = "True if this resource should be consumed")
  public Boolean getConsumable() {
    return consumable;
  }

  public void setConsumable(Boolean consumable) {
    this.consumable = consumable;
  }

  public ResourceResponse notifiable(Boolean notifiable) {
    this.notifiable = notifiable;
    return this;
  }

   /**
   * True if this resource should be notified, that is, monitor agent is not necessary
   * @return notifiable
  **/
  @ApiModelProperty(example = "null", value = "True if this resource should be notified, that is, monitor agent is not necessary")
  public Boolean getNotifiable() {
    return notifiable;
  }

  public void setNotifiable(Boolean notifiable) {
    this.notifiable = notifiable;
  }

  public ResourceResponse createdAt(DateTime createdAt) {
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

  public ResourceResponse updatedAt(DateTime updatedAt) {
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
    ResourceResponse resourceResponse = (ResourceResponse) o;
    return Objects.equals(this.id, resourceResponse.id) &&
        Objects.equals(this.description, resourceResponse.description) &&
        Objects.equals(this.uri, resourceResponse.uri) &&
        Objects.equals(this.unit, resourceResponse.unit) &&
        Objects.equals(this.timezone, resourceResponse.timezone) &&
        Objects.equals(this.spanInDays, resourceResponse.spanInDays) &&
        Objects.equals(this.consumable, resourceResponse.consumable) &&
        Objects.equals(this.notifiable, resourceResponse.notifiable) &&
        Objects.equals(this.createdAt, resourceResponse.createdAt) &&
        Objects.equals(this.updatedAt, resourceResponse.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, uri, unit, timezone, spanInDays, consumable, notifiable, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    spanInDays: ").append(toIndentedString(spanInDays)).append("\n");
    sb.append("    consumable: ").append(toIndentedString(consumable)).append("\n");
    sb.append("    notifiable: ").append(toIndentedString(notifiable)).append("\n");
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

