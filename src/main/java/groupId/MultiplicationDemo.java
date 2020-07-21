package groupId;

import java.util.Scanner;

public class MultiplicationDemo {
  
  public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    String option = "";

    while (!option.equalsIgnoreCase("C")) {
      System.out.println("Select an option:");
      System.out.println("  S = Squares 2-15");
      System.out.println("  E = Tables 2,5,10,11");
      System.out.println("  M = Tables 3-9");
      System.out.println("  H = Tables 12-15");
      System.out.println("  C = Cancel");

      option = kb.nextLine();

      System.out.println("");

      if (option.equalsIgnoreCase("S")) {
        Multiplication.Squares();
      }
    }

  }
  
}