class Node{
    int data;
    Node Next;
	 Node(int n){
	     this.data=n;
		 this.Next=null;
	}
	}
	class linkedlist{
	Node  head=null;
	void add(int n){
	 Node newnode=new Node(n);
	 if(head==null){
	 
	 head=newnode;
	 } 
	 else{
	 Node curr=head;
	 while(curr.Next!=null){
	 curr=curr.Next;
	 }
	 curr.Next=newnode;
	 }
	}
	void addf(int n){
	Node newnode=new Node(n);
	 newnode.Next=head;
	 this.head=newnode;
	}
	void deletel(){
	Node curr=head;
	while(curr.Next.Next!=null){
	 
	  curr=curr.Next;
	}
	curr.Next=null;
	}

	void display(){
	Node curr=head;
	while(curr!=null){
	  System.out.println(curr.data);
	  curr=curr.Next;
	}
	}
	}
	public class Nodedeletelast{
	   public static void main(String[] args){
	       linkedlist l=new linkedlist();
		   l.add(1);
		   l.add(2);
		  l.add(7);
		  l.addf(5);
		  l.addf(8);
		  l.deletel();
		  l.deletel();
		  l.display();
	   }
	}
	
