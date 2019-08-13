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
 * Represents a Cloud Router resource.
 *
 * For more information about Cloud Router, read the the Cloud Router overview.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Router extends com.google.api.client.json.GenericJson {

  /**
   * BGP information specific to this router.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RouterBgp bgp;

  /**
   * BGP information that must be configured into the routing stack to establish BGP peering. This
   * information must specify the peer ASN and either the interface name, IP address, or peer IP
   * address. Please refer to RFC4273.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterBgpPeer> bgpPeers;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Router interfaces. Each interface requires either one linked resource, (for example,
   * linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterInterface> interfaces;

  /**
   * [Output Only] Type of resource. Always compute#router for routers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A list of NAT services created in this router.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterNat> nats;

  /**
   * URI of the network to which this router belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * [Output Only] URI of the region where the router resides. You must specify this field as part
   * of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
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
   * BGP information specific to this router.
   * @return value or {@code null} for none
   */
  public RouterBgp getBgp() {
    return bgp;
  }

  /**
   * BGP information specific to this router.
   * @param bgp bgp or {@code null} for none
   */
  public Router setBgp(RouterBgp bgp) {
    this.bgp = bgp;
    return this;
  }

  /**
   * BGP information that must be configured into the routing stack to establish BGP peering. This
   * information must specify the peer ASN and either the interface name, IP address, or peer IP
   * address. Please refer to RFC4273.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterBgpPeer> getBgpPeers() {
    return bgpPeers;
  }

  /**
   * BGP information that must be configured into the routing stack to establish BGP peering. This
   * information must specify the peer ASN and either the interface name, IP address, or peer IP
   * address. Please refer to RFC4273.
   * @param bgpPeers bgpPeers or {@code null} for none
   */
  public Router setBgpPeers(java.util.List<RouterBgpPeer> bgpPeers) {
    this.bgpPeers = bgpPeers;
    return this;
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
  public Router setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
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
  public Router setDescription(java.lang.String description) {
    this.description = description;
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
  public Router setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Router interfaces. Each interface requires either one linked resource, (for example,
   * linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterInterface> getInterfaces() {
    return interfaces;
  }

  /**
   * Router interfaces. Each interface requires either one linked resource, (for example,
   * linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
   * @param interfaces interfaces or {@code null} for none
   */
  public Router setInterfaces(java.util.List<RouterInterface> interfaces) {
    this.interfaces = interfaces;
    return this;
  }

  /**
   * [Output Only] Type of resource. Always compute#router for routers.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of resource. Always compute#router for routers.
   * @param kind kind or {@code null} for none
   */
  public Router setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Router setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A list of NAT services created in this router.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterNat> getNats() {
    return nats;
  }

  /**
   * A list of NAT services created in this router.
   * @param nats nats or {@code null} for none
   */
  public Router setNats(java.util.List<RouterNat> nats) {
    this.nats = nats;
    return this;
  }

  /**
   * URI of the network to which this router belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * URI of the network to which this router belongs.
   * @param network network or {@code null} for none
   */
  public Router setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * [Output Only] URI of the region where the router resides. You must specify this field as part
   * of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URI of the region where the router resides. You must specify this field as part
   * of the HTTP request URL. It is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public Router setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Router setSelfLink(java.lang.String selfLink) {
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
  public Router setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  @Override
  public Router set(String fieldName, Object value) {
    return (Router) super.set(fieldName, value);
  }

  @Override
  public Router clone() {
    return (Router) super.clone();
  }

}
