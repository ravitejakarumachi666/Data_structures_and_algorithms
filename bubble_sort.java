import java.util.Arrays;
import java.util.Scanner;

public class bubble_sort {

	public static void bubbleSort(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			boolean swapped=false;
			for(int j=0;j<len-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swapped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(swapped==false) return ;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
