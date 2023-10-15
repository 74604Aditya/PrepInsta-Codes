import java.util.Scanner;

public class HCFCalculator
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number : ");
                int num2 = scanner.nextInt();

		scanner.close();

		int hcf = calculateHCF(num1, num2);
		System.out.println("HCf of " + num1 + " and " + num2 + " is : " + hcf);
	}


	public static int calculateHCF(int a, int b)
	{
	
		if(b == 0)
		{
			return a;
		}else{
			return calculateHCF(b ,a % b);
		}
	}
}
