import java.util.Scanner;

public class AverageArray {
    public static int average(int[] array) {
        int elemInArray = array.length;
        int sum = 0;

        for (int i = 0; i < elemInArray; i++) {
            sum += array[i];
        }

        return sum / elemInArray;
    }

    public static double average(double[] array) {

        int elemInArray = array.length;
        double sum = 0;
        for (int i = 0; i < elemInArray; i++) {
            sum += array[i];

        }
        double average = sum / elemInArray;
        return average;

    }

    public static void main(String[] args) {
        double[] values = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ten double values: ");

        for (int i = 0; i < 10; i++) {
            values[i] = input.nextDouble();
        }
        double toPrint = average(values);
        System.out.println(toPrint);
    }
}
