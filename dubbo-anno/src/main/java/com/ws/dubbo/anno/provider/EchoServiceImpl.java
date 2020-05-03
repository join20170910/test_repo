package com.ws.dubbo.anno.provider;

import com.ws.dubbo.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/** @author john 基于注解方式 */
@Service
public class EchoServiceImpl implements EchoService {
  @Override
  public String echo(String message) {
    String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
    System.out.println(
        "["
            + now
            + "] hello "
            + message
            + ", request from consumer: "
            + RpcContext.getContext().getRemoteAddress());
    return message;
  }
}
