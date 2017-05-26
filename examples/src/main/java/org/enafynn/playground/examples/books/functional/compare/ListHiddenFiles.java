/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package org.enafynn.playground.examples.books.functional.compare;

import java.io.File;
import java.util.Arrays;

public class ListHiddenFiles {
  public static void main(String[] args) {

    final File[] files = new File(".").listFiles(file -> file.isHidden());

    new File(".").listFiles(File::isHidden);

    Arrays.stream(files).forEach(System.out::println);
  }
}
