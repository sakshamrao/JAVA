import java.util.*;
class addz
{
 int firstvalue;
 int secondvalue; 
 addz(int x,int y)
 {
 firstvalue=x;
 secondvalue=y;
 }
 int addzfn()
 {
 return firstvalue + secondvalue;
 }
 addz(){
 firstvalue = 0;
 secondvalue = 0;
}
}
 //System.out.println("first value :"+firstvalue);
 //System.out.println("second value :"+secondvalue);

class addz_main
{
	public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	int a,b;
	System.out.println("enter first element :");
	a=in.nextInt();
	System.out.println("enter second element :");
	b=in.nextInt();
	addz a1=new addz(a,b);
	a1.addzfn();
    System.out.println("sum = "+a1.addzfn());
    addz a2=new addz();
	a2.addzfn();
    System.out.println("sum = "+a2.addzfn());
	}
}