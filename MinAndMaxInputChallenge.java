import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void minAndMaxInputChallenge()
    {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true; //flaga

        while(true)
        {
            System.out.print("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                int number = scanner.nextInt();

                //flaga
                if(first)
                {
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max)
                {
                    max = number;
                }
                else if(number < min)
                {
                    min = number;
                }
            }
            else
            {

                System.out.println("Minimal number: " + min + " and maximal number: " + max);
                break;
            }
        }
    }

    public static void main(String[] args) {

        minAndMaxInputChallenge();
    }
}
