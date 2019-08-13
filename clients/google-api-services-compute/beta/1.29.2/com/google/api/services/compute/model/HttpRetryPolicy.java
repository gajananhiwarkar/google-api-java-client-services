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
 * The retry policy associates with HttpRouteRule
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRetryPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the allowed number retries. This number must be > 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long numRetries;

  /**
   * Specifies a non-zero timeout per retry attempt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration perTryTimeout;

  /**
   * Specfies one or more conditions when this retry rule applies. Valid values are: - 5xx:
   * Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
   * or if the backend service does not respond at all, example: disconnects, reset, read timeout,
   * connection failure, and refused streams.  - gateway-error: Similar to 5xx, but only applies to
   * response codes 502, 503 or 504. -  - connect-failure: Loadbalancer will retry on failures
   * connecting to backend services, for example due to connection timeouts.  - retriable-4xx:
   * Loadbalancer will retry for retriable 4xx response codes. Currently the only retriable error
   * supported is 409.  - refused-stream:Loadbalancer will retry if the backend service resets the
   * stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.  -
   * cancelledLoadbalancer will retry if the gRPC status code in the response header is set to
   * cancelled  - deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response
   * header is set to deadline-exceeded  - resource-exhausted: Loadbalancer will retry if the gRPC
   * status code in the response header is set to resource-exhausted  - unavailable: Loadbalancer
   * will retry if the gRPC status code in the response header is set to unavailable
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> retryConditions;

  /**
   * Specifies the allowed number retries. This number must be > 0.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumRetries() {
    return numRetries;
  }

  /**
   * Specifies the allowed number retries. This number must be > 0.
   * @param numRetries numRetries or {@code null} for none
   */
  public HttpRetryPolicy setNumRetries(java.lang.Long numRetries) {
    this.numRetries = numRetries;
    return this;
  }

  /**
   * Specifies a non-zero timeout per retry attempt.
   * @return value or {@code null} for none
   */
  public Duration getPerTryTimeout() {
    return perTryTimeout;
  }

  /**
   * Specifies a non-zero timeout per retry attempt.
   * @param perTryTimeout perTryTimeout or {@code null} for none
   */
  public HttpRetryPolicy setPerTryTimeout(Duration perTryTimeout) {
    this.perTryTimeout = perTryTimeout;
    return this;
  }

  /**
   * Specfies one or more conditions when this retry rule applies. Valid values are: - 5xx:
   * Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
   * or if the backend service does not respond at all, example: disconnects, reset, read timeout,
   * connection failure, and refused streams.  - gateway-error: Similar to 5xx, but only applies to
   * response codes 502, 503 or 504. -  - connect-failure: Loadbalancer will retry on failures
   * connecting to backend services, for example due to connection timeouts.  - retriable-4xx:
   * Loadbalancer will retry for retriable 4xx response codes. Currently the only retriable error
   * supported is 409.  - refused-stream:Loadbalancer will retry if the backend service resets the
   * stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.  -
   * cancelledLoadbalancer will retry if the gRPC status code in the response header is set to
   * cancelled  - deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response
   * header is set to deadline-exceeded  - resource-exhausted: Loadbalancer will retry if the gRPC
   * status code in the response header is set to resource-exhausted  - unavailable: Loadbalancer
   * will retry if the gRPC status code in the response header is set to unavailable
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRetryConditions() {
    return retryConditions;
  }

  /**
   * Specfies one or more conditions when this retry rule applies. Valid values are: - 5xx:
   * Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
   * or if the backend service does not respond at all, example: disconnects, reset, read timeout,
   * connection failure, and refused streams.  - gateway-error: Similar to 5xx, but only applies to
   * response codes 502, 503 or 504. -  - connect-failure: Loadbalancer will retry on failures
   * connecting to backend services, for example due to connection timeouts.  - retriable-4xx:
   * Loadbalancer will retry for retriable 4xx response codes. Currently the only retriable error
   * supported is 409.  - refused-stream:Loadbalancer will retry if the backend service resets the
   * stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.  -
   * cancelledLoadbalancer will retry if the gRPC status code in the response header is set to
   * cancelled  - deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response
   * header is set to deadline-exceeded  - resource-exhausted: Loadbalancer will retry if the gRPC
   * status code in the response header is set to resource-exhausted  - unavailable: Loadbalancer
   * will retry if the gRPC status code in the response header is set to unavailable
   * @param retryConditions retryConditions or {@code null} for none
   */
  public HttpRetryPolicy setRetryConditions(java.util.List<java.lang.String> retryConditions) {
    this.retryConditions = retryConditions;
    return this;
  }

  @Override
  public HttpRetryPolicy set(String fieldName, Object value) {
    return (HttpRetryPolicy) super.set(fieldName, value);
  }

  @Override
  public HttpRetryPolicy clone() {
    return (HttpRetryPolicy) super.clone();
  }

}
