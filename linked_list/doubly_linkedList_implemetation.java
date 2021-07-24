package linked_list;

class DNode{
	int data;
	DNode next;
	DNode prev;
	DNode(int d){
		data=d;
	}
}

public class doubly_linkedList_implemetation {
	
	public static void traverse(DNode head) {
		DNode cur=head;
		while(cur!=null) {
		   System.out.print(cur.data+"<=>");
		   cur=cur.next;
		}
		System.out.println();
	}
	
	public static DNode insert_begin(DNode head,int data) {
		DNode temp=new DNode(data);
		if(head==null) return temp;
		temp.next=head;
		head.prev=temp;
		return temp;
	}
	
	public static DNode insert_end(DNode head,int data) {
		DNode temp=new DNode(data);
		if(head==null) return temp;
		DNode cur=head;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.next=temp;
		temp.prev=cur;
		return head;
	}
	
	public static DNode reverseLinkedList(DNode head) {
		if(head==null||head.next==null) return head;
		DNode cur=head;
		DNode Next=null;
		DNode Prev=null;
		while(cur!=null) {
			Next=cur.next;
			Prev=cur.prev;
			cur.next=Prev;
			cur.prev=Next;
			Prev=cur;
			cur=Next;
		}
		return Prev;
	}
	
	public static DNode delete_head(DNode head) {
		if(head==null||head.next==null) return null;
		head=head.next;
		head.prev=null;
		return head;
	}
	
	public static DNode delete_end(DNode head) {
		if(head==null||head.next==null) return null;
		DNode cur=head;
		while(cur.next!=null) {
			cur=cur.next;
		}
		cur.prev.next=null;
		return head;
	}

	public static void main(String[] args) {
	    DNode head=new DNode(10);
	    DNode temp1=new DNode(20);
	    DNode temp2=new DNode(30);
		head.next=temp1;
		temp1.prev=head;
		temp1.next=temp2;
		temp2.prev=temp1;
		
		traverse(head);
		
		head=insert_begin(head,5);
		head=insert_begin(head,3);
		traverse(head);
		
		head=insert_end(head,35);
		head=insert_end(head,40);
		traverse(head);
		
		head=reverseLinkedList(head);
		traverse(head);
		
		head=delete_head(head);
		traverse(head);
		
		head=delete_end(head);
		traverse(head);
	}
}
