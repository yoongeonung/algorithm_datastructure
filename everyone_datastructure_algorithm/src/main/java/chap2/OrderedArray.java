package chap2;

import java.util.List;

public class OrderedArray {

    public static void main(String[] args) {
        int result = linearSearch(List.of(1, 2, 3, 4, 5, 6, 7), 3);
        System.out.println(result);
    }

    // 선형검색, 찾는값의 인덱스를 반환, 없을경우 -1을 반환
    private static int linearSearch(List<Integer> array, int searchValue) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == searchValue) {
                return i;
            } else if (array.get(i) > searchValue) {
                break;
            }
        }
        return -1;
    }

    // 이진검색

}
