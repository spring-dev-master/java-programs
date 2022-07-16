package com.luv4code;

public class StaticNonStaticDemo {
    static String name = "Madhav";

    public static void hello() {
        System.out.println("Static Method");
    }

    public void printStaticVariableAndStaticMethod() {
        System.out.println("Static Variable Value: " + name);
        hello();
    }

    public static void main(String[] args) {
        StaticNonStaticDemo demo = new StaticNonStaticDemo();
        demo.printStaticVariableAndStaticMethod();
    }
}
