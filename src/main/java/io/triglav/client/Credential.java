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
 * Credential
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-04T14:47:11.528+09:00")
public class Credential   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("password")
  private String password = null;

  /**
   * Gets or Sets authenticator
   */
  public enum AuthenticatorEnum {
    @SerializedName("local")
    LOCAL("local"),
    
    @SerializedName("ldap")
    LDAP("ldap");

    private String value;

    AuthenticatorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("authenticator")
  private AuthenticatorEnum authenticator = null;

  public Credential name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Credential password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Credential authenticator(AuthenticatorEnum authenticator) {
    this.authenticator = authenticator;
    return this;
  }

   /**
   * Get authenticator
   * @return authenticator
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public AuthenticatorEnum getAuthenticator() {
    return authenticator;
  }

  public void setAuthenticator(AuthenticatorEnum authenticator) {
    this.authenticator = authenticator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    return Objects.equals(this.name, credential.name) &&
        Objects.equals(this.password, credential.password) &&
        Objects.equals(this.authenticator, credential.authenticator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, authenticator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authenticator: ").append(toIndentedString(authenticator)).append("\n");
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

