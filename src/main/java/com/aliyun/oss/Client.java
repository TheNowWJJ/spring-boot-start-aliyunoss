package com.aliyun.oss;

import com.aliyun.oss.common.comm.Protocol;

/**
 * 描述: 客户端连接配置
 * 包名: com.sanji.
 * 作者: barton.
 * 日期: 16-12-22.
 * 项目名称: oss
 * 版本: 1.0
 * JDK: since 1.8
 */
public class Client {
  private int maxConnections = 1024; // 允许打开的最大HTTP连接数。默认为1024
  private int socketTimeout = 50000; // Socket层传输数据的超时时间（单位：毫秒）。默认为50000毫秒
  private int connectionTimeout = 50000; // 建立连接的超时时间（单位：毫秒）。默认为50000毫秒
  private int connectionRequestTimeout; // 从连接池中获取连接的超时时间（单位：毫秒）。默认不超时
  private long idleConnectionTime = 60000; // 如果空闲时间超过此参数的设定值，则关闭连接（单位：毫秒）。默认为60000毫秒
  private int maxErrorRetry = 3; // 请求失败后最大的重试次数。默认3次
  private boolean supportCname = true; // 是否支持CNAME作为Endpoint，默认支持CNAME
  private boolean sldEnabled = false; // 是否开启二级域名（Second Level Domain）的访问方式，默认不开启
  private String protocol = Protocol.HTTP.toString(); // 连接OSS所采用的协议（HTTP/HTTPS），默认为HTTP
  private String userAgent = "aliyun-sdk-java"; // 用户代理，指HTTP的User-Agent头。默认为”aliyun-sdk-java”

  public int getMaxConnections() {
    return maxConnections;
  }

  public void setMaxConnections(int maxConnections) {
    this.maxConnections = maxConnections;
  }

  public int getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(int socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public int getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(int connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public int getConnectionRequestTimeout() {
    return connectionRequestTimeout;
  }

  public void setConnectionRequestTimeout(int connectionRequestTimeout) {
    this.connectionRequestTimeout = connectionRequestTimeout;
  }

  public long getIdleConnectionTime() {
    return idleConnectionTime;
  }

  public void setIdleConnectionTime(long idleConnectionTime) {
    this.idleConnectionTime = idleConnectionTime;
  }

  public int getMaxErrorRetry() {
    return maxErrorRetry;
  }

  public void setMaxErrorRetry(int maxErrorRetry) {
    this.maxErrorRetry = maxErrorRetry;
  }

  public boolean isSupportCname() {
    return supportCname;
  }

  public void setSupportCname(boolean supportCname) {
    this.supportCname = supportCname;
  }

  public boolean isSldEnabled() {
    return sldEnabled;
  }

  public void setSldEnabled(boolean sldEnabled) {
    this.sldEnabled = sldEnabled;
  }

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

}
