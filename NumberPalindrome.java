public class NumberPalindrome {

    public static boolean isPalindrome(int number)
    {
        if(number < 0)
        {
            number = number * (-1);
        }

        int save = number;
        int reverse = 0;

        while(save > 0){
            int digit = save % 10;
            reverse = (reverse * 10) + digit;
            save = save / 10;
        }
       // System.out.println("Zamiana: " + reverse);

        if(number == reverse)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(190));
        System.out.println(isPalindrome(-11));
        System.out.println(isPalindrome(10101));
    }
}
