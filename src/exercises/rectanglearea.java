package exercises;
import java.util.Scanner;

/**
 * Created by Anna Hexter on 6/27/2017.
 */
public class rectanglearea {
    public static void main(String[] args) {
        double height;
        double width;
        double area;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a height for the rectange: ");
        height = in.nextDouble();

        System.out.println("Enter a width for the rectangle: ");
        width = in.nextDouble();

        area = height*width;
        System.out.println("The area of the rectange, height is: " + area);
        area = in.nextDouble();
    }


}
