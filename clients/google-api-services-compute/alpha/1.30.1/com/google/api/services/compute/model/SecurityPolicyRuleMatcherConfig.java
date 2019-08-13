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
 * Model definition for SecurityPolicyRuleMatcherConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPolicyRuleMatcherConfig extends com.google.api.client.json.GenericJson {

  /**
   * CIDR IP address range.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> destIpRanges;

  /**
   * Pairs of IP protocols and ports that the rule should match.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SecurityPolicyRuleMatcherConfigDestinationPort> destPorts;

  /**
   * CIDR IP address range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> srcIpRanges;

  /**
   * CIDR IP address range.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDestIpRanges() {
    return destIpRanges;
  }

  /**
   * CIDR IP address range.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * @param destIpRanges destIpRanges or {@code null} for none
   */
  public SecurityPolicyRuleMatcherConfig setDestIpRanges(java.util.List<java.lang.String> destIpRanges) {
    this.destIpRanges = destIpRanges;
    return this;
  }

  /**
   * Pairs of IP protocols and ports that the rule should match.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.util.List<SecurityPolicyRuleMatcherConfigDestinationPort> getDestPorts() {
    return destPorts;
  }

  /**
   * Pairs of IP protocols and ports that the rule should match.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * @param destPorts destPorts or {@code null} for none
   */
  public SecurityPolicyRuleMatcherConfig setDestPorts(java.util.List<SecurityPolicyRuleMatcherConfigDestinationPort> destPorts) {
    this.destPorts = destPorts;
    return this;
  }

  /**
   * CIDR IP address range.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSrcIpRanges() {
    return srcIpRanges;
  }

  /**
   * CIDR IP address range.
   * @param srcIpRanges srcIpRanges or {@code null} for none
   */
  public SecurityPolicyRuleMatcherConfig setSrcIpRanges(java.util.List<java.lang.String> srcIpRanges) {
    this.srcIpRanges = srcIpRanges;
    return this;
  }

  @Override
  public SecurityPolicyRuleMatcherConfig set(String fieldName, Object value) {
    return (SecurityPolicyRuleMatcherConfig) super.set(fieldName, value);
  }

  @Override
  public SecurityPolicyRuleMatcherConfig clone() {
    return (SecurityPolicyRuleMatcherConfig) super.clone();
  }

}
