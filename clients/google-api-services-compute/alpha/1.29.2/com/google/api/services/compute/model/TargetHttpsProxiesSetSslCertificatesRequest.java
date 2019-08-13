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
 * Model definition for TargetHttpsProxiesSetSslCertificatesRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetHttpsProxiesSetSslCertificatesRequest extends com.google.api.client.json.GenericJson {

  /**
   * New set of SslCertificate resources to associate with this TargetHttpsProxy resource. Currently
   * exactly one SslCertificate resource must be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sslCertificates;

  /**
   * New set of SslCertificate resources to associate with this TargetHttpsProxy resource. Currently
   * exactly one SslCertificate resource must be specified.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSslCertificates() {
    return sslCertificates;
  }

  /**
   * New set of SslCertificate resources to associate with this TargetHttpsProxy resource. Currently
   * exactly one SslCertificate resource must be specified.
   * @param sslCertificates sslCertificates or {@code null} for none
   */
  public TargetHttpsProxiesSetSslCertificatesRequest setSslCertificates(java.util.List<java.lang.String> sslCertificates) {
    this.sslCertificates = sslCertificates;
    return this;
  }

  @Override
  public TargetHttpsProxiesSetSslCertificatesRequest set(String fieldName, Object value) {
    return (TargetHttpsProxiesSetSslCertificatesRequest) super.set(fieldName, value);
  }

  @Override
  public TargetHttpsProxiesSetSslCertificatesRequest clone() {
    return (TargetHttpsProxiesSetSslCertificatesRequest) super.clone();
  }

}
