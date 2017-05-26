package org.enafynn.playground.examples.books.functional.applying;

public class PickStockParallel extends PickStockFunctional {
  public static void main(String[] args) {
    findHighPriced(Tickers.symbols.parallelStream());
  }
}
