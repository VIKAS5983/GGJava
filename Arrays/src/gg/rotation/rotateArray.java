package gg.rotation;

import gg.Utils.ArrayUtils;

import java.util.ArrayList;

public class rotateArray {
	
		public static void main(String args[]){
			
			int[] arr={1,2,3,4,5,6,7,8,8,9,10,11};
			
			rotateArray(arr, 5);
			ArrayUtils.printArray(arr);
			printLeftRotationArray(arr, 3);
		}
		
		public static void printLeftRotationArray(int[] arr,int turns){
			
			for(int i=turns;i<arr.length+turns;i++){
				System.out.print(arr[i%arr.length]+" ");
			}
			
		}
		
		public static int[] rotateArray(int[] arr, int turns){
			ArrayList<Integer> arr1 = new ArrayList<Integer>(turns);
			turns=turns%(arr.length);
			
			for(int i=0;i<turns;i++){
				arr1.add(arr[i]);
			}
			int i;
			for(i=0;i<arr.length-turns;i++){
				arr[i]=arr[i+turns];
			}
			int j=0;
			while(i<arr.length){
				arr[i]=arr1.get(j);
				i++;
				j++;
			}
			
			return arr;
		}
}
