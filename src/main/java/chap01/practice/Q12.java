package chap01.practice;

public class Q12 {
    public static void main(String[] args) {
        /*
         * 연습문제Q12
         * 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하시오.
         * 구분선은 수직선 기호(|), 마이너스 기호(-), 플러스 기호(+)를 사용하시오.
         */

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 12; i++) {
            if (i == 1) {
                sb.append(String.format("%3s", ""));
                sb.append(String.format("%3s", "|"));
            } else if (i == 2) {
                sb.append(String.format("%3s", "-"));
                sb.append(String.format("%3s", "+"));
            } else {
                sb.append(String.format("%3d", i - 2));
                sb.append(String.format("%3s", "|"));
            }
            for (int j = 1; j < 10; j++) {
                if (i == 2) {
                    sb.append(String.format("%3s", "-"));
                } else if (i > 2) {
                    sb.append(String.format("%3d", (i - 2) * j));
                } else {
                    sb.append(String.format("%3d", i * j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
