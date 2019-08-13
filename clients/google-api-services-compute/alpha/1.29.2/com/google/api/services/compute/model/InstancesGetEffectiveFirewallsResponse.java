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
 * Model definition for InstancesGetEffectiveFirewallsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstancesGetEffectiveFirewallsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Effective firewalls on the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Firewall> firewalls;

  static {
    // hack to force ProGuard to consider Firewall used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Firewall.class);
  }

  /**
   * Effective firewalls from organization policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy> organizationFirewalls;

  /**
   * Effective firewalls on the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<Firewall> getFirewalls() {
    return firewalls;
  }

  /**
   * Effective firewalls on the instance.
   * @param firewalls firewalls or {@code null} for none
   */
  public InstancesGetEffectiveFirewallsResponse setFirewalls(java.util.List<Firewall> firewalls) {
    this.firewalls = firewalls;
    return this;
  }

  /**
   * Effective firewalls from organization policies.
   * @return value or {@code null} for none
   */
  public java.util.List<InstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy> getOrganizationFirewalls() {
    return organizationFirewalls;
  }

  /**
   * Effective firewalls from organization policies.
   * @param organizationFirewalls organizationFirewalls or {@code null} for none
   */
  public InstancesGetEffectiveFirewallsResponse setOrganizationFirewalls(java.util.List<InstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy> organizationFirewalls) {
    this.organizationFirewalls = organizationFirewalls;
    return this;
  }

  @Override
  public InstancesGetEffectiveFirewallsResponse set(String fieldName, Object value) {
    return (InstancesGetEffectiveFirewallsResponse) super.set(fieldName, value);
  }

  @Override
  public InstancesGetEffectiveFirewallsResponse clone() {
    return (InstancesGetEffectiveFirewallsResponse) super.clone();
  }

}
