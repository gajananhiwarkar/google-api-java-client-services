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
 * A quotas entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Quota extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Quota limit for this metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double limit;

  /**
   * [Output Only] Name of the quota metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metric;

  /**
   * [Output Only] Owning resource. This is the resource on which this quota is applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String owner;

  /**
   * [Output Only] Current usage of this metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double usage;

  /**
   * [Output Only] Quota limit for this metric.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLimit() {
    return limit;
  }

  /**
   * [Output Only] Quota limit for this metric.
   * @param limit limit or {@code null} for none
   */
  public Quota setLimit(java.lang.Double limit) {
    this.limit = limit;
    return this;
  }

  /**
   * [Output Only] Name of the quota metric.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetric() {
    return metric;
  }

  /**
   * [Output Only] Name of the quota metric.
   * @param metric metric or {@code null} for none
   */
  public Quota setMetric(java.lang.String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * [Output Only] Owning resource. This is the resource on which this quota is applied.
   * @return value or {@code null} for none
   */
  public java.lang.String getOwner() {
    return owner;
  }

  /**
   * [Output Only] Owning resource. This is the resource on which this quota is applied.
   * @param owner owner or {@code null} for none
   */
  public Quota setOwner(java.lang.String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * [Output Only] Current usage of this metric.
   * @return value or {@code null} for none
   */
  public java.lang.Double getUsage() {
    return usage;
  }

  /**
   * [Output Only] Current usage of this metric.
   * @param usage usage or {@code null} for none
   */
  public Quota setUsage(java.lang.Double usage) {
    this.usage = usage;
    return this;
  }

  @Override
  public Quota set(String fieldName, Object value) {
    return (Quota) super.set(fieldName, value);
  }

  @Override
  public Quota clone() {
    return (Quota) super.clone();
  }

}
