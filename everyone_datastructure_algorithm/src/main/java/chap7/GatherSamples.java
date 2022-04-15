package chap7;

public class GatherSamples {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] samples = gatherSample(numbers);
        System.out.println("first = " + samples[0] + ", middle = " + samples[1] + ", last = " + samples[samples.length - 1]);
    }

    private static int[] gatherSample(int[] array) {
        int first = array[0];
        int middle = array[array.length / 2];
        int last = array[array.length - 1];
        return new int[]{first, middle, last};
    }

}
