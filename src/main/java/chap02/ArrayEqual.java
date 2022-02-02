package chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEqual {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = createArrays(br);
        int[] array2 = createArrays(br);
        System.out.println("두배열은 " + (equalsArray(array1, array2) ? "같습니다" : "다릅니다"));
    }

    private static boolean equalsArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        // success
        return true;
    }

    private static int[] createArrays(BufferedReader br) throws IOException {
        System.out.print("배열의 요솟수를 입력해 주세요 : ");
        int num = Integer.parseInt(br.readLine());
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("요소값을 입력해 주세요 : ");
            numbers[i] = Integer.parseInt(br.readLine());
        }
        return numbers;
    }
}
