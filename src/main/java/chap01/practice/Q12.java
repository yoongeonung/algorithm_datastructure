package chap01.practice;

public class Q12 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                stringBuilder.append(String.format("%3d", i * j));
            }
            stringBuilder.append("\n");
        }

    }
}
