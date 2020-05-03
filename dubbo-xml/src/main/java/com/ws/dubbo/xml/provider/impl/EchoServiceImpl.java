package com.ws.dubbo.xml.provider.impl;

import com.ws.dubbo.api.EchoService;
import org.apache.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/** @author john */
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
