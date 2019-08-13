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
 * Configuration for the mutual Tls mode for peer authentication.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MutualTls extends com.google.api.client.json.GenericJson {

  /**
   * Specifies if the server TLS is configured to be strict or permissive. This field can be set to
   * one of the following: STRICT: Client certificate must be presented, connection is in TLS.
   * PERMISSIVE: Client certificate can be omitted, connection can be either plaintext or TLS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * Specifies if the server TLS is configured to be strict or permissive. This field can be set to
   * one of the following: STRICT: Client certificate must be presented, connection is in TLS.
   * PERMISSIVE: Client certificate can be omitted, connection can be either plaintext or TLS.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * Specifies if the server TLS is configured to be strict or permissive. This field can be set to
   * one of the following: STRICT: Client certificate must be presented, connection is in TLS.
   * PERMISSIVE: Client certificate can be omitted, connection can be either plaintext or TLS.
   * @param mode mode or {@code null} for none
   */
  public MutualTls setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  @Override
  public MutualTls set(String fieldName, Object value) {
    return (MutualTls) super.set(fieldName, value);
  }

  @Override
  public MutualTls clone() {
    return (MutualTls) super.clone();
  }

}
