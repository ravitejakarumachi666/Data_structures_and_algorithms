package stack;

class Node {
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}

class stack{
	static Node head;
	static int top;
	stack(){
		head=null;
		top=-1;
	}
	
	public static boolean push(int item) {
		Node temp=new Node(item);
		top++;
		temp.next=head;
		head=temp;
		return true;
	}
	
	public static int pop() {
		if(head==null) return -1;
		top--;
		int res=head.data;
		head=head.next;
		return res;
	}
	
	public static int peek() {
		if(head==null) return -1;
		return head.data;
	}
	
	public static boolean isEmpty() {
		return head==null;
	}
	
	public static int size() {
		return top+1;
	}
	
}


public class linked_list_implementation_using_linked_ist {

	public static void main(String[] args) {
		stack s=new stack();
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.peek());
	}

}
