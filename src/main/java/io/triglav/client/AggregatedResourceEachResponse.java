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
 * AggregatedResourceEachResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-10T17:49:25.554+09:00")
public class AggregatedResourceEachResponse   {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("span_in_days")
  private Integer spanInDays = null;

  public AggregatedResourceEachResponse uri(String uri) {
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

  public AggregatedResourceEachResponse unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * 'singular' or 'daily' or 'hourly', or their combinations such as 'daily,hourly', 'daily,hourly,singular'
   * @return unit
  **/
  @ApiModelProperty(example = "null", value = "'singular' or 'daily' or 'hourly', or their combinations such as 'daily,hourly', 'daily,hourly,singular'")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public AggregatedResourceEachResponse timezone(String timezone) {
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

  public AggregatedResourceEachResponse spanInDays(Integer spanInDays) {
    this.spanInDays = spanInDays;
    return this;
  }

   /**
   * span in days
   * @return spanInDays
  **/
  @ApiModelProperty(example = "null", value = "span in days")
  public Integer getSpanInDays() {
    return spanInDays;
  }

  public void setSpanInDays(Integer spanInDays) {
    this.spanInDays = spanInDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregatedResourceEachResponse aggregatedResourceEachResponse = (AggregatedResourceEachResponse) o;
    return Objects.equals(this.uri, aggregatedResourceEachResponse.uri) &&
        Objects.equals(this.unit, aggregatedResourceEachResponse.unit) &&
        Objects.equals(this.timezone, aggregatedResourceEachResponse.timezone) &&
        Objects.equals(this.spanInDays, aggregatedResourceEachResponse.spanInDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, unit, timezone, spanInDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedResourceEachResponse {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    spanInDays: ").append(toIndentedString(spanInDays)).append("\n");
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

