import java.util.Scanner;

public class Pattern {

    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int term;
        System.out.println("Enter the number of terms : ");
        term = scan.nextInt();

        for(int i = 0; i < term; i++) {

            for(int j = 1; j <= i; j++) {

                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
