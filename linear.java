import java.util.*;
public class linear{
public static void main(String[] args)
{
int [] a=new int[5];
Scanner sc=new Scanner(System.in);
int flag=1;
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();}
int n=6;
for(int i=0;i<a.length;i++){
if(a[i]==n){
System.out.println("found in index"+i);
flag=0;
break;
}
}
if(flag==1){
System.out.println("not found");
}

}
}