package chap1;

public class Ex01 {
    public static void main(String[] args) {
        printNumberV1(); // 비효율적
        printNumberV2(); // 상대적으로 효율적
    }

    // 2~100사이의 짝수를 출력
    private static void printNumberV1() {
        long start = System.currentTimeMillis();
        long num = 2;
        while (num <= 3_000_000L) {
            // 루프를 100번 돈다
            if (num % 2 == 0) {
//                System.out.println(num);
            }
            num++;
        }
        long finish = System.currentTimeMillis();
        System.out.println("소요시간 : " + (finish - start));
    }

    // 2~100사이의 짝수를 출력
    private static void printNumberV2() {
        long start = System.currentTimeMillis();
        long num = 2;
        while (num <= 3_000_000L) {
            // 루프를 50번만 돈다
//            System.out.println(num);
            num += 2;
        }
        long finish = System.currentTimeMillis();
        System.out.println("소요시간 : " + (finish - start));
    }
}
