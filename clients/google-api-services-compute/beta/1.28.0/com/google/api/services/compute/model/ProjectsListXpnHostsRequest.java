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
 * Model definition for ProjectsListXpnHostsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProjectsListXpnHostsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host
   * projects. If not specified, the organization will be inferred from the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organization;

  /**
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host
   * projects. If not specified, the organization will be inferred from the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * Optional organization ID managed by Cloud Resource Manager, for which to list shared VPC host
   * projects. If not specified, the organization will be inferred from the project.
   * @param organization organization or {@code null} for none
   */
  public ProjectsListXpnHostsRequest setOrganization(java.lang.String organization) {
    this.organization = organization;
    return this;
  }

  @Override
  public ProjectsListXpnHostsRequest set(String fieldName, Object value) {
    return (ProjectsListXpnHostsRequest) super.set(fieldName, value);
  }

  @Override
  public ProjectsListXpnHostsRequest clone() {
    return (ProjectsListXpnHostsRequest) super.clone();
  }

}
