package com.jdk8study;

public class Main {

    public static void main(String[] args) {
        // 二进制的运算
        int a = 0 & 15;
        int b = 32 & 15;
        System.out.println("0 & 15 = " + a + ", 32 & 15 = " + b);

        int c = 1 & 15;
        int d = 17 & 15;
        System.out.println("1 & 15 = " + c + ", 17 & 15 = " + d);

    }
}
