package chap2;

import java.time.LocalDate;

public class MeaningfulDivide {

    //EasyToPronunciation
    // 발음하기도 이해하기도 어려운 변수명
    private LocalDate genymdhms;
    // 발음하기 쉽고 변수명만보고도 이해할 수 있는 변수명
    private LocalDate generationTimestamp;

    // 연속적인 숫자를 덧붙인 구분은 좋지 않다.
    public static void copyCharsV1(char[] a1, char[] a2) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

    // 의미있는 구분
    public static void copyCharsV2(char[] source, char[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }
}
