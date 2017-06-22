package com.peakwork.techtalk.part1.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Output {

    public static void main(final String[] args) {
        List<String> namen = Arrays.asList("Peter", "Klaus", "Mario", "Steffan", "Marcel");

        // Alt
        Iterator<String> it = namen.iterator();
        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
        System.out.println("----------------------------------");
        for(String name : namen) {
            System.out.println(name);
        }
        System.out.println("----------------------------------");
        // Stream mit Methoden-Referenz
        namen.forEach(System.out::println);

    }

}
