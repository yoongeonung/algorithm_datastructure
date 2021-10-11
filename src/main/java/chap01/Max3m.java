package chap01;

public class Max3m {
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("세 정수의 최대값을 구합니다.");
        for (int i = 0; i < 13; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                int rand = (int)(Math.random() * 8) + 1;
                arr[j] = rand;
            }
            System.out.printf("max(%d, %d, %d) = %d \n",arr[0], arr[1], arr[2], max3(arr[0], arr[1], arr[2]) );
        }
    }
}
