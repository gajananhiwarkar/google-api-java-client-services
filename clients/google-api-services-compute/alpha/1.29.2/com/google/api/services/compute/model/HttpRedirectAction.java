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
 * Specifies settings for an HTTP redirect.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRedirectAction extends com.google.api.client.json.GenericJson {

  /**
   * The host that will be used in the redirect response instead of the one that was supplied in the
   * request. The value must be between 1 and 255 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostRedirect;

  /**
   * If set to true, the URL scheme in the redirected request is set to https. If set to false, the
   * URL scheme of the redirected request will remain the same as that of the request. This must
   * only be set for UrlMaps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not
   * permitted. The default is set to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean httpsRedirect;

  /**
   * The path that will be used in the redirect response instead of the one that was supplied in the
   * request. Only one of pathRedirect or prefixRedirect must be specified. The value must be
   * between 1 and 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pathRedirect;

  /**
   * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the
   * remaining portion of the URL before redirecting the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prefixRedirect;

  /**
   * The HTTP Status code to use for this RedirectAction. Supported values are:   -
   * MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.  - FOUND, which
   * corresponds to 302.  - SEE_OTHER which corresponds to 303.  - TEMPORARY_REDIRECT, which
   * corresponds to 307. In this case, the request method will be retained.  - PERMANENT_REDIRECT,
   * which corresponds to 308. In this case, the request method will be retained.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redirectResponseCode;

  /**
   * If set to true, any accompanying query portion of the original URL is removed prior to
   * redirecting the request. If set to false, the query portion of the original URL is retained.
   * The default is set to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean stripQuery;

  /**
   * The host that will be used in the redirect response instead of the one that was supplied in the
   * request. The value must be between 1 and 255 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostRedirect() {
    return hostRedirect;
  }

  /**
   * The host that will be used in the redirect response instead of the one that was supplied in the
   * request. The value must be between 1 and 255 characters.
   * @param hostRedirect hostRedirect or {@code null} for none
   */
  public HttpRedirectAction setHostRedirect(java.lang.String hostRedirect) {
    this.hostRedirect = hostRedirect;
    return this;
  }

  /**
   * If set to true, the URL scheme in the redirected request is set to https. If set to false, the
   * URL scheme of the redirected request will remain the same as that of the request. This must
   * only be set for UrlMaps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not
   * permitted. The default is set to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHttpsRedirect() {
    return httpsRedirect;
  }

  /**
   * If set to true, the URL scheme in the redirected request is set to https. If set to false, the
   * URL scheme of the redirected request will remain the same as that of the request. This must
   * only be set for UrlMaps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not
   * permitted. The default is set to false.
   * @param httpsRedirect httpsRedirect or {@code null} for none
   */
  public HttpRedirectAction setHttpsRedirect(java.lang.Boolean httpsRedirect) {
    this.httpsRedirect = httpsRedirect;
    return this;
  }

  /**
   * The path that will be used in the redirect response instead of the one that was supplied in the
   * request. Only one of pathRedirect or prefixRedirect must be specified. The value must be
   * between 1 and 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getPathRedirect() {
    return pathRedirect;
  }

  /**
   * The path that will be used in the redirect response instead of the one that was supplied in the
   * request. Only one of pathRedirect or prefixRedirect must be specified. The value must be
   * between 1 and 1024 characters.
   * @param pathRedirect pathRedirect or {@code null} for none
   */
  public HttpRedirectAction setPathRedirect(java.lang.String pathRedirect) {
    this.pathRedirect = pathRedirect;
    return this;
  }

  /**
   * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the
   * remaining portion of the URL before redirecting the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrefixRedirect() {
    return prefixRedirect;
  }

  /**
   * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the
   * remaining portion of the URL before redirecting the request.
   * @param prefixRedirect prefixRedirect or {@code null} for none
   */
  public HttpRedirectAction setPrefixRedirect(java.lang.String prefixRedirect) {
    this.prefixRedirect = prefixRedirect;
    return this;
  }

  /**
   * The HTTP Status code to use for this RedirectAction. Supported values are:   -
   * MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.  - FOUND, which
   * corresponds to 302.  - SEE_OTHER which corresponds to 303.  - TEMPORARY_REDIRECT, which
   * corresponds to 307. In this case, the request method will be retained.  - PERMANENT_REDIRECT,
   * which corresponds to 308. In this case, the request method will be retained.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedirectResponseCode() {
    return redirectResponseCode;
  }

  /**
   * The HTTP Status code to use for this RedirectAction. Supported values are:   -
   * MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.  - FOUND, which
   * corresponds to 302.  - SEE_OTHER which corresponds to 303.  - TEMPORARY_REDIRECT, which
   * corresponds to 307. In this case, the request method will be retained.  - PERMANENT_REDIRECT,
   * which corresponds to 308. In this case, the request method will be retained.
   * @param redirectResponseCode redirectResponseCode or {@code null} for none
   */
  public HttpRedirectAction setRedirectResponseCode(java.lang.String redirectResponseCode) {
    this.redirectResponseCode = redirectResponseCode;
    return this;
  }

  /**
   * If set to true, any accompanying query portion of the original URL is removed prior to
   * redirecting the request. If set to false, the query portion of the original URL is retained.
   * The default is set to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStripQuery() {
    return stripQuery;
  }

  /**
   * If set to true, any accompanying query portion of the original URL is removed prior to
   * redirecting the request. If set to false, the query portion of the original URL is retained.
   * The default is set to false.
   * @param stripQuery stripQuery or {@code null} for none
   */
  public HttpRedirectAction setStripQuery(java.lang.Boolean stripQuery) {
    this.stripQuery = stripQuery;
    return this;
  }

  @Override
  public HttpRedirectAction set(String fieldName, Object value) {
    return (HttpRedirectAction) super.set(fieldName, value);
  }

  @Override
  public HttpRedirectAction clone() {
    return (HttpRedirectAction) super.clone();
  }

}
