package priv.leon.demo.algorithms;

public class Sort {
	public static void quickSort(int[]arr,int low,int high){
		int l = low;
		int h = high;
		int key = arr[low];
		while(l<h){
			while(l<h&&arr[h]>=key)
				h--;
			if(l<h)
				swap(arr,l,h);
			while(l<h&&arr[l]<=key)
				l++;
			if(l<h)
				swap(arr,l,h);
		}
		if(low<l)
			quickSort(arr,low,l-1);
		if(l<high)
			quickSort(arr,l+1,high);
	}
	
	public static void bubbleSort(int[]arr){//this is bubble Sort
		int l = arr.length;
		for(int i = l ; i>0;i--){
			for(int j =0 ;j<i;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void print(int[]arr){
		for (int i : arr) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]arr = {7,3,7,2,3,5,7,23,4,2,6,34,2,41,6,3,34,5,32,5,43,5,6,8};
//		int[]arr = {1,8,5,4,6,2,8};
		quickSort(arr,0,arr.length-1);
		print(arr);
		System.out.println("ok");
	}
}
