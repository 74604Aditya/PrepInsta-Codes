import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        scanner.close();

        int sum = calculateSumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;

        // Extract and sum the digits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit;
            number /= 10; // Remove the last digit
        }

        return sum;
    }
}

