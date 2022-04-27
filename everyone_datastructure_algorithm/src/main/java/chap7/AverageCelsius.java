package chap7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageCelsius {

    public static void main(String[] args) {
        List<Double> fahrenheit_readings = Arrays.asList(90.1, 89.3, 86.1, 56.5, 89.1, 96.3, 84.5, 71.0);

        System.out.println(averageCelsius(fahrenheit_readings));

    }

    private static int averageCelsius(List<Double> fahrenheit_readings) {
        List<Double> celsius_numbers = new ArrayList<>();
        double sum = 0;

        for (double fahrenheit_reading : fahrenheit_readings) {
            double celsius_number = (fahrenheit_reading - 32) / 1.8;
            celsius_numbers.add(celsius_number);
        }

        for (Double celsius_number : celsius_numbers) {
            sum += celsius_number;
        }

        return (int) Math.floor(sum / celsius_numbers.size());
    }
}
