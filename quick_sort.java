import java.util.Arrays;

public class quick_sort {
	
	public static int lomutoPartition(int[] arr,int low,int high) {
		int i=low-1;
		int pivotElement=arr[high];
		for(int j=low;j<high;j++) {
			if(arr[j]<pivotElement) {
				int temp=arr[j];
				arr[j]=arr[i+1];
				arr[i+1]=temp;
				i++;
			}
		}
		int temp=arr[high];
		arr[high]=arr[i+1];
		arr[i+1]=temp;
		return i+1;
	}

	public static int  hoarePartition(int[] arr,int low,int high) {
		int pivotElement=arr[low];
		int i=low-1;
		int j=high+1;
		while(i<j) {
			do {
				i++;
			}while(arr[i]<pivotElement);
			do {
				j--;
			}while(arr[j]>pivotElement);
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return j;
	}
	
	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int pivot=hoarePartition(arr,low,high);
			quickSort(arr,low,pivot);
			quickSort(arr,pivot+1,high);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {3,5,2,4,1,7,6,8,5,9};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
