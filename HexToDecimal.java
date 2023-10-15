import java.util.Scanner;

public class HexToDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a hexadecimal number : ");
		String hexadecimal = sc.nextLine();

		sc.close();

		int decimal = hexToDecimal(hexadecimal);
		System.out.println("Decimal equivalent : " + decimal);

	}

	public static int hexToDecimal(String hexadecimal )
	{
		try{
			int decimal = Integer.parseInt(hexadecimal, 16);
		       return decimal;
		}
		catch(NumberFormatException e)
		{
			System.err.println("Invalid input.");
			return -1;
		}
	}
}
