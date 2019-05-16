import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of rect:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of rect:");
        double height = scanner.nextDouble();
        Rectangle rect = new Rectangle(width,height);
        System.out.println("The rectangle:");
        rect.displayRectangle();
        System.out.println("The area of rectangle is "+ rect.getArea());
        System.out.println("The perimeter of rectangle is " + rect.getPerimeter());
    }
}
