import java.util.*;
public class reversestr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=" ";
		for(int i=a.length()-1;i>-1;i--){
		b=b+a.charAt(i);
		}
		System.out.println(b);
	}
}