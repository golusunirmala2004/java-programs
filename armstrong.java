import java.util.*;
import java.lang.*;
public class Armstrong{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
	  int m=n;
	  int l=n;
	  int count=0;
	  double sum=0;
	  while(n!=0){
		 int rem=n%10;
	  count=count+1;
	  n=n/10;
	  }
	  while(l!=0){
	    int rem=l%10;
		sum=sum+Math.pow(rem,count);
		l=l/10;
	  }
	  if(m==sum){
	     System.out.println("Armstrong");
	  }
	  else{
	    System.out.println("not a Armstrong");
	  }
   }
}
