import java.util.*;
class Stack_main
{
	public static void main(String[] args)
	{
	 Scanner in=new Scanner(System.in);
	 int num,a;
	 char ch;
	 Stack s1=new Stack();
	 do{
	 System.out.println("Choose from following: ");
	 System.out.println("1-push");
	 System.out.println("2-pop");
	 System.out.println("3-isEmpty");
	 System.out.println("4-isFull");
	 System.out.println("5-spaceleft");
	 num=in.nextInt();
	 switch(num)
	 {
	  case 1: System.out.println("enter any number");
	           a=in.nextInt();
	          s1.push(a);
	    break;
	  case 2:{
	  	s1.pop();
	    break;
	 }
	  case 3:{
	  	
	    System.out.println(s1.isEmpty());
	    break;
	}
	  case 4:
	  {    
	       System.out.println(s1.isFull());
	    break;
	}
	  case 5:
	  s1.spaceLeft();
	  break;
	  default :
	  System.out.println("invalid input");
	 }
	 System.out.println("4 continue press Y");
	 ch=in.next().charAt(0);
	}
	while(ch=='Y');
   }
}