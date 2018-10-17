package io.vertx.test;

public class Test {
  public static void main(String[] args) {
    int i = 0b10011111111111111111111111111111;
    System.out.println(i);
    System.out.println(Integer.toBinaryString(i));
    i = i >>> 10;
    System.out.println(Integer.toBinaryString(i));
  }
}
