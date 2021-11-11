package chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3개의 정숫값을 입력받아 최대값을 구하기
 */
public class Max3 {
    public static void main(String[] args) throws IOException {
//        long start = System.currentTimeMillis();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("세 정수의 최대값을 구합니다");
//        System.out.print("a의 값 : ");
//        int a = scanner.nextInt();
//        System.out.print("b의 값 : ");
//        int b = scanner.nextInt();
//        System.out.print("c의 값 : ");
//        int c = scanner.nextInt();
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println("최대값은 " + max + "입니다. ");
//        long finish = System.currentTimeMillis();
//        System.out.println("time = " + (finish - start));

        // version 2 : twice faster
        long start = System.currentTimeMillis();
        getMax();
        long finish = System.currentTimeMillis();
        System.out.println("time = " + (finish - start));
    }

    private static void getMax() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("세 정수의 최대값을 구합니다");
        System.out.print("a의 값 : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("b의 값 : ");
        int b = Integer.parseInt(br.readLine());
        System.out.print("c의 값 : ");
        int c = Integer.parseInt(br.readLine());
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("최대값은 " + max + "입니다. ");
    }
}
