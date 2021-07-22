
public class intersection_of_two_sorted_arrays {

	public static void intersection(int[] a,int[] b) {
		int i=0,j=0;
		while(i<a.length&&j<b.length) {
			if(i>0&&a[i-1]==a[i]) {
				i++;
				continue;
			}
			if(a[i]==b[j]) {	
			    System.out.println(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j]) i++;
			else j++;
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,1,3,3,3};
		int b[] = {1,1,1,1,3,5,7};
       intersection(a,b);
	}

}
