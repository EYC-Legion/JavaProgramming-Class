import java.util.Scanner;

public class TempConv {
  public static void main(String[] args) {
    double c = 0 , f = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter temperature in Celsius: ");
    c = input.nextDouble();
    f = (9.0/5.0)*c + 32;
    System.out.println("Temperature in Fahrenheit is: " + f);
  }
}
