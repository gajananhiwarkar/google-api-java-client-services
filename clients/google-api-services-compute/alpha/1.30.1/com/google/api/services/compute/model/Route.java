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
 * Represents a Route resource.
 *
 * A route defines a path from VM instances in the VPC network to a specific destination. This
 * destination can be inside or outside the VPC network. For more information, read the Routes
 * overview. (== resource_for beta.routes ==) (== resource_for v1.routes ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Route extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The destination range of outgoing packets that this route applies to. Only IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destRange;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of this resource. Always compute#routes for Route resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Fully-qualified URL of the network that this route applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The URL to a gateway that should handle matching packets. You can only specify the internet
   * gateway using a full or partial valid URL:  projects/project/global/gateways/default-internet-
   * gateway
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopGateway;

  /**
   * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching
   * packets. You can only specify the forwarding rule as a partial or full URL. For example, the
   * following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/
   * region/forwardingRules/forwardingRule  - regions/region/forwardingRules/forwardingRule  Note
   * that this can only be used when the destination_range is a public (non-RFC 1918) IP CIDR range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopIlb;

  /**
   * The URL to an instance that should handle matching packets. You can specify this as a full or
   * partial URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopInstance;

  /**
   * [Output Only] The URL to an InterconnectAttachment which is the next hop for the route. This
   * field will only be populated for the dynamic routes generated by Cloud Router with a linked
   * interconnectAttachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopInterconnectAttachment;

  /**
   * The network IP address of an instance that should handle matching packets. Only IPv4 is
   * supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopIp;

  /**
   * The URL of the local network if it should handle matching packets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopNetwork;

  /**
   * [Output Only] The network peering name that should handle matching packets, which should
   * conform to RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopPeering;

  /**
   * The URL to a VpnTunnel that should handle matching packets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextHopVpnTunnel;

  /**
   * The priority of this route. Priority is used to break ties in cases where there is more than
   * one matching route of equal prefix length. In cases where multiple routes have equal prefix
   * length, the one with the lowest-numbered priority value wins. The default value is `1000`. The
   * priority value must be from `0` to `65535`, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long priority;

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * A list of instance tags to which this route applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * [Output Only] If potential misconfigurations are detected for this route, this field will be
   * populated with warning messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warnings> warnings;

  static {
    // hack to force ProGuard to consider Warnings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Warnings.class);
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Route setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @param description description or {@code null} for none
   */
  public Route setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The destination range of outgoing packets that this route applies to. Only IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestRange() {
    return destRange;
  }

  /**
   * The destination range of outgoing packets that this route applies to. Only IPv4 is supported.
   * @param destRange destRange or {@code null} for none
   */
  public Route setDestRange(java.lang.String destRange) {
    this.destRange = destRange;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Route setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of this resource. Always compute#routes for Route resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of this resource. Always compute#routes for Route resources.
   * @param kind kind or {@code null} for none
   */
  public Route setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @param name name or {@code null} for none
   */
  public Route setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Fully-qualified URL of the network that this route applies to.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Fully-qualified URL of the network that this route applies to.
   * @param network network or {@code null} for none
   */
  public Route setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The URL to a gateway that should handle matching packets. You can only specify the internet
   * gateway using a full or partial valid URL:  projects/project/global/gateways/default-internet-
   * gateway
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopGateway() {
    return nextHopGateway;
  }

  /**
   * The URL to a gateway that should handle matching packets. You can only specify the internet
   * gateway using a full or partial valid URL:  projects/project/global/gateways/default-internet-
   * gateway
   * @param nextHopGateway nextHopGateway or {@code null} for none
   */
  public Route setNextHopGateway(java.lang.String nextHopGateway) {
    this.nextHopGateway = nextHopGateway;
    return this;
  }

  /**
   * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching
   * packets. You can only specify the forwarding rule as a partial or full URL. For example, the
   * following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/
   * region/forwardingRules/forwardingRule  - regions/region/forwardingRules/forwardingRule  Note
   * that this can only be used when the destination_range is a public (non-RFC 1918) IP CIDR range.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopIlb() {
    return nextHopIlb;
  }

  /**
   * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching
   * packets. You can only specify the forwarding rule as a partial or full URL. For example, the
   * following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/
   * region/forwardingRules/forwardingRule  - regions/region/forwardingRules/forwardingRule  Note
   * that this can only be used when the destination_range is a public (non-RFC 1918) IP CIDR range.
   * @param nextHopIlb nextHopIlb or {@code null} for none
   */
  public Route setNextHopIlb(java.lang.String nextHopIlb) {
    this.nextHopIlb = nextHopIlb;
    return this;
  }

  /**
   * The URL to an instance that should handle matching packets. You can specify this as a full or
   * partial URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopInstance() {
    return nextHopInstance;
  }

  /**
   * The URL to an instance that should handle matching packets. You can specify this as a full or
   * partial URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
   * @param nextHopInstance nextHopInstance or {@code null} for none
   */
  public Route setNextHopInstance(java.lang.String nextHopInstance) {
    this.nextHopInstance = nextHopInstance;
    return this;
  }

  /**
   * [Output Only] The URL to an InterconnectAttachment which is the next hop for the route. This
   * field will only be populated for the dynamic routes generated by Cloud Router with a linked
   * interconnectAttachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopInterconnectAttachment() {
    return nextHopInterconnectAttachment;
  }

  /**
   * [Output Only] The URL to an InterconnectAttachment which is the next hop for the route. This
   * field will only be populated for the dynamic routes generated by Cloud Router with a linked
   * interconnectAttachment.
   * @param nextHopInterconnectAttachment nextHopInterconnectAttachment or {@code null} for none
   */
  public Route setNextHopInterconnectAttachment(java.lang.String nextHopInterconnectAttachment) {
    this.nextHopInterconnectAttachment = nextHopInterconnectAttachment;
    return this;
  }

  /**
   * The network IP address of an instance that should handle matching packets. Only IPv4 is
   * supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopIp() {
    return nextHopIp;
  }

  /**
   * The network IP address of an instance that should handle matching packets. Only IPv4 is
   * supported.
   * @param nextHopIp nextHopIp or {@code null} for none
   */
  public Route setNextHopIp(java.lang.String nextHopIp) {
    this.nextHopIp = nextHopIp;
    return this;
  }

  /**
   * The URL of the local network if it should handle matching packets.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopNetwork() {
    return nextHopNetwork;
  }

  /**
   * The URL of the local network if it should handle matching packets.
   * @param nextHopNetwork nextHopNetwork or {@code null} for none
   */
  public Route setNextHopNetwork(java.lang.String nextHopNetwork) {
    this.nextHopNetwork = nextHopNetwork;
    return this;
  }

  /**
   * [Output Only] The network peering name that should handle matching packets, which should
   * conform to RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopPeering() {
    return nextHopPeering;
  }

  /**
   * [Output Only] The network peering name that should handle matching packets, which should
   * conform to RFC1035.
   * @param nextHopPeering nextHopPeering or {@code null} for none
   */
  public Route setNextHopPeering(java.lang.String nextHopPeering) {
    this.nextHopPeering = nextHopPeering;
    return this;
  }

  /**
   * The URL to a VpnTunnel that should handle matching packets.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextHopVpnTunnel() {
    return nextHopVpnTunnel;
  }

  /**
   * The URL to a VpnTunnel that should handle matching packets.
   * @param nextHopVpnTunnel nextHopVpnTunnel or {@code null} for none
   */
  public Route setNextHopVpnTunnel(java.lang.String nextHopVpnTunnel) {
    this.nextHopVpnTunnel = nextHopVpnTunnel;
    return this;
  }

  /**
   * The priority of this route. Priority is used to break ties in cases where there is more than
   * one matching route of equal prefix length. In cases where multiple routes have equal prefix
   * length, the one with the lowest-numbered priority value wins. The default value is `1000`. The
   * priority value must be from `0` to `65535`, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPriority() {
    return priority;
  }

  /**
   * The priority of this route. Priority is used to break ties in cases where there is more than
   * one matching route of equal prefix length. In cases where multiple routes have equal prefix
   * length, the one with the lowest-numbered priority value wins. The default value is `1000`. The
   * priority value must be from `0` to `65535`, inclusive.
   * @param priority priority or {@code null} for none
   */
  public Route setPriority(java.lang.Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Route setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public Route setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * A list of instance tags to which this route applies.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * A list of instance tags to which this route applies.
   * @param tags tags or {@code null} for none
   */
  public Route setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * [Output Only] If potential misconfigurations are detected for this route, this field will be
   * populated with warning messages.
   * @return value or {@code null} for none
   */
  public java.util.List<Warnings> getWarnings() {
    return warnings;
  }

  /**
   * [Output Only] If potential misconfigurations are detected for this route, this field will be
   * populated with warning messages.
   * @param warnings warnings or {@code null} for none
   */
  public Route setWarnings(java.util.List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public Route set(String fieldName, Object value) {
    return (Route) super.set(fieldName, value);
  }

  @Override
  public Route clone() {
    return (Route) super.clone();
  }

  /**
   * Model definition for RouteWarnings.
   */
  public static final class Warnings extends com.google.api.client.json.GenericJson {

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Data> data;

    static {
      // hack to force ProGuard to consider Data used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Data.class);
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @return value or {@code null} for none
     */
    public java.lang.String getCode() {
      return code;
    }

    /**
     * [Output Only] A warning code, if applicable. For example, Compute Engine returns
     * NO_RESULTS_ON_PAGE if there are no results in the response.
     * @param code code or {@code null} for none
     */
    public Warnings setCode(java.lang.String code) {
      this.code = code;
      return this;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @return value or {@code null} for none
     */
    public java.util.List<Data> getData() {
      return data;
    }

    /**
     * [Output Only] Metadata about this warning in key: value format. For example: "data": [ { "key":
     * "scope", "value": "zones/us-east1-d" }
     * @param data data or {@code null} for none
     */
    public Warnings setData(java.util.List<Data> data) {
      this.data = data;
      return this;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * [Output Only] A human-readable description of the warning code.
     * @param message message or {@code null} for none
     */
    public Warnings setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    @Override
    public Warnings set(String fieldName, Object value) {
      return (Warnings) super.set(fieldName, value);
    }

    @Override
    public Warnings clone() {
      return (Warnings) super.clone();
    }

    /**
     * Model definition for RouteWarningsData.
     */
    public static final class Data extends com.google.api.client.json.GenericJson {

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String key;

      /**
       * [Output Only] A warning data value corresponding to the key.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String value;

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @return value or {@code null} for none
       */
      public java.lang.String getKey() {
        return key;
      }

      /**
       * [Output Only] A key that provides more detail on the warning being returned. For example, for
       * warnings where there are no results in a list request for a particular zone, this key might be
       * scope and the key value might be the zone name. Other examples might be a key indicating a
       * deprecated resource and a suggested replacement, or a warning about invalid network settings
       * (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
       * forwarding).
       * @param key key or {@code null} for none
       */
      public Data setKey(java.lang.String key) {
        this.key = key;
        return this;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @return value or {@code null} for none
       */
      public java.lang.String getValue() {
        return value;
      }

      /**
       * [Output Only] A warning data value corresponding to the key.
       * @param value value or {@code null} for none
       */
      public Data setValue(java.lang.String value) {
        this.value = value;
        return this;
      }

      @Override
      public Data set(String fieldName, Object value) {
        return (Data) super.set(fieldName, value);
      }

      @Override
      public Data clone() {
        return (Data) super.clone();
      }

    }
  }

}
