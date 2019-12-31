package com.chichung.springboot_template.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "aliyun")
public class AliyunInfo {

  private String appKey;

  private String appSecret;

  private String bucket;

  private String endPoint;
}
