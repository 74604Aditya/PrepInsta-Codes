import java.util.Scanner;

public class ReverseDigits
{
	public  static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");

	sc.close();

	int reversed = reverseNumber(int number);
	System.out.pritnln("Reversed number : " + reversed);
	}
}

public static int reverseNumber(int number)
{
	int reversed + 0;
	while(number != 0)
	{
		int digit = number % 10;
		rversed = revrsed * 10  + digit;
		number /= 10;
	}
	return reversed;
}

