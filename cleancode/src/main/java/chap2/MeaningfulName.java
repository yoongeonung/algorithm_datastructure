package chap2;

import java.util.ArrayList;
import java.util.List;

public class MeaningfulName {

    // 책속에는 확실히 정의되어있지 않은 배열
    List<int[]> theList;

    // 1. 의도가 분명하지않은 변수명과 코드들
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList) {
            if (x[0] == 4) {
                list1.add(x);
            }
        }
        return list1;
    }

    // 2.
    // theList -> 게임판으로 변수명 변경
    List<int[]> gameBoard;
    // 배열에서 0번째 값은 칸의 상태를 의미
    private static final int STATUS_VALUE = 0;
    // 숫자 4의 의미는 깃발이 꽂힌상태
    private static final int FLAGGED = 4;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();
        for (int[] cell : gameBoard) {
            if (cell[STATUS_VALUE] == FLAGGED) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }

    // 3.
    // int[] 대신 간단한 클래스를 생성해서 대체
    // isFlagged()라는 좀 더 명시적인 함수를 이용해서 상수를 감추었다
//    public List<Cell> getFlaggedCells2() {
//        List<Cell> flaggedCells = new ArrayList<>();
//        for (Cell cell : gameBoard) {
//            if (cell.isFlagged()) {
//                flaggedCells.add(cell);
//            }
//        }
//        return flaggedCells;
//    }
}
