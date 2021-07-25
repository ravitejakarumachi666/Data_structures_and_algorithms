package stack;

class Mystack{
	int cap;
	int top;
	int[] arr;
	Mystack(int c){
		cap=c;
		top=-1;
		arr=new int[cap];
	}
	public boolean push(int item) {
		if(top>=cap) return false;
		top++;
		arr[top]=item;
		return true;
	}
	public int peek() {
		if(top==-1) return -1;
		return arr[top];
	}
	public int pop() {
		if(top==-1) return -1;
		int res=arr[top];
		top--;
		return res;
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
}


public class stack_implementation_using_array {

	public static void main(String[] args) {
		Mystack s=new Mystack(10);
		s.push(5);
		s.push(10);
		s.push(15);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.peek());
	}

}
