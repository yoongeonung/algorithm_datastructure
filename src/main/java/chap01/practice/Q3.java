package chap01.practice;

/**
 * 4개의 정숫값중에 최소값을 구하기
 */
public class Q3 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println("네 정수의 최솟값을 구합니다.");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j] = (int)(Math.random() * 9) + 1;
            }
            System.out.printf("min(%d, %d, %d, %d) = %d \n ", arr[0], arr[1], arr[2], arr[3], min4(arr[0], arr[1], arr[2],arr[3]));
        }
    }
}
