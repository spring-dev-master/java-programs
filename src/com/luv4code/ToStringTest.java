package com.luv4code;

public class ToStringTest {

    private int id;
    private String name;
    private String city;

    public ToStringTest(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return id + " " + name + " " + city;
    }

    public static void main(String[] args) {
        ToStringTest test = new ToStringTest(1, "Madhav", "HYD");
        ToStringTest test1 = new ToStringTest(2, "Kohli", "DEL");
        System.out.println(test);
        System.out.println(test1);
    }
}
