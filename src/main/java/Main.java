import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) throws IOException {
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();
    String operation = "";
    while (true) {
      if (operation.equals("add")) {
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(calculator.add(a, b));

      } else if (operation.equals("subtract")) {
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(calculator.subtract(a, b));

      } else if (operation.equals("multiply")) {
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(calculator.multiply(a, b));

      } else if (operation.equals("divide")) {
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(calculator.divide(a, b));

      } else if (operation.equals("fibonacci")) {
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(calculator.fibonacciNumberFinder(n));

      } else if (operation.equals("binary")) {
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(calculator.intToBinaryNumber(n));

      } else if (operation.equals("quit")){
        break;
      }
      operation = scanner.nextLine();
    }
  }
}
