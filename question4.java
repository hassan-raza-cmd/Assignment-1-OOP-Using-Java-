import java.util.Scanner;
import java.lang.String;

public class question4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in) ;
        String arr [] = new String [5] ;

        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.print("Word " + (i+1) + ":");
            String word = input.nextLine();
            arr [i] = word ;
        }
        System.out.print("\n");

        for (int i = 0 ; i < 5 ; i++)
        {
            char duplicate [] = arr[i].toCharArray() ;

            int length = duplicate.length ;

            int j = 0 ;

            for (int k = (length - 1); k >= 0; k--)
            {
                duplicate [k] = arr[i].charAt(j) ;
                j++ ;
            }

            // Convert char array back to the original string
            String check = new String(duplicate) ;

            //System.out.println("Reversed String: " + str) ;

            if (check.equals(arr[i]))
            {
                System.out.println("Word" + (i+1) + " is a Palandrome") ;
            }
            else
            {
                System.out.println("Word" + (i+1) + " is NOT a Palandrome") ;

            }
        }



    }
}
