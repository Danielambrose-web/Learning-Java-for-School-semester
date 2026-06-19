import java.util.Scanner;

public class areaCal {
    public static void main(String[] args) {
        System.out.println("Area of a rectangle calculator");
        Scanner calculatorScanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = calculatorScanner.nextDouble();
               calculatorScanner.nextLine();
               

        System.out.print("Enter the name of the rectangle: ");
        String nameReg = calculatorScanner.nextLine();
 //Consume the newline characterhi


        System.out.print("Enter the width of the rectangle: ");
        double width = calculatorScanner.nextDouble();

        double area = length * width;
        System.out.println("The area of the rectangle is: " + area + "cm^2");
        System.out.println("The name of the rectangle is: " + nameReg);

        calculatorScanner.close();
    }
}
