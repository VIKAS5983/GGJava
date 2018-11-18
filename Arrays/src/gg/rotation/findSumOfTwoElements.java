package gg.rotation;

import gg.Utils.ArrayUtils;

public class findSumOfTwoElements {
	
		public static void main(String args[]){
			
			int[] arr={1,2,3,4,5,6,7,8,8,9,10,11};
			
			rotateArray.rotateArray(arr, 5); 
			ArrayUtils.printArray(arr);
			
			System.out.println(findTwoElementsSumInRotatedSort(arr, 21));
		}
		
		public static boolean findTwoElementsSumInRotatedSort(int[] arr, int sum){
			int i=0;
			for(i=0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					break;
				}
			}
			int n=arr.length;
		int l=i+1;
		int r=i;
		while(l!=r){
			if(arr[l]+arr[r]==sum){
				return true;
			}
			if(arr[l]+arr[r]>sum){
				r--;
				r=(r+n)%n;
			}else{
				l++;
				l=l%n;
			}
		}
			
			
			return false; 
		}
		
		
		
		
}