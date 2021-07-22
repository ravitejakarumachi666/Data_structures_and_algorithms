import java.util.Arrays;
import java.util.Scanner;

public class merge_two_sorted_arrays {

	public static void mergeTwoSortedArrays(int[] arr1,int[] arr2) {
		 int len1=arr1.length,len2=arr2.length;
	     int i=0,j=0;
	     while(i<len1&&j<len2) {
	    	 if(arr1[i]<=arr2[j]) System.out.print(arr1[i++]);
	    	 else  System.out.print(arr2[j++]);
	     }
	     while(i<len1) System.out.print(arr1[i++]);
	     while(j<len2)  System.out.print(arr2[j++]);
	     
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		mergeTwoSortedArrays(arr1,arr2);
	}

}
