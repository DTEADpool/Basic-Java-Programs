import java.util.Scanner;

public class PrimeNumber {

    static void prime(int number) {
        int count = 0;

        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                count++;
        }
        if(count <= 0)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check prime : ");

        int number = scan.nextInt();
        prime(number);
    }
}
