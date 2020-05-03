package com.ws.dubbo.xml.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/** @author john */
public class EchoProvider {

  public static void main(String[] args) throws IOException {
    // 指定 服务 暴露的配置文件
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] {"spring/echo-provider.xml"});
    // 启动服务 并暴露服务
    context.start();
    System.in.read();
  }
}
