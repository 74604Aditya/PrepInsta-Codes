import java.util.Scanner;

public class OctalToDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a octal number : ");
		String octal = sc.nextLine();

		sc.close();

		int decimal = octalToDecimal(octal);
		System.out.println("Decimal equivalent : " + decimal);

	}

	public static int octalToDecimal(String octal )
	{
		int decimal = 0;
		int length = octal.length();

		for(int i =0; i < length; i++){
			char digit  = octal.charAt(i);
			int power = length - i - 1;
			
			int digitValue = Character.getNumericValue(digit);
			decimal += digitValue * Math.pow(8,power);
		}
		return decimal;
	}
}
