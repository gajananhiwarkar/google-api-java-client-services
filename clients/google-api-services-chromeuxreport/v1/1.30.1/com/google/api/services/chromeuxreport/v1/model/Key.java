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

package com.google.api.services.chromeuxreport.v1.model;

/**
 * Key defines all the dimensions that identify this record as unique.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome UX Report API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Key extends com.google.api.client.json.GenericJson {

  /**
   * The effective connection type is the general connection class that all users experienced for
   * this record. This field uses the values ["offline", "slow-2G", "2G", "3G", "4G"] as specified
   * in: https://wicg.github.io/netinfo/#effective-connection-types If the effective connection type
   * is unspecified, then aggregated data over all effective connection types will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String effectiveConnectionType;

  /**
   * The form factor is the device class that all users used to access the site for this record. If
   * the form factor is unspecified, then aggregated data over all form factors will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formFactor;

  /**
   * Origin specifies the origin that this record is for. Note: When specifying an origin, data for
   * loads under this origin over all pages are aggregated into origin level user experience data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String origin;

  /**
   * Url specifies a specific url that this record is for. Note: When specifying a "url" only data
   * for that specific url will be aggregated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The effective connection type is the general connection class that all users experienced for
   * this record. This field uses the values ["offline", "slow-2G", "2G", "3G", "4G"] as specified
   * in: https://wicg.github.io/netinfo/#effective-connection-types If the effective connection type
   * is unspecified, then aggregated data over all effective connection types will be returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getEffectiveConnectionType() {
    return effectiveConnectionType;
  }

  /**
   * The effective connection type is the general connection class that all users experienced for
   * this record. This field uses the values ["offline", "slow-2G", "2G", "3G", "4G"] as specified
   * in: https://wicg.github.io/netinfo/#effective-connection-types If the effective connection type
   * is unspecified, then aggregated data over all effective connection types will be returned.
   * @param effectiveConnectionType effectiveConnectionType or {@code null} for none
   */
  public Key setEffectiveConnectionType(java.lang.String effectiveConnectionType) {
    this.effectiveConnectionType = effectiveConnectionType;
    return this;
  }

  /**
   * The form factor is the device class that all users used to access the site for this record. If
   * the form factor is unspecified, then aggregated data over all form factors will be returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormFactor() {
    return formFactor;
  }

  /**
   * The form factor is the device class that all users used to access the site for this record. If
   * the form factor is unspecified, then aggregated data over all form factors will be returned.
   * @param formFactor formFactor or {@code null} for none
   */
  public Key setFormFactor(java.lang.String formFactor) {
    this.formFactor = formFactor;
    return this;
  }

  /**
   * Origin specifies the origin that this record is for. Note: When specifying an origin, data for
   * loads under this origin over all pages are aggregated into origin level user experience data.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrigin() {
    return origin;
  }

  /**
   * Origin specifies the origin that this record is for. Note: When specifying an origin, data for
   * loads under this origin over all pages are aggregated into origin level user experience data.
   * @param origin origin or {@code null} for none
   */
  public Key setOrigin(java.lang.String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Url specifies a specific url that this record is for. Note: When specifying a "url" only data
   * for that specific url will be aggregated.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Url specifies a specific url that this record is for. Note: When specifying a "url" only data
   * for that specific url will be aggregated.
   * @param url url or {@code null} for none
   */
  public Key setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public Key set(String fieldName, Object value) {
    return (Key) super.set(fieldName, value);
  }

  @Override
  public Key clone() {
    return (Key) super.clone();
  }

}
