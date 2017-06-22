package com.peakwork.techtalk.part1.streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(final String[] args) {
        List<String> namen = Arrays.asList("Peter", "Klaus", "Mario", "Steffan", "Marcel");

        // Alt
        for(String name : namen) {
            if(name.startsWith("M")) {
                System.out.println(name);
            }
        }

        System.out.println("----------------------------------");

        // Stream
        namen.stream()
             .filter(name -> name.startsWith("M"))
             .forEach(System.out::println);

    }

}
