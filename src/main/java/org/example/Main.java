package org.example;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String message = "There are %d elements in the stream %n";
        long count = Stream.of("how", "to", "do", "in", "java")
                .count();
        System.out.printf(message,count);
    }
}