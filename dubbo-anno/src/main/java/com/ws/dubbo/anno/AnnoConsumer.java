package com.ws.dubbo.anno;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/** @author john */
public class AnnoConsumer {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
    context.start();

    EchoConsumer echoConsumer = context.getBean(EchoConsumer.class);
    String message = echoConsumer.echo("Hello world ");
    System.out.println(message);
  }

  @Configuration
  @EnableDubbo(scanBasePackages = "com.ws.dubbo.anno")
  @ComponentScan(value = {"com.ws.dubbo.anno"})
  static class ConsumerConfiguration {

    @Bean
    public ApplicationConfig config() {
      ApplicationConfig applicationConfig = new ApplicationConfig();
      applicationConfig.setName("echo-annotation-consumer");
      return applicationConfig;
    }

    @Bean
    public ConsumerConfiguration consumerConfiguration() {
      return new ConsumerConfiguration();
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
  }
}
