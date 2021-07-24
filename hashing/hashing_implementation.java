package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashing_implementation {
  
	int bucket;
	ArrayList<LinkedList<Integer>> table;
	
	hashing_implementation(int b){
		this.bucket=b;
		table=new ArrayList<LinkedList<Integer>>(b);
		for(int i=0;i<b;i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	
	void insert(int key) {
		int index=key%bucket;
		table.get(index).add(key);
	}
	void delete(int key) {
		int index=key%bucket;
		table.get(index).remove((Integer)key);
	}
	boolean search(int key) {
		int index=key%bucket;
		for(int i:table.get(index)) {
			if(key==i) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		hashing_implementation hashing=new hashing_implementation(7);
		hashing.insert(1);
		hashing.insert(2);
		hashing.insert(3);
		hashing.insert(4);
		hashing.insert(7);
		hashing.insert(14);
		hashing.delete(4);
		System.out.println(hashing.search(4));
	}

}
