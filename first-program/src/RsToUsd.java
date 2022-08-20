//Input currency in rupees and output in USD.

import java.util.Scanner;

public class RsToUsd {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter amount to be converted in dollars");
      int amount = input.nextInt();
      System.out.println("your Rs to dollar price is " + amount * 0.013);
  }
}
