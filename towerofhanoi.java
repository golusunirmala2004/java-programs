import java.util.*;
public class towerofhanoi{
public static void fun(String s,String h,String d,int n){
 if(n==1){System.out.println("move" +n+ " from " +s+ " to " +d);
 return;}
 fun(s,d,h,n-1);
 System.out.println("move" +n+ " from " +s+ " to " +d);
 fun(h,s,d,n-1);
}
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	fun("source","helper","destinition",n);
   }
}
