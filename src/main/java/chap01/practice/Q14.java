package chap01.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                strb.append("*");
            }
            strb.append("\n");
        }
        System.out.println(strb);
    }
}
