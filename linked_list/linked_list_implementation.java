package linked_list;

 class Node{
	 int  data;
	 Node next;
	 Node(int d){
		 data=d;
	 }
 }

public class linked_list_implementation {
	
	public static void traverse_linked_list(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"->");
			cur=cur.next;
		}
		System.out.println();
		
//		recursive traversal of linked list
//		if(head==null) return ;
//		System.out.print(head.data+"->");
//		traverse_linked_list(head.next);
	}

	public static Node insert_begin(Node head,int data) {
		Node temp=new Node(data);
		temp.next=head;
		return temp;
	}
	
	public static Node insert_end(Node head,int data) {
		Node temp=new Node(data);
		if(head==null) return temp;
		Node cur=head;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next=temp;
		return head;
	}
	
	public static Node delete_begin(Node head) {
		if(head==null) return null;
		return head.next;
	}
	
	public static Node delete_end(Node head) {
		if(head==null||head.next==null) return null;
		Node cur=head;
		while(cur.next.next!=null) {
			cur=cur.next;
		}
		cur.next=null;
		return head;
	}
	
	public static Node insert_at_given_position(Node head,int pos,int data) {
		Node temp=new Node(data);
		Node dummy=new Node(0);
		dummy.next=head;
		Node cur=head;
		Node prev=dummy;
		while(pos>0) {
			pos--;
			if(pos==0) {
				prev.next=temp;
				temp.next=cur;
				break;
			}
			if(cur==null) break;
			cur=cur.next;
			prev=prev.next;
		}
		return dummy.next;
	}
	
	static int pos=0;
	public static int search(Node head,int d) {
		int pos=0;
		Node cur=head;
		while(cur!=null) {
			pos++;
			if(cur.data==d)return pos;
			cur=cur.next;
		}
		return -1;
//        recursive solution
//		if(head==null) return ;
//		pos++;
//		if(head.data==d) return ;
//		search(head.next,d);
	}
	
	public static Node insert_sorted_data(Node head,int d) {
		Node temp=new Node(d);
		if(head==null)return temp;
		Node dummy=new Node(0);
		dummy.next=head;
		Node prev=dummy;
		Node cur=head;
		while(cur!=null) {
			if(cur.data>d) {
				prev.next=temp;
				temp.next=cur;
				break;
			}
			prev=cur;
			cur=cur.next;
		}
		if(cur==null)prev.next=temp;
		return dummy.next;
	}
	
	public static void middle_element(Node head) {
		if(head==null) return ;
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
	}
	
	public static void nth_node_from_end(Node head,int n) {
		if(head==null||n<=0) return ;
		Node slow=head;
		Node fast=head;
		n--;
		while(n>0) {
			if(fast==null) return ;
			fast=fast.next;
			n--;
		}
	    while(fast.next!=null) {
	    	slow=slow.next;
	    	fast=fast.next;
	    }
	    	System.out.println(slow.data);
	    
	}
	
	public static Node reverse(Node head) {
		if(head==null||head.next==null) return head;
		Node cur=head;
	    Node prev=null;
	    Node Next=null;
	    while(cur!=null) {
	    	Next=cur.next;
	    	cur.next=prev;
	    	prev=cur;
	    	cur=Next;
	    }
	    return prev;
		
	}
	
	public static void main(String[] args) {
		 Node head=new Node(10);
		 head.next=new Node(20);
		 head.next.next=new Node(30);
		 
//		 traverse_linked_list(head);
//		 
//		 head=insert_begin(head,5);
//		 head=insert_begin(head,4);
//		 traverse_linked_list(head);
//		 
//		 head=insert_end(head,35);
//		 head=insert_end(head,40);
//		 traverse_linked_list(head);
//		 
//		 head=delete_begin(head);
//		 traverse_linked_list(head);
//		 
//		 head=delete_end(head);
//		 traverse_linked_list(head);
//		 
//		 head=insert_at_given_position(head,3,15);
//		 head=insert_at_given_position(head,1,2);
//		 head=insert_at_given_position(head,8,40);
//		 traverse_linked_list(head);
//		 
//		 int position= search(head,40);
//		 System.out.println(position);
		 
//		 head=insert_sorted_data(head,25);
//		 head=insert_sorted_data(head,5);
//		 head=insert_sorted_data(head,40);
//		 traverse_linked_list(head);
		 
//		 middle_element(head);
		 
//		 traverse_linked_list(head);
//		 nth_node_from_end(head,2);
		 
//		 head=reverse(head);
//		 traverse_linked_list(head);
	}

}
