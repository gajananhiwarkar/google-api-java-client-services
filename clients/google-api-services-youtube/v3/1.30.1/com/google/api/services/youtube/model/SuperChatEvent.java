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

package com.google.api.services.youtube.model;

/**
 * A superChatEvent resource represents a Super Chat purchase on a YouTube channel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuperChatEvent extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID that YouTube assigns to uniquely identify the Super Chat event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#superChatEvent".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The snippet object contains basic details about the Super Chat event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SuperChatEventSnippet snippet;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public SuperChatEvent setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID that YouTube assigns to uniquely identify the Super Chat event.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID that YouTube assigns to uniquely identify the Super Chat event.
   * @param id id or {@code null} for none
   */
  public SuperChatEvent setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#superChatEvent".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "youtube#superChatEvent".
   * @param kind kind or {@code null} for none
   */
  public SuperChatEvent setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The snippet object contains basic details about the Super Chat event.
   * @return value or {@code null} for none
   */
  public SuperChatEventSnippet getSnippet() {
    return snippet;
  }

  /**
   * The snippet object contains basic details about the Super Chat event.
   * @param snippet snippet or {@code null} for none
   */
  public SuperChatEvent setSnippet(SuperChatEventSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  @Override
  public SuperChatEvent set(String fieldName, Object value) {
    return (SuperChatEvent) super.set(fieldName, value);
  }

  @Override
  public SuperChatEvent clone() {
    return (SuperChatEvent) super.clone();
  }

}
