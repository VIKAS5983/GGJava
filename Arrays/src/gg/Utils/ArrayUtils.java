package gg.Utils;

public class ArrayUtils {
	public static void printArray(int [] arr){
		
		System.out.print("Data: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	public static int sumArray(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		
		return sum;
	}
	

}
