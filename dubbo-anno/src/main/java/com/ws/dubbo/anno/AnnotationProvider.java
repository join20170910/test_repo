package com.ws.dubbo.anno;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/** @author john */
public class AnnotationProvider {
  public static void main(String[] args) throws IOException {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(ProviderConfiguration.class);
    context.start();
    System.in.read();
  }

  @Configuration
  @EnableDubbo(scanBasePackages = "com.ws.dubbo.anno")
  static class ProviderConfiguration {

    @Bean
    public ProviderConfig providerConfig() {
      return new ProviderConfig();
    }

    @Bean
    public ApplicationConfig applicationConfig() {
      ApplicationConfig applicationConfig = new ApplicationConfig();
      applicationConfig.setName("echo-annotation-provider");
      return applicationConfig;
    }

    // 指定 注册中心 配置信息 默认为zookeeper
    @Bean
    public RegistryConfig registryConfig() {
      RegistryConfig registryConfig = new RegistryConfig();
      registryConfig.setProtocol("zookeeper");
      registryConfig.setAddress("localhost");
      registryConfig.setPort(2181);
      return registryConfig;
    }

    // 指定 协议和端口号  默认是 指定 Dobbo
    @Bean
    public ProtocolConfig protocolConfig() {
      ProtocolConfig protocolConfig = new ProtocolConfig();
      protocolConfig.setName("dubbo");
      protocolConfig.setPort(20880);
      return protocolConfig;
    }
  }
}
