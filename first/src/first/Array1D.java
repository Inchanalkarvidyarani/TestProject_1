package first;

import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int i;
		System.out.println("Enter the numbers");
		Scanner obj=new Scanner(System.in);
		for( i=0;i<10;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("array numbers are:");
		for(i=0;i<10;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}

}
