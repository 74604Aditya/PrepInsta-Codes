import java.util.Scanner;


public class PrimeNumberInRange
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the lower bound of range : ");
		int lowerBound = sc.nextInt();

		System.out.println("Enter the upper bound of range : ");
                int upperBound = sc.nextInt();

		sc.close();

		System.out.println("Prime numbers in the range [" + lowerBound + ", " + upperBound + "]:  ");
        findAndPrintPrimeNumbers(lowerBound, upperBound);
    }

    public static void findAndPrintPrimeNumbers(int lower, int upper) {

	    for(int number = lower ; number <= upper; number++){
		    if(isPrime(number)){
			    System.out.println(number + " ");
		    }
	    }
    }

    public static boolean isPrime(int number)
    {
	    if(number <= 1){
		    return false;
	    }

	    for(int i = 2 ; i * i <= number ; i++){
		    if(number % i == 0){
			    return false;
		    }
	    }return true;
    }
}


