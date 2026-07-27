package com.singleton;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        System.out.println(logger1);
        System.out.println(logger2);
        System.out.println(logger3);

        System.out.println(logger1 == logger2); // true
        System.out.println(logger2 == logger3); // true
    }
}
