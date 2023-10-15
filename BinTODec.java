import java.util.Scanner;

public class BinTODec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Binary number : ");
		String binary = sc.nextLine();

		sc.close();

		int decimal = binaryToDecimal(binary);
		System.out.println("Decimal equivalent : " + decimal);

	}

	public static int binaryToDecimal(String binary)
	{
		int decimal = 0;
		int length = binary.length();

		for(int i =0; i < length; i++){
			char digit  = binary.charAt(i);
			int power = length - i - 1;

			if(digit == '1'){
				decimal += Math.pow(2,power);
			}
		}
		return decimal;
	}
}
