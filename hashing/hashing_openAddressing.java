package hashing;

public class hashing_openAddressing {

	int arr[];
	static int size;
	int cap;
	hashing_openAddressing(int c){
		cap=c;
		size=0;
		arr =new int[cap];
		for(int i=0;i<cap;i++) {
			arr[i]=-1;
		}
	}
	
	int hash(int key) {
		return key%cap;
	}

	boolean insert(int key) {
		int  h=hash(key);
		if(size==cap)return false;
		while(arr[h]!=-1&&arr[h]!=-2&&arr[h]!=key) {
			h=(h+1)%cap;
		}
		if(arr[h]==key)return false;
		else {
			arr[h]=key;
			size++;
			return true;
		}
	}
	boolean delete(int key) {
		int h=hash(key);
		int i=h;
	   do {
		   if(arr[h]==key) {
			   arr[h]=-2;
			   size--;
			   return true;
		   }
		   h=(h+1)%cap;
	   }while(arr[h]!=-1&&h!=i);
	   return false;
	}
	boolean search(int key) {
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1) {
			if(arr[i]==key) return true;
			i=(i+1)%cap;
			if(i==h)return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		hashing_openAddressing hash=new hashing_openAddressing(7);
		hash.insert(5);
		hash.insert(7);
		hash.insert(6);
		hash.insert(4);
		hash.insert(8);
		hash.insert(2);
		hash.insert(9);
		System.out.println(hash.search(4));
		System.out.println(hash.delete(6));
		System.out.println(size);
		System.out.println(hash.search(6));
		System.out.println(hash.delete(6));
		System.out.println(hash.search(9));
		System.out.println(hash.insert(1));
		System.out.println(size);
	}

}
