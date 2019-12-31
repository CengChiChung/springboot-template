package com.chichung.springboot_template.controller;

import com.chichung.springboot_template.bean.AliyunInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  private AliyunInfo aliyunInfo;

  @RequestMapping("hello")
  public String hello() {
    System.out.println(aliyunInfo.getAppKey());
    System.out.println(aliyunInfo.getAppSecret());
    System.out.println(aliyunInfo.getBucket());
    System.out.println(aliyunInfo.getEndPoint());
    return "Hello world";
  }
}
