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
 * A snapshot schedule policy specifies when and how frequently snapshots are to be created for the
 * target disk. Also specifies how many and how long these scheduled snapshots should be retained.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourcePolicySnapshotSchedulePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Retention policy applied to snapshots created by this resource policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourcePolicySnapshotSchedulePolicyRetentionPolicy retentionPolicy;

  /**
   * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to
   * perform on this VM and when. Schedule that is applied to disks covered by this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourcePolicySnapshotSchedulePolicySchedule schedule;

  /**
   * Properties with which snapshots are created such as labels, encryption keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourcePolicySnapshotSchedulePolicySnapshotProperties snapshotProperties;

  /**
   * Retention policy applied to snapshots created by this resource policy.
   * @return value or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicyRetentionPolicy getRetentionPolicy() {
    return retentionPolicy;
  }

  /**
   * Retention policy applied to snapshots created by this resource policy.
   * @param retentionPolicy retentionPolicy or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicy setRetentionPolicy(ResourcePolicySnapshotSchedulePolicyRetentionPolicy retentionPolicy) {
    this.retentionPolicy = retentionPolicy;
    return this;
  }

  /**
   * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to
   * perform on this VM and when. Schedule that is applied to disks covered by this policy.
   * @return value or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicySchedule getSchedule() {
    return schedule;
  }

  /**
   * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to
   * perform on this VM and when. Schedule that is applied to disks covered by this policy.
   * @param schedule schedule or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicy setSchedule(ResourcePolicySnapshotSchedulePolicySchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Properties with which snapshots are created such as labels, encryption keys.
   * @return value or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicySnapshotProperties getSnapshotProperties() {
    return snapshotProperties;
  }

  /**
   * Properties with which snapshots are created such as labels, encryption keys.
   * @param snapshotProperties snapshotProperties or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicy setSnapshotProperties(ResourcePolicySnapshotSchedulePolicySnapshotProperties snapshotProperties) {
    this.snapshotProperties = snapshotProperties;
    return this;
  }

  @Override
  public ResourcePolicySnapshotSchedulePolicy set(String fieldName, Object value) {
    return (ResourcePolicySnapshotSchedulePolicy) super.set(fieldName, value);
  }

  @Override
  public ResourcePolicySnapshotSchedulePolicy clone() {
    return (ResourcePolicySnapshotSchedulePolicy) super.clone();
  }

}
