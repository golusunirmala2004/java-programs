class Node{
    int data;
    Node Next;
	 Node(int n){
	     this.data=n;
		 this.Next=null;
	}
	}
	public class Nodepro{
	   public static void main(String[] args){
	       Node a=new Node(1);
		   Node b=new Node(2);
		   Node c=new Node(3);
		   a.Next=b;
		   a.Next.Next=c;
		   
		   		   System.out.println(a.data);
		   		   System.out.println(a.Next.data);
				   System.out.println(a.Next.Next.data);
	   }
	}
	
