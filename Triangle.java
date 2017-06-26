import java.io.Console;

public class Triangle {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter side 1: ");
    String stringSide1 = console.readLine();
    Integer integerSide1 = Integer.parseInt(stringSide1);

    System.out.println("Enter side 2: ");
    String stringSide2 = console.readLine();
    Integer integerSide2 = Integer.parseInt(stringSide2);

    System.out.println("Enter side 3: ");
    String stringSide3 = console.readLine();
    Integer integerSide3 = Integer.parseInt(stringSide3);

    if ( integerSide1 >= integerSide2 + integerSide3 || integerSide2 >= integerSide1 + integerSide3 || integerSide3 >= integerSide2 + integerSide1 ) {
      System.out.println("Triangle is invalid. Please try again.");
    } else if ( integerSide1 == integerSide2 && integerSide1 == integerSide3 ) {
      System.out.println("This is an equilateral triangle!");
    } else if ( integerSide1 == integerSide2 || integerSide2 == integerSide3 || integerSide3 == integerSide1 ) {
    System.out.println("This is an isosceles triangle!");
    } else {
    System.out.println("This is a scalene triangle!");
    }
  }
}
