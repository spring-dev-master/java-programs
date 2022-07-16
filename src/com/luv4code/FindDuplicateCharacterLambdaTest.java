package com.luv4code;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateCharacterLambdaTest {
    public static void main(String[] args) {
        String input = "madhav ponnana akkivalasa";
        input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).forEach((k, v) -> {
            if (v > 1)
                System.out.println("Key - " + k + "  =========  " + "Value - " + v);
        });

    }
}
