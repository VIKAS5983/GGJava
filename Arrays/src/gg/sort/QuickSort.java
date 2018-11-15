package gg.sort;

public class QuickSort {
	public static void main(String args[]){
		
		int arr[]={1,4,5,6,7,2,3,12,11,21,23};
		int arr1[]={17,41,5,22,54,6,29,3,13};
		int pivot=arr1.length-1;
		quickSort(arr1, 0, arr1.length-1,pivot);

		ArrayUtils.printArray(arr1);
		
	}
	
	public static void quickSort(int[] arr,int firstIndex,int lastIndex,int pivot){
		if(lastIndex-firstIndex<=1){
			return;
		}
		
		int fIter=firstIndex;
		int bIter=lastIndex-1;
		while(fIter-bIter<0){
			while(arr[fIter]<arr[pivot] && fIter<bIter){
				fIter++;
			}
			while(arr[bIter]>arr[pivot] && fIter<bIter){
				bIter--;
			}
			
			if(arr[fIter]>arr[bIter]){
				int temp=arr[fIter];
				arr[fIter]=arr[bIter];
				arr[bIter]=temp;
				fIter++; bIter--;			

			}
			
		}
		
		if(arr[pivot]<arr[bIter]){
			int temp=arr[bIter];
			arr[bIter]=arr[pivot];
			arr[pivot]=temp;
		}
			ArrayUtils.printArray(arr);

		System.out.println("First Index : "+ firstIndex +" bIter: "+bIter+" lastIndex "+ lastIndex );
		quickSort(arr,firstIndex,bIter-1,bIter-1);
		quickSort(arr,bIter+1,lastIndex,lastIndex);
		
	}

	
}
