import java.util.Scanner;

public class TipCalc {
  public static void main (String[] args){
    double subtotal;
    double rate;
    double gratuity;
    double total;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal: ");
    subtotal = input.nextDouble();
    System.out.print("Enter the gratuity rate: ");
    rate = input.nextDouble();
    gratuity = (subtotal * rate) / 100;
    total = subtotal + gratuity;
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
  }
}
