package com.ws.dubbo.xml.consumer;

import com.ws.dubbo.api.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author john */
public class EchoConsumer {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext(new String[] {"spring/echo-consumer.xml"});

    context.start();
    EchoService echoService = (EchoService) context.getBean("echoService");
    String status = echoService.echo("Hello world");
    System.out.println(status);
  }
}
