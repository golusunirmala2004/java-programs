import java.util.*;
public class fibonacci_rec{
public int fun(int n){
if(n<=1) return n;
return fun(n-1)+fun(n-2); 
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
fibonacci_rec f=new fibonacci_rec();
System.out.println(f.fun(n));
}
}
