public class NumbersToWords {

    public static void numberToWords(int number)
    {
        int reverseNumber = reverse(number);

        if(number < 0)
        {
            System.out.println("Invalid Value");
        }

        else
        {
            for(int i = 0; i < getDigitCount(number); i++)
            {
                int digit = reverseNumber % 10;

                switch(digit)
                {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverseNumber = reverseNumber / 10;
            }
        }
    }

    public static int reverse(int number)
    {
        int reverse = 0;

        while(number != 0)
        {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number)
    {
        int amountOfNumbers = 0;

        if(number < 0)
        {
            return -1;
        }
        else if(number == 0)
        {
            return 1;
        }
        else
        {
            while(number > 0)
            {
                amountOfNumbers++;
                number = number / 10;
            }
        }
        return amountOfNumbers;
    }


    public static void main(String[] args) {

        System.out.println(reverse(-159));
        numberToWords(-2);
        System.out.println("*********************");
        numberToWords(1000);
    }
}
