import java.util.Scanner;
import static java.lang.Math.*;

public class question2B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in) ;

        System.out.print("Point 1:\nx-coordinate: ");
        int x1 = input.nextInt() ;
        System.out.print("y-coordinate: ");
        int y1 = input.nextInt() ;

        System.out.print("\nPoint 2:\nx-coordinate: ");
        int x2 = input.nextInt() ;
        System.out.print("y-coordinate: ");
        int y2 = input.nextInt() ;

        // Euclidean distance formula.

        float distance = (float) sqrt ( pow((x1-x2),2) + pow((y1-y2),2));

        System.out.println("Euclidean distance: " + distance);


    }
}
