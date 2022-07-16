package com.luv4code;

public class SingletonTest {

    public static SingletonTest test = null;

    private SingletonTest() {

    }

    public static SingletonTest getSingletonTest() {
        if (test == null) {
            test = new SingletonTest();
        }
        return test;
    }

    public static void main(String[] args) {
        System.out.println(SingletonTest.getSingletonTest().hashCode());
        System.out.println(SingletonTest.getSingletonTest().hashCode());
    }
}
