package chap7;

public class Average {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int averageOfEvenNumbers = averageOfEvenNumber(numbers);
        System.out.println("averageOfEvenNumbers = " + averageOfEvenNumbers);
    }

    private static int averageOfEvenNumber(int[] array) {
        int sum = 0;
        int countOfEvenNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                countOfEvenNumbers++;
            }
        }

        return sum / countOfEvenNumbers;
    }
}
