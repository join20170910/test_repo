package com.test.spi;

import java.util.ServiceLoader;

/**
 * @author john
 */
public class PrintServiceImpl implements PrintService {
  @Override
  public void printInfo() {
    System.out.println("hello world");
  }

  public static void main(String[] args) {
      ServiceLoader<PrintService> serviceServiceLoader =
              ServiceLoader.load(PrintService.class);
      for (PrintService printService:serviceServiceLoader){
          printService.printInfo();
      }
  }
}
