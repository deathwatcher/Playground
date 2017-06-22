package com.peakwork.techtalk.part1.interfaces;

@FunctionalInterface
public interface Reader<T> {

    T read();

    default int helper(final T input) {
        return input.hashCode();
    }

}
