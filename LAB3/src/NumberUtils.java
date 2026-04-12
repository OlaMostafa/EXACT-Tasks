

public class NumberUtils {

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + remainder;

        }
        return (original == reverse);
    }
    static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            reversedNumber =  (reversedNumber *10) + remainder;
        }
        return reversedNumber;
    }


    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }




    public static void main(String[] args) {

        System.out.println(isPrime(9));
        System.out.println(isPalindrome(121));
        System.out.println(reverseNumber(123));
        System.out.println(sumDigits(123));
    }
}

