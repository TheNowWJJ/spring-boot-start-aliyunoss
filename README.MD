阿里云 oss 的spring boot自动化配置
=========================

## 使用方法

### 打包发布

* 本地maven仓库
```shell
    mvn clean && mvn install -Dmaven.test.skip
```

* 私有maven仓库
    * 修改pom.xml文件中的`distributionManagement`为私有maven仓库地址
    * 部署
        ```shell
            mvn deploy -Dmaven.test.skip
        ```

### 在项目中引入如下依赖
```xml
     <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-aliyunoss</artifactId>
      <version>1.0</version>
    </dependency>
```

### 在项目中配置oss
```
oss:
  endpoint-upload: 填写自己的 # 这个是填带有bucket的地址:http://xxxx.oss-cn-shanghai.aliyuncs.com
  endpoint-manager: 填写自己的 # 这个是填不带有bucket的地址:http://oss-cn-shanghai.aliyuncs.com
  access-key-id: 填你自己的
  access-key-secret: 填你自己的
  client: #client有默认配置.
    max-connections: 1024
    socket-timeout: 50000
    connection-timeout: 50000
    connection-request-timeout: 3000
    idle-connection-time: 600000
    max-error-retry: 3
    support-cname: true
    sld-enabled: false
    protocol: http
    user-agent: aliyun-sdk-java

```