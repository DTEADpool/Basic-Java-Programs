import java.util.Scanner;

public class Factorial {

    static int factorial(int term) {

        if(term <= 1)
            return 1;
        else
            return (term * factorial(term - 1));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int term;

        System.out.println("Enter the term for factorial : ");
        term = scan.nextInt();

        System.out.println("Factorial of " + term + " = " + factorial(term));
    }
}
