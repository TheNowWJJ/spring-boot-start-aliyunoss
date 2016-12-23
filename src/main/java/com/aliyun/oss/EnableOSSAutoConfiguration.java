package com.aliyun.oss;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 描述: aliyun oss 自动配置注解
 * 包名: com.aliyun.oss.
 * 作者: barton.
 * 日期: 16-12-23.
 * 项目名称: spring-boot-starter-aliyunoss
 * 版本: 1.0
 * JDK: since 1.8
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(value = {OSSAutoConfiguration.class})
public @interface EnableOSSAutoConfiguration {
}
