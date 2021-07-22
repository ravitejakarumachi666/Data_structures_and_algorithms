
public class union_of_two_sorted_arrays {

	public static void union(int[] a,int[] b) {
		int i=0,j=0;
		while(i<a.length&&j<b.length) {
			if(i>0&&a[i-1]==a[i]) {
				i++;
				continue;
			}
			if(j>0&&b[j-1]==b[j]) {
				j++;
				continue;
			}
			if(a[i]==b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			}
			else if(a[i]<b[j]) System.out.println(a[i++]);
			else System.out.println(b[j++]);
		}
		while(i<a.length) {
			if(i>0&&a[i-1]==a[i]) i++;
			else System.out.println(a[i++]);
		}
		while(j<b.length) {
			if(j>0&&b[j-1]==b[j]) j++;
			else System.out.println(b[j++]);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,1,3,3,3};
		int b[] = {1,1,1,1,3,5,7};
        union(a,b);
	}

}
