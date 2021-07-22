import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {

	public static void selectionSort(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			int min=i;
			for(int j=i+1;j<len;j++) {
				if(arr[j]<arr[min])min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
