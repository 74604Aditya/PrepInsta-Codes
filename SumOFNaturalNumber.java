import java.util.Scanner;

public class SumOFNaturalNumber{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a positive integer(N) : ");
		
		int n = sc.nextInt();
		sc.close();
		
		if(n <= 0)
		{
			System.out.println("Please enter apositive number.");
		}else{
			int sum = (n * ( n + 1 )) / 2; 
			
			System.out.println("The sum of first " + n + " natural numbers is : " + sum );
	 
		}
	}
}
