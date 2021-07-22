
public class count_1s_in_sorted_binary_array {

	public static int count(int[] arr) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid==0||(arr[mid]==1&&arr[mid-1]!=1)) return arr.length-mid;
			else if(arr[mid]==0) low=mid+1;
			else high=mid-1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] arr= {0,0,0,0,0,1,1,1,1};
		System.out.println(count(arr));
	}

}
