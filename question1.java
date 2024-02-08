import java.util.Random;

public class question1
{
    public static void main(String[] args)
    {
        // Create an instance of the Random class
        Random random = new Random();

        // Array to hold the number.
        int number [] = new int [8];

        // XXX-NNN-NNNN
        // Storing Values for first 3 digits
        for (int i = 0 ; i < 3 ; i++ )
        {
            int randomDigit = random.nextInt(7)+1;
            number [i] = randomDigit ;
        }

        // NNN-XXX-NNNN
        // Storing second digit less than 831
        int max = 831;
        int min = 100 ;
        int randomDigit = random.nextInt(max - min) + 1 + min ;
        number [3] = randomDigit ;

        // NNN-NNN-XXXX
        // Storing last three digits
        for (int i = 4 ; i < 8 ; i++ )
        {
            randomDigit = random.nextInt(10) + 1 ;
            number [i] = randomDigit ;
        }

        for (int i = 0 ; i < 3 ; i++)
        {
            System.out.print(number[i]  );
        }

        System.out.print("-" + number [3] + "-");

        for (int i = 4 ; i < 8 ; i++)
        {
            System.out.print(number[i]  );
        }
    }
}
