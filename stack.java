import java.util.*;
class stack{
int [] arr=new int[5];
int top=-1;
void push(int i){
if(top==arr.length-1){
   System.out.println("stack full");
}
else{
  top++;
  arr[top]=i;
}
}
void pop(){
if(top==-1){
  System.out.println("stack empty");
}
else{
System.out.println("deleted element"+arr[top]);
top--;
}
}
void peek(){
  if(top==-1){
  System.out.println("stack empty");}
  else{
  System.out.println("peek element is"+arr[top]);}
}
  void display(){
  
  System.out.println("elements are");
  for(int i=0;i<=top;i++){
  System.out.println(arr[i]);
  }
  }
  }
  public class stackpro{
	  public static void main(String[] args){
		  Scanner sc=new Scanner(System.in);
  stack s=new stack();
  s.push(1);
  s.push(2);
  s.push(3);
  s.display();
  s.pop();
  s.display();
  s.peek();
  s.display();
}
}


