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
 * Describing the ARP neighbor entries seen on this link
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectDiagnosticsARPEntry extends com.google.api.client.json.GenericJson {

  /**
   * The IP address of this ARP neighbor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * The MAC address of this ARP neighbor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String macAddress;

  /**
   * The IP address of this ARP neighbor.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * The IP address of this ARP neighbor.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public InterconnectDiagnosticsARPEntry setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The MAC address of this ARP neighbor.
   * @return value or {@code null} for none
   */
  public java.lang.String getMacAddress() {
    return macAddress;
  }

  /**
   * The MAC address of this ARP neighbor.
   * @param macAddress macAddress or {@code null} for none
   */
  public InterconnectDiagnosticsARPEntry setMacAddress(java.lang.String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  @Override
  public InterconnectDiagnosticsARPEntry set(String fieldName, Object value) {
    return (InterconnectDiagnosticsARPEntry) super.set(fieldName, value);
  }

  @Override
  public InterconnectDiagnosticsARPEntry clone() {
    return (InterconnectDiagnosticsARPEntry) super.clone();
  }

}
