
public class binary_search {

	public static int iterativeBinarySearch(int[] arr,int x) {
	   int low=0;
	   int high=arr.length-1;
	   while(low<=high) {
		   int mid=(low)+(high-low)/2;
		   if(arr[mid]==x) return mid;
		   else if(arr[mid]<x) low=mid+1;
		   else high=mid-1;
	   }
	   return -1;
	}
	
	public static int recursiveBinarySearch(int[] arr,int x,int low,int high) {
		if(low<=high) {
		int mid=(low)+(high-low)/2;
		if(arr[mid]==x) return mid;
		else if(arr[mid]<x)  return recursiveBinarySearch(arr,x,mid+1,high);
		else return recursiveBinarySearch(arr,x,low,mid-1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
	   int[] arr= {2,5,6,9,10,12};
	   int x=12;
	   System.out.println(iterativeBinarySearch(arr,x));
	   System.out.println(recursiveBinarySearch(arr,x,0,arr.length-1));
	}

}
