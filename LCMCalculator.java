import java.util.Scanner;

public class LCMCalculator
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int num1 = scanner.nextInt();

		System.out.println("Enter the second number : ");
                int num2 = scanner.nextInt();

		scanner.close();

		int lcm = calculateLCM(num1, num2);
		System.out.println("LCM of " + num1 + " and " + num2 + " is : " + lcm);
	}

	public static int calculateLCM(int a, int b)
	{
		int hcf = calculateHCF(a, b);

		int lcm= (a *b) / hcf;

		return lcm;
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
