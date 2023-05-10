import java.util.Scanner;

public class Reverse {

    int reverse(int number) {
        int remainder, reverse = 0;

        while(number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to reverse : ");

        int number = scan.nextInt();

        Reverse obj = new Reverse();
        System.out.println("Reversed number : " + obj.reverse(number));
    }
}
