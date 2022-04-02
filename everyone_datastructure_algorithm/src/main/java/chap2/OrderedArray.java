package chap2;

import java.util.List;

public class OrderedArray {

    public static void main(String[] args) {
        int resultOfLinearSearch = linearSearch(List.of(1, 2, 3, 4, 5, 6, 7,8,9,10), 11);
        int resultOfBinarySearch = binarySearch(List.of(1, 2, 3, 4, 5, 6, 7,8,9,10), 2);
        int resultOfBinarySearch2 = binarySearch(List.of(1, 2, 3, 4, 5, 6, 7,8,9,10), 8);
        int step = getStepOfBinarySearch(100_000);
        System.out.println("resultOfLinearSearch = " + resultOfLinearSearch);
        System.out.println("resultOfBinarySearch = " + resultOfBinarySearch);
        System.out.println("resultOfBinarySearch2 = " + resultOfBinarySearch2);
        System.out.println("step = " + step);
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

    // 이진검색, 정렬된 배열에서만 사용가능, 찾는값의 인덱스를 반환, 없을 경우 -1 을 반환
    private static int binarySearch(List<Integer> array, int searchValue) {
        //1. 값이 있을 수 있는 상한선과 하한선을 정한다.
        //2. 첫 하한선과 상한선은 배열의 첫째값과 마지막 값이다.
        int lowerBound = 0;
        int upperBound = array.size() - 1;

        //3. 상한선과 하한선의 사이의 중간값을 계속해서 확인하는 루프를 돈다.
        while (lowerBound <= upperBound) {
            int midPoint = (lowerBound + upperBound) / 2;
            int valueAtMidpoint = array.get(midPoint);
            //4. 루프를 돌면서 찾는 값과 중간값을 체크한다
            //5. 상한선과 하한선의 값을 바꾼고 중간 지점(midPoint)도 바꾼다.
            if (searchValue == valueAtMidpoint) {
                return midPoint;
            } else if (searchValue < valueAtMidpoint) {
                upperBound = midPoint - 1;
            } else if (searchValue > valueAtMidpoint) {
                lowerBound = midPoint + 1;
            }
        }
        //6. 끝까지 돌아서 값이 없을경우 찾는 값은 전달 받은 배열에 없다.
        return -1;
    }

    // 요소수에 따른 단계를 구하는 방법
    private static int getStepOfBinarySearch(int numberOfValue) {
        int count = 0;
        while(numberOfValue > 1) {
            count++;
            System.out.println(numberOfValue / 2);
            numberOfValue = numberOfValue / 2;
        }
        return count;
    }

}
