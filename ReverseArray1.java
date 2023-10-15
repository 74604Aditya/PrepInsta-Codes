import java.util.Scanner;

public class ReverseArray1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array: ");
		int n =  sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elemennts in array: ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}

		reverseArray(arr);

		System.out.println("Reversed array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i] + " ");
		}

		sc.close();
	}
	
	public static void reverseArray(int[] arr)
	{
		int start = 0;
		int end = arr.length - 1;

		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}
}

