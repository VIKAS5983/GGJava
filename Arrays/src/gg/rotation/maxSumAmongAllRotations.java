package gg.rotation;

import gg.Utils.ArrayUtils;

public class maxSumAmongAllRotations {
//Maximum sum of i*arr[i] among all rotations of a given array

	
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,8,9,10,11};
		int[] arr2={8, 3, 1, 2};
		
		ArrayUtils.printArray(arr2);
		
		
		System.out.println("Rotation Index is "+getRotationIndex(arr2));
		
		int k=getRotationIndex(arr2);
		
	
		rotateArray.rotateArray(arr2, arr2.length-k);
		ArrayUtils.printArray(arr2);
		
		int value=calculateValue(arr2);
		
		System.out.println("Calculated value is "+ value);
		
		
	}
	
	static int calculateValue(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+(i*(arr[i]));
		}
		return sum;
	}
	
	public static int getRotationIndex(int[] arr){
		
		int sum=ArrayUtils.sumArray(arr);
	
		int maxIndex=0;
		int max=-1;
		int sumMax=0;
		int n=arr.length;
		for(int i=0;i<arr.length;i++){
			sumMax=sum+ (n*(arr[n-i-1]));
			if(max<sumMax){
				maxIndex=i;
				max=sumMax;
			}
		}
		
		
		return maxIndex;
	}
}
