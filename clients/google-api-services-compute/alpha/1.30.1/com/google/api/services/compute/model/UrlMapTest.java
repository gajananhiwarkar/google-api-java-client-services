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
 * Message for the expected URL mappings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlMapTest extends com.google.api.client.json.GenericJson {

  /**
   * The weight to use for the supplied host and path when using advanced routing rules that involve
   * traffic splitting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long backendServiceWeight;

  /**
   * Description of this test case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The expected URL that should be redirected to for the host and path being tested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expectedUrlRedirect;

  /**
   * Host portion of the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Path portion of the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Expected BackendService resource the given URL should be mapped to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * The weight to use for the supplied host and path when using advanced routing rules that involve
   * traffic splitting.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBackendServiceWeight() {
    return backendServiceWeight;
  }

  /**
   * The weight to use for the supplied host and path when using advanced routing rules that involve
   * traffic splitting.
   * @param backendServiceWeight backendServiceWeight or {@code null} for none
   */
  public UrlMapTest setBackendServiceWeight(java.lang.Long backendServiceWeight) {
    this.backendServiceWeight = backendServiceWeight;
    return this;
  }

  /**
   * Description of this test case.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of this test case.
   * @param description description or {@code null} for none
   */
  public UrlMapTest setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The expected URL that should be redirected to for the host and path being tested.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpectedUrlRedirect() {
    return expectedUrlRedirect;
  }

  /**
   * The expected URL that should be redirected to for the host and path being tested.
   * @param expectedUrlRedirect expectedUrlRedirect or {@code null} for none
   */
  public UrlMapTest setExpectedUrlRedirect(java.lang.String expectedUrlRedirect) {
    this.expectedUrlRedirect = expectedUrlRedirect;
    return this;
  }

  /**
   * Host portion of the URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Host portion of the URL.
   * @param host host or {@code null} for none
   */
  public UrlMapTest setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Path portion of the URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * Path portion of the URL.
   * @param path path or {@code null} for none
   */
  public UrlMapTest setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Expected BackendService resource the given URL should be mapped to.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Expected BackendService resource the given URL should be mapped to.
   * @param service service or {@code null} for none
   */
  public UrlMapTest setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public UrlMapTest set(String fieldName, Object value) {
    return (UrlMapTest) super.set(fieldName, value);
  }

  @Override
  public UrlMapTest clone() {
    return (UrlMapTest) super.clone();
  }

}
