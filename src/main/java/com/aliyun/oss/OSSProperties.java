package com.aliyun.oss;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 描述: oss 配置
 * 包名: com.sanji.
 * 作者: barton.
 * 日期: 16-12-22.
 * 项目名称: oss
 * 版本: 1.0
 * JDK: since 1.8
 */
@Component
@ConfigurationProperties(prefix = "oss")
public class OSSProperties {

  private String endpointUpload;
  private String endpointManager;
  private String accessKeyId;
  private String accessKeySecret;

  private Client client;

  public String getEndpointUpload() {
    return endpointUpload;
  }

  public void setEndpointUpload(String endpointUpload) {
    this.endpointUpload = endpointUpload;
  }

  public String getEndpointManager() {
    return endpointManager;
  }

  public void setEndpointManager(String endpointManager) {
    this.endpointManager = endpointManager;
  }

  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public String getAccessKeySecret() {
    return accessKeySecret;
  }

  public void setAccessKeySecret(String accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
