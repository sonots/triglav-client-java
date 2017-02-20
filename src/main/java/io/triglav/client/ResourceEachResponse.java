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
import io.triglav.client.AggregatedResourceEachResponse;


/**
 * ResourceEachResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-20T12:17:01.839+09:00")
public class ResourceEachResponse   {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("span_in_days")
  private Long spanInDays = null;

  @SerializedName("consumable")
  private Boolean consumable = null;

  @SerializedName("notifiable")
  private Boolean notifiable = null;

  public ResourceEachResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * resource uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "resource uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ResourceEachResponse unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * 'singualr' or 'daily' or 'hourly'
   * @return unit
  **/
  @ApiModelProperty(example = "null", value = "'singualr' or 'daily' or 'hourly'")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ResourceEachResponse timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * timezone of the format [+-]HH:MM
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "timezone of the format [+-]HH:MM")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ResourceEachResponse spanInDays(Long spanInDays) {
    this.spanInDays = spanInDays;
    return this;
  }

   /**
   * span in days
   * @return spanInDays
  **/
  @ApiModelProperty(example = "null", value = "span in days")
  public Long getSpanInDays() {
    return spanInDays;
  }

  public void setSpanInDays(Long spanInDays) {
    this.spanInDays = spanInDays;
  }

  public ResourceEachResponse consumable(Boolean consumable) {
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

  public ResourceEachResponse notifiable(Boolean notifiable) {
    this.notifiable = notifiable;
    return this;
  }

   /**
   * True if a job notifies its end of task to triglav for this resource, that is, monitoring in agent is not necessary
   * @return notifiable
  **/
  @ApiModelProperty(example = "null", value = "True if a job notifies its end of task to triglav for this resource, that is, monitoring in agent is not necessary")
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
    ResourceEachResponse resourceEachResponse = (ResourceEachResponse) o;
    return Objects.equals(this.uri, resourceEachResponse.uri) &&
        Objects.equals(this.unit, resourceEachResponse.unit) &&
        Objects.equals(this.timezone, resourceEachResponse.timezone) &&
        Objects.equals(this.spanInDays, resourceEachResponse.spanInDays) &&
        Objects.equals(this.consumable, resourceEachResponse.consumable) &&
        Objects.equals(this.notifiable, resourceEachResponse.notifiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, unit, timezone, spanInDays, consumable, notifiable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceEachResponse {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    spanInDays: ").append(toIndentedString(spanInDays)).append("\n");
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

