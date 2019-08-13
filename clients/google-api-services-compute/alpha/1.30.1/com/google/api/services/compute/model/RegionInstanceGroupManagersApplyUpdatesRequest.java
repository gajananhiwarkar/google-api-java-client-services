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
 * InstanceGroupManagers.applyUpdatesToInstances
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegionInstanceGroupManagersApplyUpdatesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The list of URLs of one or more instances for which you want to apply updates. Each URL can be
   * a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instances;

  /**
   * The maximal action that should be performed on the instances. By default REPLACE. This field is
   * deprecated, please use most_disruptive_allowed_action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maximalAction;

  /**
   * The minimal action that you want to perform on each instance during the update: - REPLACE: At
   * minimum, delete the instance and create it again.  - RESTART: Stop the instance and start it
   * again.  - REFRESH: Do not stop the instance.  - NONE: Do not disrupt the instance at all.  By
   * default, the minimum action is NONE. If your update requires a more disruptive action than you
   * set with this flag, the necessary action is performed to execute the update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minimalAction;

  /**
   * The most disruptive action that you want to perform on each instance during the update: -
   * REPLACE: Delete the instance and create it again.  - RESTART: Stop the instance and start it
   * again.  - REFRESH: Do not stop the instance.  - NONE: Do not disrupt the instance at all.  By
   * default, the most disruptive allowed action is REPLACE. If your update requires a more
   * disruptive action than you set with this flag, the update request will fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mostDisruptiveAllowedAction;

  /**
   * The list of URLs of one or more instances for which you want to apply updates. Each URL can be
   * a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstances() {
    return instances;
  }

  /**
   * The list of URLs of one or more instances for which you want to apply updates. Each URL can be
   * a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
   * @param instances instances or {@code null} for none
   */
  public RegionInstanceGroupManagersApplyUpdatesRequest setInstances(java.util.List<java.lang.String> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * The maximal action that should be performed on the instances. By default REPLACE. This field is
   * deprecated, please use most_disruptive_allowed_action.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaximalAction() {
    return maximalAction;
  }

  /**
   * The maximal action that should be performed on the instances. By default REPLACE. This field is
   * deprecated, please use most_disruptive_allowed_action.
   * @param maximalAction maximalAction or {@code null} for none
   */
  public RegionInstanceGroupManagersApplyUpdatesRequest setMaximalAction(java.lang.String maximalAction) {
    this.maximalAction = maximalAction;
    return this;
  }

  /**
   * The minimal action that you want to perform on each instance during the update: - REPLACE: At
   * minimum, delete the instance and create it again.  - RESTART: Stop the instance and start it
   * again.  - REFRESH: Do not stop the instance.  - NONE: Do not disrupt the instance at all.  By
   * default, the minimum action is NONE. If your update requires a more disruptive action than you
   * set with this flag, the necessary action is performed to execute the update.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinimalAction() {
    return minimalAction;
  }

  /**
   * The minimal action that you want to perform on each instance during the update: - REPLACE: At
   * minimum, delete the instance and create it again.  - RESTART: Stop the instance and start it
   * again.  - REFRESH: Do not stop the instance.  - NONE: Do not disrupt the instance at all.  By
   * default, the minimum action is NONE. If your update requires a more disruptive action than you
   * set with this flag, the necessary action is performed to execute the update.
   * @param minimalAction minimalAction or {@code null} for none
   */
  public RegionInstanceGroupManagersApplyUpdatesRequest setMinimalAction(java.lang.String minimalAction) {
    this.minimalAction = minimalAction;
    return this;
  }

  /**
   * The most disruptive action that you want to perform on each instance during the update: -
   * REPLACE: Delete the instance and create it again.  - RESTART: Stop the instance and start it
   * again.  - REFRESH: Do not stop the instance.  - NONE: Do not disrupt the instance at all.  By
   * default, the most disruptive allowed action is REPLACE. If your update requires a more
   * disruptive action than you set with this flag, the update request will fail.
   * @return value or {@code null} for none
   */
  public java.lang.String getMostDisruptiveAllowedAction() {
    return mostDisruptiveAllowedAction;
  }

  /**
   * The most disruptive action that you want to perform on each instance during the update: -
   * REPLACE: Delete the instance and create it again.  - RESTART: Stop the instance and start it
   * again.  - REFRESH: Do not stop the instance.  - NONE: Do not disrupt the instance at all.  By
   * default, the most disruptive allowed action is REPLACE. If your update requires a more
   * disruptive action than you set with this flag, the update request will fail.
   * @param mostDisruptiveAllowedAction mostDisruptiveAllowedAction or {@code null} for none
   */
  public RegionInstanceGroupManagersApplyUpdatesRequest setMostDisruptiveAllowedAction(java.lang.String mostDisruptiveAllowedAction) {
    this.mostDisruptiveAllowedAction = mostDisruptiveAllowedAction;
    return this;
  }

  @Override
  public RegionInstanceGroupManagersApplyUpdatesRequest set(String fieldName, Object value) {
    return (RegionInstanceGroupManagersApplyUpdatesRequest) super.set(fieldName, value);
  }

  @Override
  public RegionInstanceGroupManagersApplyUpdatesRequest clone() {
    return (RegionInstanceGroupManagersApplyUpdatesRequest) super.clone();
  }

}
