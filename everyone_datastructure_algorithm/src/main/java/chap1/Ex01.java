package chap1;

public class Ex01 {
    public static void main(String[] args) {
        printNumberV1(); // 非効率的
        printNumberV2(); // 相対的に効率
    }

    // 2~100間の偶数を出力
    private static void printNumberV1() {
        long start = System.currentTimeMillis();
        long num = 2;
        while (num <= 3_000_000L) {
            // ループを100回周る
            if (num % 2 == 0) {
//                System.out.println(num);
            }
            num++;
        }
        long finish = System.currentTimeMillis();
        System.out.println("所要時間 : " + (finish - start));
    }

    // 2~100間の偶数を出力
    private static void printNumberV2() {
        long start = System.currentTimeMillis();
        long num = 2;
        while (num <= 3_000_000L) {
            // ループを50回周る
//            System.out.println(num);
            num += 2;
        }
        long finish = System.currentTimeMillis();
        System.out.println("所要時間 : " + (finish - start));
    }
}
