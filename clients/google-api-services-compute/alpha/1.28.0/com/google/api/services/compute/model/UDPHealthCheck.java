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
 * Model definition for UDPHealthCheck.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UDPHealthCheck extends com.google.api.client.json.GenericJson {

  /**
   * The UDP port number for the health check request. Valid values are 1 through 65535.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portName;

  /**
   * Raw data of request to send in payload of UDP packet. It is an error if this is empty. The
   * request data can only be ASCII.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String request;

  /**
   * The bytes to match against the beginning of the response data. It is an error if this is empty.
   * The response data can only be ASCII.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String response;

  /**
   * The UDP port number for the health check request. Valid values are 1 through 65535.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The UDP port number for the health check request. Valid values are 1 through 65535.
   * @param port port or {@code null} for none
   */
  public UDPHealthCheck setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortName() {
    return portName;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * @param portName portName or {@code null} for none
   */
  public UDPHealthCheck setPortName(java.lang.String portName) {
    this.portName = portName;
    return this;
  }

  /**
   * Raw data of request to send in payload of UDP packet. It is an error if this is empty. The
   * request data can only be ASCII.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequest() {
    return request;
  }

  /**
   * Raw data of request to send in payload of UDP packet. It is an error if this is empty. The
   * request data can only be ASCII.
   * @param request request or {@code null} for none
   */
  public UDPHealthCheck setRequest(java.lang.String request) {
    this.request = request;
    return this;
  }

  /**
   * The bytes to match against the beginning of the response data. It is an error if this is empty.
   * The response data can only be ASCII.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponse() {
    return response;
  }

  /**
   * The bytes to match against the beginning of the response data. It is an error if this is empty.
   * The response data can only be ASCII.
   * @param response response or {@code null} for none
   */
  public UDPHealthCheck setResponse(java.lang.String response) {
    this.response = response;
    return this;
  }

  @Override
  public UDPHealthCheck set(String fieldName, Object value) {
    return (UDPHealthCheck) super.set(fieldName, value);
  }

  @Override
  public UDPHealthCheck clone() {
    return (UDPHealthCheck) super.clone();
  }

}
