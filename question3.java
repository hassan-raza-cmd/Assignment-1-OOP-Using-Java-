import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.*;

public class question3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in) ;

        System.out.print("Side 1: ");
        int a = input.nextInt() ;
        System.out.print("Side 2: ");
        int b = input.nextInt() ;
        System.out.print("Side 3: ");
        int c = input.nextInt() ;

        float semiPerimeter = (float)a+b+c / 3 ;
        float area = (float) sqrt ((semiPerimeter * (semiPerimeter-a) * (semiPerimeter-b) * (semiPerimeter-c) ));

        DecimalFormat df = new DecimalFormat("#.##");
        String areaRound = (df.format(area));

        System.out.println("Area of the triangle: " + areaRound);
    }
}

