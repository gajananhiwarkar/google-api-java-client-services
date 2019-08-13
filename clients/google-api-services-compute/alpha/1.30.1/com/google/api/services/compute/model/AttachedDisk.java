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
 * An instance-attached disk resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttachedDisk extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   * disk is detached from the instance).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoDelete;

  /**
   * Indicates that this is a boot disk. The virtual machine will use the first partition of the
   * disk for its root filesystem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boot;

  /**
   * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-
   * id/google-* tree of a Linux operating system running within the instance. This name can be used
   * to reference the device for mounting, resizing, and so on, from within the instance.
   *
   * If not specified, the server chooses a default device name to apply to this disk, in the form
   * persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only
   * applicable for persistent disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceName;

  /**
   * Encrypts or decrypts a disk using a customer-supplied encryption key.
   *
   * If you are creating a new disk, this field encrypts the new disk using an encryption key that
   * you provide. If you are attaching an existing disk that is already encrypted, this field
   * decrypts the disk using the customer-supplied encryption key.
   *
   * If you encrypt a disk using a customer-supplied key, you must provide the same key again when
   * you attempt to use this resource at a later time. For example, you must provide the key when
   * you create a snapshot or an image from the disk or when you attach the disk to a virtual
   * machine instance.
   *
   * If you do not provide an encryption key, then the disk will be encrypted using an automatically
   * generated key and you do not need to provide a key to use the disk later.
   *
   * Instance templates do not store customer-supplied encryption keys, so you cannot use your own
   * keys to encrypt disks in a managed instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey diskEncryptionKey;

  /**
   * The size of the disk in base-2 GB. This supersedes disk_size_gb in InitializeParams.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * A list of features to enable on the guest operating system. Applicable only for bootable
   * images. Read  Enabling guest operating system features to see a list of available options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GuestOsFeature> guestOsFeatures;

  /**
   * [Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you
   * have many disks attached to an instance, each disk would have a unique index number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * [Input Only] Specifies the parameters for a new disk that will be created alongside the new
   * instance. Use initialization parameters to create boot disks or local SSDs attached to the new
   * instance.
   *
   * This property is mutually exclusive with the source property; you can only define one or the
   * other, but not both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AttachedDiskInitializeParams initializeParams;

  /**
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The
   * default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt
   * to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or
   * SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * TODO(b/131765817): Update documentation when NVME is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("interface")
  private java.lang.String interface__;

  /**
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * [Output Only] Any valid publicly visible licenses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> licenses;

  /**
   * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the
   * default is to attach the disk in READ_WRITE mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to
   * PRESERVED if the LocalSSD data has been saved to a persistent location by customer request.
   * (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String savedState;

  /**
   * [Output Only] shielded vm initial state stored on disk
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InitialStateConfig shieldedInstanceInitialState;

  /**
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a
   * new instance, one of initializeParams.sourceImage or disks.source is required except for local
   * SSD.
   *
   * If desired, you can also attach existing non-root persistent disks using this property. This
   * field is only applicable for persistent disks.
   *
   * Note that for InstanceTemplate, specify the disk name, not the URL for the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is
   * PERSISTENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   * disk is detached from the instance).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoDelete() {
    return autoDelete;
  }

  /**
   * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the
   * disk is detached from the instance).
   * @param autoDelete autoDelete or {@code null} for none
   */
  public AttachedDisk setAutoDelete(java.lang.Boolean autoDelete) {
    this.autoDelete = autoDelete;
    return this;
  }

  /**
   * Indicates that this is a boot disk. The virtual machine will use the first partition of the
   * disk for its root filesystem.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoot() {
    return boot;
  }

  /**
   * Indicates that this is a boot disk. The virtual machine will use the first partition of the
   * disk for its root filesystem.
   * @param boot boot or {@code null} for none
   */
  public AttachedDisk setBoot(java.lang.Boolean boot) {
    this.boot = boot;
    return this;
  }

  /**
   * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-
   * id/google-* tree of a Linux operating system running within the instance. This name can be used
   * to reference the device for mounting, resizing, and so on, from within the instance.
   *
   * If not specified, the server chooses a default device name to apply to this disk, in the form
   * persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only
   * applicable for persistent disks.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceName() {
    return deviceName;
  }

  /**
   * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-
   * id/google-* tree of a Linux operating system running within the instance. This name can be used
   * to reference the device for mounting, resizing, and so on, from within the instance.
   *
   * If not specified, the server chooses a default device name to apply to this disk, in the form
   * persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only
   * applicable for persistent disks.
   * @param deviceName deviceName or {@code null} for none
   */
  public AttachedDisk setDeviceName(java.lang.String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * Encrypts or decrypts a disk using a customer-supplied encryption key.
   *
   * If you are creating a new disk, this field encrypts the new disk using an encryption key that
   * you provide. If you are attaching an existing disk that is already encrypted, this field
   * decrypts the disk using the customer-supplied encryption key.
   *
   * If you encrypt a disk using a customer-supplied key, you must provide the same key again when
   * you attempt to use this resource at a later time. For example, you must provide the key when
   * you create a snapshot or an image from the disk or when you attach the disk to a virtual
   * machine instance.
   *
   * If you do not provide an encryption key, then the disk will be encrypted using an automatically
   * generated key and you do not need to provide a key to use the disk later.
   *
   * Instance templates do not store customer-supplied encryption keys, so you cannot use your own
   * keys to encrypt disks in a managed instance group.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getDiskEncryptionKey() {
    return diskEncryptionKey;
  }

  /**
   * Encrypts or decrypts a disk using a customer-supplied encryption key.
   *
   * If you are creating a new disk, this field encrypts the new disk using an encryption key that
   * you provide. If you are attaching an existing disk that is already encrypted, this field
   * decrypts the disk using the customer-supplied encryption key.
   *
   * If you encrypt a disk using a customer-supplied key, you must provide the same key again when
   * you attempt to use this resource at a later time. For example, you must provide the key when
   * you create a snapshot or an image from the disk or when you attach the disk to a virtual
   * machine instance.
   *
   * If you do not provide an encryption key, then the disk will be encrypted using an automatically
   * generated key and you do not need to provide a key to use the disk later.
   *
   * Instance templates do not store customer-supplied encryption keys, so you cannot use your own
   * keys to encrypt disks in a managed instance group.
   * @param diskEncryptionKey diskEncryptionKey or {@code null} for none
   */
  public AttachedDisk setDiskEncryptionKey(CustomerEncryptionKey diskEncryptionKey) {
    this.diskEncryptionKey = diskEncryptionKey;
    return this;
  }

  /**
   * The size of the disk in base-2 GB. This supersedes disk_size_gb in InitializeParams.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * The size of the disk in base-2 GB. This supersedes disk_size_gb in InitializeParams.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public AttachedDisk setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * A list of features to enable on the guest operating system. Applicable only for bootable
   * images. Read  Enabling guest operating system features to see a list of available options.
   * @return value or {@code null} for none
   */
  public java.util.List<GuestOsFeature> getGuestOsFeatures() {
    return guestOsFeatures;
  }

  /**
   * A list of features to enable on the guest operating system. Applicable only for bootable
   * images. Read  Enabling guest operating system features to see a list of available options.
   * @param guestOsFeatures guestOsFeatures or {@code null} for none
   */
  public AttachedDisk setGuestOsFeatures(java.util.List<GuestOsFeature> guestOsFeatures) {
    this.guestOsFeatures = guestOsFeatures;
    return this;
  }

  /**
   * [Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you
   * have many disks attached to an instance, each disk would have a unique index number.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * [Output Only] A zero-based index to this disk, where 0 is reserved for the boot disk. If you
   * have many disks attached to an instance, each disk would have a unique index number.
   * @param index index or {@code null} for none
   */
  public AttachedDisk setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * [Input Only] Specifies the parameters for a new disk that will be created alongside the new
   * instance. Use initialization parameters to create boot disks or local SSDs attached to the new
   * instance.
   *
   * This property is mutually exclusive with the source property; you can only define one or the
   * other, but not both.
   * @return value or {@code null} for none
   */
  public AttachedDiskInitializeParams getInitializeParams() {
    return initializeParams;
  }

  /**
   * [Input Only] Specifies the parameters for a new disk that will be created alongside the new
   * instance. Use initialization parameters to create boot disks or local SSDs attached to the new
   * instance.
   *
   * This property is mutually exclusive with the source property; you can only define one or the
   * other, but not both.
   * @param initializeParams initializeParams or {@code null} for none
   */
  public AttachedDisk setInitializeParams(AttachedDiskInitializeParams initializeParams) {
    this.initializeParams = initializeParams;
    return this;
  }

  /**
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The
   * default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt
   * to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or
   * SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * TODO(b/131765817): Update documentation when NVME is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterface() {
    return interface__;
  }

  /**
   * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The
   * default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt
   * to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or
   * SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
   * TODO(b/131765817): Update documentation when NVME is supported.
   * @param interface__ interface__ or {@code null} for none
   */
  public AttachedDisk setInterface(java.lang.String interface__) {
    this.interface__ = interface__;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#attachedDisk for attached disks.
   * @param kind kind or {@code null} for none
   */
  public AttachedDisk setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output Only] Any valid publicly visible licenses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLicenses() {
    return licenses;
  }

  /**
   * [Output Only] Any valid publicly visible licenses.
   * @param licenses licenses or {@code null} for none
   */
  public AttachedDisk setLicenses(java.util.List<java.lang.String> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the
   * default is to attach the disk in READ_WRITE mode.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the
   * default is to attach the disk in READ_WRITE mode.
   * @param mode mode or {@code null} for none
   */
  public AttachedDisk setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to
   * PRESERVED if the LocalSSD data has been saved to a persistent location by customer request.
   * (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
   * @return value or {@code null} for none
   */
  public java.lang.String getSavedState() {
    return savedState;
  }

  /**
   * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to
   * PRESERVED if the LocalSSD data has been saved to a persistent location by customer request.
   * (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
   * @param savedState savedState or {@code null} for none
   */
  public AttachedDisk setSavedState(java.lang.String savedState) {
    this.savedState = savedState;
    return this;
  }

  /**
   * [Output Only] shielded vm initial state stored on disk
   * @return value or {@code null} for none
   */
  public InitialStateConfig getShieldedInstanceInitialState() {
    return shieldedInstanceInitialState;
  }

  /**
   * [Output Only] shielded vm initial state stored on disk
   * @param shieldedInstanceInitialState shieldedInstanceInitialState or {@code null} for none
   */
  public AttachedDisk setShieldedInstanceInitialState(InitialStateConfig shieldedInstanceInitialState) {
    this.shieldedInstanceInitialState = shieldedInstanceInitialState;
    return this;
  }

  /**
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a
   * new instance, one of initializeParams.sourceImage or disks.source is required except for local
   * SSD.
   *
   * If desired, you can also attach existing non-root persistent disks using this property. This
   * field is only applicable for persistent disks.
   *
   * Note that for InstanceTemplate, specify the disk name, not the URL for the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a
   * new instance, one of initializeParams.sourceImage or disks.source is required except for local
   * SSD.
   *
   * If desired, you can also attach existing non-root persistent disks using this property. This
   * field is only applicable for persistent disks.
   *
   * Note that for InstanceTemplate, specify the disk name, not the URL for the disk.
   * @param source source or {@code null} for none
   */
  public AttachedDisk setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is
   * PERSISTENT.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is
   * PERSISTENT.
   * @param type type or {@code null} for none
   */
  public AttachedDisk setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AttachedDisk set(String fieldName, Object value) {
    return (AttachedDisk) super.set(fieldName, value);
  }

  @Override
  public AttachedDisk clone() {
    return (AttachedDisk) super.clone();
  }

}
