package com.ws.dubbo.anno;

import com.ws.dubbo.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/** @author john */
@Component
public class EchoConsumer {

  @Reference
  private EchoService echoService;

  public String echo(String message) {
    return echoService.echo(message);
  }
}
