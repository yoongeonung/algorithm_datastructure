package chap01;

public class Max4 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println("4개의 정수중 최대값을 구합니다");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j] = (int)(Math.random() * 9) + 1;
            }
            System.out.printf("max(%d, %d, %d, %d) = %d \n", arr[0],arr[1],arr[2],arr[3], max4(arr[0],arr[1],arr[2],arr[3]));
        }
    }
}
