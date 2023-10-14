import java.util.Scanner;

class EvenOddChecker
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter a number : ");

		int number = sc.nextInt();
		
		sc.close();

		if(number % 2 == 0)
		{
			System.out.println(number +   "  is an even number.");
		}else{
			System.out.println(number +   "  is an odd number");
		}
	}
}
