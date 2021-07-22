import java.util.Arrays;
import java.util.Scanner;

public class insertion_sort {

	public static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int num=arr[i];
			int j=i;
			while(j>0&&num<arr[j-1]) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=num;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
