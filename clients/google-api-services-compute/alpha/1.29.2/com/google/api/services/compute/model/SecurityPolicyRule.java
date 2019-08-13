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
 * Represents a rule that describes one or more match conditions along with the action to be taken
 * when traffic matches this condition (allow or deny).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SecurityPolicyRule extends com.google.api.client.json.GenericJson {

  /**
   * The Action to preform when the client connection triggers the rule. Can currently be either
   * "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The direction in which this rule applies. This field may only be specified when versioned_expr
   * is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be
   * exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery
   * or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
   *
   * This field may only be specified when the versioned_expr is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableLogging;

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding ?action? is enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleMatcher match;

  /**
   * If set to true, the specified action is not enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean preview;

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
   * highest priority and 2147483647 is the lowest prority.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer priority;

  /**
   * Must be specified if the action is "rate_based_blacklist" or "throttle". Cannot be specified
   * for any other actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecurityPolicyRuleRateLimitOptions rateLimitOptions;

  /**
   * [Output Only] Calculation of the complexity of a single firewall security policy rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ruleTupleCount;

  /**
   * A list of network resource URLs to which this rule applies. This field allows you to control
   * which network?s VMs get this rule. If this field is left blank, all VMs within the organization
   * will receive the rule.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetResources;

  /**
   * The Action to preform when the client connection triggers the rule. Can currently be either
   * "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The Action to preform when the client connection triggers the rule. Can currently be either
   * "allow" or "deny()" where valid values for status are 403, 404, and 502.
   * @param action action or {@code null} for none
   */
  public SecurityPolicyRule setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public SecurityPolicyRule setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The direction in which this rule applies. This field may only be specified when versioned_expr
   * is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * The direction in which this rule applies. This field may only be specified when versioned_expr
   * is set to FIREWALL.
   * @param direction direction or {@code null} for none
   */
  public SecurityPolicyRule setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be
   * exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery
   * or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
   *
   * This field may only be specified when the versioned_expr is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableLogging() {
    return enableLogging;
  }

  /**
   * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be
   * exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery
   * or Pub/Sub. Note: you cannot enable logging on "goto_next" rules.
   *
   * This field may only be specified when the versioned_expr is set to FIREWALL.
   * @param enableLogging enableLogging or {@code null} for none
   */
  public SecurityPolicyRule setEnableLogging(java.lang.Boolean enableLogging) {
    this.enableLogging = enableLogging;
    return this;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules
   * @param kind kind or {@code null} for none
   */
  public SecurityPolicyRule setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding ?action? is enforced.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleMatcher getMatch() {
    return match;
  }

  /**
   * A match condition that incoming traffic is evaluated against. If it evaluates to true, the
   * corresponding ?action? is enforced.
   * @param match match or {@code null} for none
   */
  public SecurityPolicyRule setMatch(SecurityPolicyRuleMatcher match) {
    this.match = match;
    return this;
  }

  /**
   * If set to true, the specified action is not enforced.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPreview() {
    return preview;
  }

  /**
   * If set to true, the specified action is not enforced.
   * @param preview preview or {@code null} for none
   */
  public SecurityPolicyRule setPreview(java.lang.Boolean preview) {
    this.preview = preview;
    return this;
  }

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
   * highest priority and 2147483647 is the lowest prority.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * An integer indicating the priority of a rule in the list. The priority must be a positive value
   * between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the
   * highest priority and 2147483647 is the lowest prority.
   * @param priority priority or {@code null} for none
   */
  public SecurityPolicyRule setPriority(java.lang.Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Must be specified if the action is "rate_based_blacklist" or "throttle". Cannot be specified
   * for any other actions.
   * @return value or {@code null} for none
   */
  public SecurityPolicyRuleRateLimitOptions getRateLimitOptions() {
    return rateLimitOptions;
  }

  /**
   * Must be specified if the action is "rate_based_blacklist" or "throttle". Cannot be specified
   * for any other actions.
   * @param rateLimitOptions rateLimitOptions or {@code null} for none
   */
  public SecurityPolicyRule setRateLimitOptions(SecurityPolicyRuleRateLimitOptions rateLimitOptions) {
    this.rateLimitOptions = rateLimitOptions;
    return this;
  }

  /**
   * [Output Only] Calculation of the complexity of a single firewall security policy rule.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRuleTupleCount() {
    return ruleTupleCount;
  }

  /**
   * [Output Only] Calculation of the complexity of a single firewall security policy rule.
   * @param ruleTupleCount ruleTupleCount or {@code null} for none
   */
  public SecurityPolicyRule setRuleTupleCount(java.lang.Integer ruleTupleCount) {
    this.ruleTupleCount = ruleTupleCount;
    return this;
  }

  /**
   * A list of network resource URLs to which this rule applies. This field allows you to control
   * which network?s VMs get this rule. If this field is left blank, all VMs within the organization
   * will receive the rule.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetResources() {
    return targetResources;
  }

  /**
   * A list of network resource URLs to which this rule applies. This field allows you to control
   * which network?s VMs get this rule. If this field is left blank, all VMs within the organization
   * will receive the rule.
   *
   * This field may only be specified when versioned_expr is set to FIREWALL.
   * @param targetResources targetResources or {@code null} for none
   */
  public SecurityPolicyRule setTargetResources(java.util.List<java.lang.String> targetResources) {
    this.targetResources = targetResources;
    return this;
  }

  @Override
  public SecurityPolicyRule set(String fieldName, Object value) {
    return (SecurityPolicyRule) super.set(fieldName, value);
  }

  @Override
  public SecurityPolicyRule clone() {
    return (SecurityPolicyRule) super.clone();
  }

}
