package chap01;

/*
    곱셈표 출력
 */
public class Multi99Table {
    public static void main(String[] args) {
        // 빌더가 더 빠름 빠름 빠름
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(" ===== 곱셈표 ===== ");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                stringBuilder.append(String.format("%3d", i * j));
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
