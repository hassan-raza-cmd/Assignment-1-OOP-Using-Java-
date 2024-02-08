import java.util.Random;

public class question2A
{
    public static void main(String[] args)
    {
        // Create an instance of the Random class
        Random random = new Random();

        int height = random.nextInt(10) + 1;
        int radius = random.nextInt(10) + 1 ;

        System.out.println("Radius: " + radius );
        System.out.println("Height: " + height );

        //volume V=πhr^2
        final float PI = 3.1416f ;
        float volume = PI * height * radius * radius ;

        // Surface Area = 2πr(h+r)
        float area = 2 * PI * radius * (height * radius);

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + area);

    }
}
