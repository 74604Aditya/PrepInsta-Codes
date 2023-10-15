import java.util.Scanner;
import java.util.*;

public class MaxArray2
{
	static int getmax(int arr[], int n)
	{
		if(n == 1)
			return arr[0];

		return Math.max(arr[n-1],getmax(arr, n-1));
	}

	public static void main(String args[])
	{

		int arr[] = {12, 13, 1, 45, 100, 0, 20};
		int n = arr.length;
		System.out.println("Maximum number is : " + getmax(arr, n));
	}
}


