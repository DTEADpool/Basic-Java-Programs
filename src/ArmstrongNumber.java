import java.util.Scanner;

public class ArmstrongNumber {

    void armstrong(int number) {
        int sum = 0, remainder, tempHold;
        tempHold = number;

        while(number > 0) {
            remainder = number % 10;
            sum += Math.pow(remainder, 3);
            number /= 10;
        }

        if(tempHold == sum)
            System.out.println(tempHold + " is an armstrong number.");
        else
            System.out.println(tempHold + " is not an armstrong number.");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Enter a number to check armstrong : ");
        number = scan.nextInt();

        ArmstrongNumber obj = new ArmstrongNumber();
        obj.armstrong(number);
    }
}
