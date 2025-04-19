import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle: ");
        double length = Double.parseDouble(scan.nextLine());

        System.out.println("Enter the width of Rectangle: ");
        double width = Double.parseDouble(scan.nextLine());

        System.out.println("Enter the radius of Circle: ");
        double radius = Double.parseDouble(scan.nextLine());

        Shape rectangle = new Rectangle(length, width);
        Shape circle = new Circle(radius);

        System.out.println("Area of Rectangle is: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle is: " + rectangle.calculatePerimeter());

        System.out.println("Area of Circle is: " + String.format("%.2f", circle.calculateArea()));
        System.out.println("Perimeter of Circle is: " + String.format("%.2f", circle.calculatePerimeter()));
    }
}
