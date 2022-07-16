package com.luv4code;

import java.util.Arrays;
import java.util.List;

public class PrintNumbersStartsWith1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 30, 14, 5, 1, 111, 52, 11);

        list.stream().sorted().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}
