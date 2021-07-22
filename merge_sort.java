import java.util.Arrays;
import java.util.Scanner;

public class merge_sort {

	public static void merge(int[] arr,int low,int mid,int high) {
		int len1=mid-low+1;
		int len2=high-mid;
		int arr1[]=new int[len1];
		int arr2[]=new int[len2];
		for(int i=0;i<len1;i++) arr1[i]=arr[low+i];
		for(int i=0;i<len2;i++) arr2[i]=arr[mid+i+1];
		int i=0,j=0,k=low;
		while(i<len1&&j<len2) {
			if(arr1[i]<=arr2[j]) arr[k++]=arr1[i++];
			else arr[k++]=arr2[j++];
		}
		while(i<len1) arr[k++]=arr1[i++];
		while(j<len2) arr[k++]=arr2[j++];
	}
	
	public static void mergeSort(int[] arr,int low,int high) {
		if(high>low) {
			int mid=low+(high-low)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int low=0,high=n-1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		mergeSort(arr,low,high);
		System.out.println(Arrays.toString(arr));

	}

}
