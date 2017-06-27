package exercises;
import java.util.Scanner;
/**
 * Created by Anna Hexter on 6/27/2017.
 */
public class Kafele {
    public static void main(String[] args) {
        String username;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name:");
        username = in.nextLine();

        System.out.println("Hello, " + username);

    }
}
