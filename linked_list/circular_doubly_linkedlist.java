package linked_list;

class cdnode{
	int data;
	cdnode next;
	cdnode prev;
	cdnode(int d){
		data=d;
	}
}

public class circular_doubly_linkedlist {
	
	public static void traverse(cdnode head) {
		if(head==null) return ;
		cdnode cur=head;
		do {
			System.out.print(cur.data+"->");
			cur=cur.next;
		}while(cur!=head);
		System.out.println();
	}
	
	public static cdnode insert_head(cdnode head,int data) {
		cdnode temp=new cdnode(data);
		if(head==null) {
			temp.next=temp;
			temp.prev=temp;
			return  temp;
		}
		head.prev.next=temp;
		
		temp.prev=head.prev;
		temp.next=head;
		
		head.prev=temp;
		
		return  temp;
	}
	
	public static cdnode insert_end(cdnode head,int data) {
		cdnode temp=new cdnode(data);
		if(head==null) {
			temp.next=temp;
			temp.prev=temp;
			return  temp;
		}
		head.prev.next=temp;
		
		temp.prev=head.prev;
		temp.next=head;
		
		head.prev=temp;
		
		return  head;
	}

	public static void main(String[] args) {
		cdnode head=new cdnode(10);
		cdnode temp1=new cdnode(20);
	    cdnode temp2=new cdnode(30);
	    head.next=temp1;
	    head.prev=temp2;
	    temp1.next=temp2;
	    temp1.prev=head;
	    temp2.next=head;
	    temp2.prev=temp1;
	    
	    traverse(head);
	    
	    head=insert_head(head,5);
	    head=insert_head(head,2);
	    traverse(head);
	    
	    head=insert_end(head,35);
	    head=insert_end(head,40);
	    traverse(head);
	}

}
