import java.util.*;
public class copy{
public static void main(String[] args)
{
int [] a=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
int [] b=new int[a.length];
b[i]=a[i];
System.out.println(b[i]);
}
}
}

