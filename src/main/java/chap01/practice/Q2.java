package chap01.practice;

/**
 * 3개의 정숫값중에 최소값을 구하기
 */
public class Q2 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("세 정수의 최솟값을 구합니다.");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] = (int)(Math.random() * 9) + 1;
            }
            System.out.printf("min(%d, %d, %d) = %d \n ", arr[0], arr[1], arr[2], min3(arr[0], arr[1], arr[2]));
        }
    }
}
