import java.util.*;
class Cardz
{
	String cz;
   Cardz(String value)
	{cz=value;}
	String getDis()
	 {
	   String s1="",s2="";
       char l=cz.charAt(0);
       char r=cz.charAt(1);
       if(l=='Q')
       s1="QUEEN";
       if(l=='k')
       s1="KING";
       if(r=='H')
       s2="HEARTS";
       if(r=='D')
       s2="DIAMONDS";
       if(r=='S')
       s2="SPADE";
       if(r=='C')
       s2="CLUBS";
       //System.out.println(l+" "+r);
       return (s1+" of "+s2);
	 }
}
class Cardz_main
{
	public static void main(String[] args)
	{
	  Scanner in=new Scanner(System.in);
	  String x;
	  System.out.println("enter a string of a required format :");
	  x=in.next();
	  Cardz c1=new Cardz(x);
	  System.out.println(c1.getDis());
	}
}