package com.peakwork.techtalk.part1.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Umwandeln {

    public static void main(final String[] args) {
        List<String> namen = Arrays.asList("Peter", "Klaus", "Mario", "Steffan", "Marcel");
        List<Integer> nameSize = new ArrayList<>();

        // Alt
        for(String name : namen) {
            Integer size = name.length();
            nameSize.add(size);
        }
        nameSize.forEach(System.out::println);
        System.out.println("----------------------------------");

        // Stream mit
        List<Integer> nameSizeNew = namen.stream()
                                         .map(String::length)
                                         .collect(Collectors.toList());

        nameSizeNew.forEach(System.out::println);

        System.out.println("----------------------------------");

        String namenListe = namen.stream()
                                 .filter(name -> name.length() <= 5)
                                 .collect(Collectors.joining(",", "[", "]"));
        System.out.println(namenListe);

    }

}
