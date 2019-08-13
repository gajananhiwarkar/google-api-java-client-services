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
 * gRPC config to access the SDS server.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GrpcServiceConfig extends com.google.api.client.json.GenericJson {

  /**
   * The call credentials to access the SDS server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CallCredentials callCredentials;

  /**
   * The channel credentials to access the SDS server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelCredentials channelCredentials;

  /**
   * The target URI of the SDS server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetUri;

  /**
   * The call credentials to access the SDS server.
   * @return value or {@code null} for none
   */
  public CallCredentials getCallCredentials() {
    return callCredentials;
  }

  /**
   * The call credentials to access the SDS server.
   * @param callCredentials callCredentials or {@code null} for none
   */
  public GrpcServiceConfig setCallCredentials(CallCredentials callCredentials) {
    this.callCredentials = callCredentials;
    return this;
  }

  /**
   * The channel credentials to access the SDS server.
   * @return value or {@code null} for none
   */
  public ChannelCredentials getChannelCredentials() {
    return channelCredentials;
  }

  /**
   * The channel credentials to access the SDS server.
   * @param channelCredentials channelCredentials or {@code null} for none
   */
  public GrpcServiceConfig setChannelCredentials(ChannelCredentials channelCredentials) {
    this.channelCredentials = channelCredentials;
    return this;
  }

  /**
   * The target URI of the SDS server.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetUri() {
    return targetUri;
  }

  /**
   * The target URI of the SDS server.
   * @param targetUri targetUri or {@code null} for none
   */
  public GrpcServiceConfig setTargetUri(java.lang.String targetUri) {
    this.targetUri = targetUri;
    return this;
  }

  @Override
  public GrpcServiceConfig set(String fieldName, Object value) {
    return (GrpcServiceConfig) super.set(fieldName, value);
  }

  @Override
  public GrpcServiceConfig clone() {
    return (GrpcServiceConfig) super.clone();
  }

}
