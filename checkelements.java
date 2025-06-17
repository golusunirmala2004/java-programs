import java.util.*;
public class Checkelements{
     public static void main(String[] args){
       int [] a=new int[5];
	   int [] b=new int[a.length];
	   Scanner sc=new Scanner(System.in);
	   for(int i=0;i<a.length;i++){
	       a[i]=sc.nextInt();
	   }
	   for(int i=0;i<a.length;i++){
	       b[i]=a[i];
	   }
	   for(int i=0;i<a.length;i++){
	       System.out.println(b[i]);
	   }
	  }
    }	  
	   
	   
	   
