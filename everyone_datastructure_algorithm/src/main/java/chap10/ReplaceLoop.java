package chap10;

public class ReplaceLoop {

  public static void main(String[] args) {

    // 10 -> 0
    countTopToBottom(10);
    countDownUsingRecursive(10);

  }

  private static void countTopToBottom(int number) {
    for (int i = number; i >= 0; i--) {
      System.out.println(i);
    }
  }

  private static void countDownUsingRecursive(int number) {
    if (number >= 0) return;
    System.out.println(number);
    countDownUsingRecursive(number - 1);
  }

}
