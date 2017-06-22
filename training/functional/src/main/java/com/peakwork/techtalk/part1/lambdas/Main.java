package com.peakwork.techtalk.part1.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(final String[] args) {
        List<String> namen = Arrays.asList("Peter", "Klaus", "Mario", "Steffan", "Marcel");

        // Keine Parameter
        lazyEvaluator(() -> evaluate(1), () -> evaluate(2));
        // Ein Parameter
        namen.forEach((final String name) -> System.out.println(name));
        namen.forEach(name -> System.out.println(name));
        // Mehrere Parameter
        namen.stream().reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
        // Speichern eines Lambdas
        final Predicate<String> startsWithN = name -> name.startsWith("N");

    }

    public static void lazyEvaluator(final Supplier<Integer> s1, final IntSupplier s2) {

    }

    public static int evaluate(final int number) {
        return 0;
    }

}
