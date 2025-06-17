import java.util.*;
public class Largestnum{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if(a>=b){
        if(a>b){
	       System.out.println(a+"is a largest number");
	   }
	    else if(a<b){
	       System.out.println(b+"is a largest number");
	   }
	   else{
	       System.out.println(a);
	   }
	}
	else if(a<=b){
	   if(b>c){
	       System.out.println(b+"is a largest number");
	   }
	    else if(b<c){
	       System.out.println(c+"is a largest number");
	   }
	   else{
	       System.out.println(b);
	   }
	}
	else{
	     System.out.println(c+"is a largest number");
	}
  }
}
