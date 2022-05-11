package chap10;

public class Factorial {

  public static void main(String[] args) {
    int factorial = numberFactorial(5);
    System.out.println("factorial = " + factorial);
  }

  private static int numberFactorial(int number) {
    // bass case = 1
    if (number == 1) {
      return 1;
    }
    return number * numberFactorial(number - 1);
  }

}
