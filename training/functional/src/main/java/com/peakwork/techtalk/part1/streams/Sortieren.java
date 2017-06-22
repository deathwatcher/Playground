package com.peakwork.techtalk.part1.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sortieren {

    public static void main(final String[] args) {
        List<String> namen = Arrays.asList("Peter", "Klaus", "Mario", "Steffan", "Marcel");

        namen.forEach(System.out::println);

        System.out.println("----------------------------------");

        namen.stream()
             .sorted((first, second) -> first.compareTo(second))
             .forEach(System.out::println);

        System.out.println("----------------------------------");

        namen.stream()
             .sorted(String::compareTo)
             .forEach(System.out::println);

        System.out.println("----------------------------------");

        namen.stream()
             .sorted(Comparator.naturalOrder())
             .forEach(System.out::println);

        System.out.println("----------------------------------");

        namen.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

}
