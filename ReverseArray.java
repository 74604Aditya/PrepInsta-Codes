import java.util.Scanner;

public class ReverseArray
{
	public static void main(String args[])
	{
		int arr[] = {10, 20, 30, 40, 50, 60};

		int n = arr.length;

		System.out.println("Reverse order of array : ");

		//for(int i = n - 1; i < arr.length ; i--)
		for(int i = n - 1; i >=0  ; i--)
		{
			System.out.println(arr[i] + " ");
		}
	}
}
