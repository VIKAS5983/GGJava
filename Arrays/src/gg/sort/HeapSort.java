package gg.sort;

import gg.Utils.ArrayUtils;

public class HeapSort {
	public static void main(String args[]){
		
		int arr[]={12, 11, 13, 5, 6, 7};
		heapSort(arr);

		ArrayUtils.printArray(arr);
	}
	public static void heapSort(int arr[]){
		
		int n=arr.length;
        for (int i = n - 1; i >=0; i--) {
			heapify(arr, i, n);			
		}
        
		ArrayUtils.printArray(arr);

	        for (int i=arr.length-1; i>=0; i--) 
	        { 
	            // Move current root to end 
	            int temp = arr[0]; 
	            arr[0] = arr[i]; 
	            arr[i] = temp; 
	  
	            // call max heapify on the reduced heap 
	            heapify(arr, 0, i); 
	        } 

	}
	

	public static void heapify(int arr[], int currN, int length){
		
		if(currN>length){
			return;
		}

		int leftChild=2*currN+1;
		int rightChild=2*currN+2;
		int maxIndex;
		if(leftChild < length && rightChild < length){
		 maxIndex=arr[leftChild]>arr[rightChild]?leftChild:rightChild;
		}else if(leftChild < length ){
			 maxIndex=leftChild;
		}else{
			return;
		}
		
		if(arr[currN]<arr[maxIndex]){
			int tem=arr[currN];
			arr[currN]=arr[maxIndex];
			arr[maxIndex]=tem;
			
			 heapify(arr, maxIndex, length); 
		}
				
		
		return;
	}
}
