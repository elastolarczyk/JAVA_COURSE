import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int count = 0;
        long avg = 0;

        while(true)
        {
            boolean hasANewInt = scanner.hasNextInt();

            if(hasANewInt)
            {
                count ++;
                number += scanner.nextInt();
            }
            else
            {
                break;
            }
        }
        avg = Math.round((double) number/count) ;
        System.out.println("SUM = " + number + " AVG = " + avg);
        scanner.close();
    }

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

}
