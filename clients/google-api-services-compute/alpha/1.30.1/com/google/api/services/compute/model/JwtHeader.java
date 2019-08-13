/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * This message specifies a header location to extract JWT token.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JwtHeader extends com.google.api.client.json.GenericJson {

  /**
   * The HTTP header name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value prefix. The value format is "value_prefix" For example, for "Authorization: Bearer ",
   * value_prefix="Bearer " with a space at the end.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valuePrefix;

  /**
   * The HTTP header name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The HTTP header name.
   * @param name name or {@code null} for none
   */
  public JwtHeader setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The value prefix. The value format is "value_prefix" For example, for "Authorization: Bearer ",
   * value_prefix="Bearer " with a space at the end.
   * @return value or {@code null} for none
   */
  public java.lang.String getValuePrefix() {
    return valuePrefix;
  }

  /**
   * The value prefix. The value format is "value_prefix" For example, for "Authorization: Bearer ",
   * value_prefix="Bearer " with a space at the end.
   * @param valuePrefix valuePrefix or {@code null} for none
   */
  public JwtHeader setValuePrefix(java.lang.String valuePrefix) {
    this.valuePrefix = valuePrefix;
    return this;
  }

  @Override
  public JwtHeader set(String fieldName, Object value) {
    return (JwtHeader) super.set(fieldName, value);
  }

  @Override
  public JwtHeader clone() {
    return (JwtHeader) super.clone();
  }

}
