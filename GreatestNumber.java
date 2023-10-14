import java.util.Scanner;

class GreatestNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number: ");
                int num2 = sc.nextInt();

		System.out.println("Enter the third number: ");
                int num3 = sc.nextInt();


		sc.close();

		int greatest;

		if(num1 >= num2 && num1 >= num3){
			greatest = num1;
		}else if(num2 >= num3 && num2 >= num1){
			greatest = num2;
		}else{
			greatest = num3;
		}
		System.out.println("The greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatest);
    }
}

