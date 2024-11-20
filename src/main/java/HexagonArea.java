import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the hexagon side: ");
        double s = input.nextDouble();
        System.out.println("The area is " + hexagonArea(s)+ "\n");
    }
    public static double hexagonArea(double s) {
        return (6*(s*s))/(4*Math.tan(Math.PI / 6));
    }
}
