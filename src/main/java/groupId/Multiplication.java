package groupId;

import java.util.Scanner;

public class Multiplication {
  
  private static Scanner kb = new Scanner(System.in);
  private static int answer = 0;

  public static void Squares() {

    int[] table = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    boolean[] answered = new boolean[table.length];
    int square = 0;
    
    System.out.println("Squares 2-15 (-1 = Cancel)");

    square = getNextSquare(table, answered);
    while (answer != -1) {
      System.out.print("  " + square + " * " + square + " = ");
      answer = kb.nextInt();

      if (answer == square * square) {
        square = getNextSquare(table, answered);
      }
    }

    System.out.println("");
    
  }
  
  public static int getNextSquare(int[] table, boolean[] answered) {
    boolean remaining = false;
    int index = 0;

    for (int i = 0; i < answered.length; i++) {
      if (answered[i] == false) {
        remaining = true;
        break;
      }
    }

    if (!remaining) {
      for (int i = 0; i < answered.length; i++) {
        answered[i] = false;
      }
      System.out.println("  Reset\n");
    }

    do {
      index = (int) (Math.random() * table.length);
    } while (answered[index] == true);

    answered[index] = true;

    return table[index];
  }

}