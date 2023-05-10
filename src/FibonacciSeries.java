import java.util.Scanner;

public class FibonacciSeries {

    static void fibonacci(int n) {

        int first = 0, second = 1, next = 0, i;

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of terms : ");

//        term = scan.nextInt();
        System.out.println("The fibonacci series : ");

        for(i = 0; i < n; i++) {
            if(i <= 1)
                next += i;
            else {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.print(" " + next);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int term;
        System.out.println("Enter the term for the fibonacci series : ");
        term = scan.nextInt();

        fibonacci(term);
    }
}
