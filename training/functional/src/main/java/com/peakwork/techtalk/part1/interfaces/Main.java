package com.peakwork.techtalk.part1.interfaces;

public class Main {

    public static void main(final String[] args) {

        Reader<String> stringReader = () -> {
            // Mach irgendwas tolles
            // Noch mehr tolles
            return "Output";
        };

        Reader<Long> longReader = () -> 300L;

        System.out.println("stringReader result: " + stringReader.read());
        System.out.println("stringReader result: " + stringReader.helper("Test"));
        System.out.println("longReader result: " + longReader.read());
    }

}
