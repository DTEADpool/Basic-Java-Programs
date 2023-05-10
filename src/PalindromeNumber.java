import java.util.Scanner;

public class PalindromeNumber {

    static void palindrome(int number) {

        int remainder, reverse = 0, temporaryHold;
        temporaryHold = number;

        while(number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if(temporaryHold == reverse)
            System.out.println(temporaryHold + " is a palindrome number.");
        else
            System.out.println(temporaryHold + " is not a palindrome number.");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome : ");

        int number = scan.nextInt();
        palindrome(number);
    }
}
