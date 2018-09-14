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

package com.google.testing.model;

/**
 * An Android app manifest. See http://developer.android.com/guide/topics/manifest/manifest-
 * intro.html
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApkManifest extends com.google.api.client.json.GenericJson {

  /**
   * User-readable name for the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationLabel;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IntentFilter> intentFilters;

  static {
    // hack to force ProGuard to consider IntentFilter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(IntentFilter.class);
  }

  /**
   * Maximum API level on which the application is designed to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxSdkVersion;

  /**
   * Minimum API level required for the application to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minSdkVersion;

  /**
   * Full Java-style package name for this application, e.g. "com.example.foo".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * User-readable name for the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationLabel() {
    return applicationLabel;
  }

  /**
   * User-readable name for the application.
   * @param applicationLabel applicationLabel or {@code null} for none
   */
  public ApkManifest setApplicationLabel(java.lang.String applicationLabel) {
    this.applicationLabel = applicationLabel;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<IntentFilter> getIntentFilters() {
    return intentFilters;
  }

  /**
   * @param intentFilters intentFilters or {@code null} for none
   */
  public ApkManifest setIntentFilters(java.util.List<IntentFilter> intentFilters) {
    this.intentFilters = intentFilters;
    return this;
  }

  /**
   * Maximum API level on which the application is designed to run.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxSdkVersion() {
    return maxSdkVersion;
  }

  /**
   * Maximum API level on which the application is designed to run.
   * @param maxSdkVersion maxSdkVersion or {@code null} for none
   */
  public ApkManifest setMaxSdkVersion(java.lang.Integer maxSdkVersion) {
    this.maxSdkVersion = maxSdkVersion;
    return this;
  }

  /**
   * Minimum API level required for the application to run.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinSdkVersion() {
    return minSdkVersion;
  }

  /**
   * Minimum API level required for the application to run.
   * @param minSdkVersion minSdkVersion or {@code null} for none
   */
  public ApkManifest setMinSdkVersion(java.lang.Integer minSdkVersion) {
    this.minSdkVersion = minSdkVersion;
    return this;
  }

  /**
   * Full Java-style package name for this application, e.g. "com.example.foo".
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Full Java-style package name for this application, e.g. "com.example.foo".
   * @param packageName packageName or {@code null} for none
   */
  public ApkManifest setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  @Override
  public ApkManifest set(String fieldName, Object value) {
    return (ApkManifest) super.set(fieldName, value);
  }

  @Override
  public ApkManifest clone() {
    return (ApkManifest) super.clone();
  }

}
