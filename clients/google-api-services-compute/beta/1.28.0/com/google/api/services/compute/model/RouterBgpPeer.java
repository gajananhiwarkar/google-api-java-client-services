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
 * Model definition for RouterBgpPeer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterBgpPeer extends com.google.api.client.json.GenericJson {

  /**
   * User-specified flag to indicate which mode to use for advertisement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiseMode;

  /**
   * User-specified list of prefix groups to advertise in custom mode, which can take one of the
   * following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets.
   * - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets.  - ALL_PEER_VPC_SUBNETS: Advertises
   * peer subnets of the router's VPC network. Note that this field can only be populated if
   * advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message).
   * These groups are advertised in addition to any specified prefixes. Leave this field blank to
   * advertise no custom groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> advertisedGroups;

  /**
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the
   * "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this
   * field blank to advertise no custom IP ranges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RouterAdvertisedIpRange> advertisedIpRanges;

  static {
    // hack to force ProGuard to consider RouterAdvertisedIpRange used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(RouterAdvertisedIpRange.class);
  }

  /**
   * The priority of routes advertised to this BGP peer. Where there is more than one matching route
   * of maximum length, the routes with the lowest priority value win.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long advertisedRoutePriority;

  /**
   * Name of the interface the BGP peer is associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interfaceName;

  /**
   * IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * [Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the
   * default value and can be managed by you or other users  - MANAGED_BY_ATTACHMENT is a BGP peer
   * that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment
   * of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when
   * the PARTNER InterconnectAttachment is created, updated, or deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementType;

  /**
   * Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long peerAsn;

  /**
   * IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerIpAddress;

  /**
   * User-specified flag to indicate which mode to use for advertisement.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiseMode() {
    return advertiseMode;
  }

  /**
   * User-specified flag to indicate which mode to use for advertisement.
   * @param advertiseMode advertiseMode or {@code null} for none
   */
  public RouterBgpPeer setAdvertiseMode(java.lang.String advertiseMode) {
    this.advertiseMode = advertiseMode;
    return this;
  }

  /**
   * User-specified list of prefix groups to advertise in custom mode, which can take one of the
   * following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets.
   * - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets.  - ALL_PEER_VPC_SUBNETS: Advertises
   * peer subnets of the router's VPC network. Note that this field can only be populated if
   * advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message).
   * These groups are advertised in addition to any specified prefixes. Leave this field blank to
   * advertise no custom groups.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdvertisedGroups() {
    return advertisedGroups;
  }

  /**
   * User-specified list of prefix groups to advertise in custom mode, which can take one of the
   * following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets.
   * - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets.  - ALL_PEER_VPC_SUBNETS: Advertises
   * peer subnets of the router's VPC network. Note that this field can only be populated if
   * advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message).
   * These groups are advertised in addition to any specified prefixes. Leave this field blank to
   * advertise no custom groups.
   * @param advertisedGroups advertisedGroups or {@code null} for none
   */
  public RouterBgpPeer setAdvertisedGroups(java.util.List<java.lang.String> advertisedGroups) {
    this.advertisedGroups = advertisedGroups;
    return this;
  }

  /**
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the
   * "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this
   * field blank to advertise no custom IP ranges.
   * @return value or {@code null} for none
   */
  public java.util.List<RouterAdvertisedIpRange> getAdvertisedIpRanges() {
    return advertisedIpRanges;
  }

  /**
   * User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   * populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the
   * "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this
   * field blank to advertise no custom IP ranges.
   * @param advertisedIpRanges advertisedIpRanges or {@code null} for none
   */
  public RouterBgpPeer setAdvertisedIpRanges(java.util.List<RouterAdvertisedIpRange> advertisedIpRanges) {
    this.advertisedIpRanges = advertisedIpRanges;
    return this;
  }

  /**
   * The priority of routes advertised to this BGP peer. Where there is more than one matching route
   * of maximum length, the routes with the lowest priority value win.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertisedRoutePriority() {
    return advertisedRoutePriority;
  }

  /**
   * The priority of routes advertised to this BGP peer. Where there is more than one matching route
   * of maximum length, the routes with the lowest priority value win.
   * @param advertisedRoutePriority advertisedRoutePriority or {@code null} for none
   */
  public RouterBgpPeer setAdvertisedRoutePriority(java.lang.Long advertisedRoutePriority) {
    this.advertisedRoutePriority = advertisedRoutePriority;
    return this;
  }

  /**
   * Name of the interface the BGP peer is associated with.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterfaceName() {
    return interfaceName;
  }

  /**
   * Name of the interface the BGP peer is associated with.
   * @param interfaceName interfaceName or {@code null} for none
   */
  public RouterBgpPeer setInterfaceName(java.lang.String interfaceName) {
    this.interfaceName = interfaceName;
    return this;
  }

  /**
   * IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public RouterBgpPeer setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * [Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the
   * default value and can be managed by you or other users  - MANAGED_BY_ATTACHMENT is a BGP peer
   * that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment
   * of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when
   * the PARTNER InterconnectAttachment is created, updated, or deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementType() {
    return managementType;
  }

  /**
   * [Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the
   * default value and can be managed by you or other users  - MANAGED_BY_ATTACHMENT is a BGP peer
   * that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment
   * of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when
   * the PARTNER InterconnectAttachment is created, updated, or deleted.
   * @param managementType managementType or {@code null} for none
   */
  public RouterBgpPeer setManagementType(java.lang.String managementType) {
    this.managementType = managementType;
    return this;
  }

  /**
   * Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035.
   * @param name name or {@code null} for none
   */
  public RouterBgpPeer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPeerAsn() {
    return peerAsn;
  }

  /**
   * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
   * @param peerAsn peerAsn or {@code null} for none
   */
  public RouterBgpPeer setPeerAsn(java.lang.Long peerAsn) {
    this.peerAsn = peerAsn;
    return this;
  }

  /**
   * IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerIpAddress() {
    return peerIpAddress;
  }

  /**
   * IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
   * @param peerIpAddress peerIpAddress or {@code null} for none
   */
  public RouterBgpPeer setPeerIpAddress(java.lang.String peerIpAddress) {
    this.peerIpAddress = peerIpAddress;
    return this;
  }

  @Override
  public RouterBgpPeer set(String fieldName, Object value) {
    return (RouterBgpPeer) super.set(fieldName, value);
  }

  @Override
  public RouterBgpPeer clone() {
    return (RouterBgpPeer) super.clone();
  }

}
