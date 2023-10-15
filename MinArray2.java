import java.util.Scanner;
import java.util.*;

public class MinArray2
{
	static int getmin(int arr[], int n)
	{
		if(n == 1)
			return arr[0];

		return Math.min(arr[n-1],getmin(arr, n-1));
	}

	public static void main(String args[])
	{

		int arr[] = {12, 13, 1, 45, 100, 0, 20};
		int n = arr.length;
		System.out.println("Minimum number is : " + getmin(arr, n));
	}
}


