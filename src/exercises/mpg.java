package exercises;
import java.util.Scanner;
/**
 * Created by Anna Hexter on 6/27/2017.
 */
public class mpg {
    public static void main(String[] args){

        float miles;
        float gallons;
        float mi_per_gal;

        Scanner in = new Scanner(System.in);

        System.out.println("How many miles are you travelling? ");
        miles = in.nextFloat();
        System.out.println("How many gallons have you used so far?");
        gallons = in.nextFloat();

        mi_per_gal = miles/gallons;
        System.out.println("Your rate of gas use is:" + mi_per_gal + " miles/gallon");



    }
}
