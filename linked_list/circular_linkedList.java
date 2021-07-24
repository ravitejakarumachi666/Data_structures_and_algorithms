package linked_list;

class CNode{
	int data;
	CNode next;
	CNode(int d){
		data=d;
	}
}

public class circular_linkedList {

	public static void traverse(CNode head) {
		if(head==null) return;
		CNode cur=head;
		do {
			System.out.print(cur.data+"->");
			cur=cur.next;
		}while(cur!=head);
		System.out.println();
	}
	
	public static CNode insert_begin(CNode head,int  data) {
		CNode temp=new CNode(data);
		if(head==null) {
			temp.next=temp;
			return temp;
		}
		else {
			temp.next=head.next;
			head.next=temp;
			int d=temp.data;
			temp.data=head.data;
			head.data=d;
		}
		return head;
	}
	
	public static CNode insert_end(CNode head,int data) {
		 CNode temp=new CNode(data);
		 if(head==null) {
			 temp.next=temp;
			 return temp;
		 }
		 else {
			 temp.next=head.next;
			 head.next=temp;
			 
			 int d=head.data;
			 head.data=temp.data;
			 temp.data=d;
		 }
		 return head.next;
	}
	
	public static CNode delete_head(CNode head) {
		 if(head==null||head.next==null) return null;
		 head.data=head.next.data;
		 head.next=head.next.next;
		 return head;
	}
	
	public static CNode delete_kthnode(CNode head,int pos) {
		if(head==null) return null;
		if(pos==1&&head.next==null) {
			return null;
		}
		else if(pos==1) {
			int d=head.data;
			head.data=head.next.data;
			head.next=head.next.next;
			return head;
		}
		CNode cur=head;
		while(cur.next!=head&&pos>1) {
			pos--;
			if(pos==1) cur.next=cur.next.next;
			else cur=cur.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		CNode head=new CNode(10);
		head.next=new CNode(20);
		head.next.next=new CNode(30);
		head.next.next.next=head;
		
		traverse(head);
		
		head=insert_begin(head,2);
		head=insert_begin(head,1);
		traverse(head);
		
		head=insert_end(head,35);
		head=insert_end(head,40);
		traverse(head);
		
		head=delete_head(head);
		head=delete_head(head);
		traverse(head);
		
		head=delete_kthnode(head,4);
		head=delete_kthnode(head,2);
		head=delete_kthnode(head,1);
		traverse(head);
	}

}
