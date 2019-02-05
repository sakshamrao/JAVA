import java.util.*;
public class TestF
{
  public static void main( String [] args)
  {
	float x,y,X,Y;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of x :");
	x=in.nextFloat();
	System.out.println("Enter the value of y :");
	y=in.nextFloat();
	X=0.3f*x;
	Y=0.3f*y;
	if (x==y)
	System .out.println("EQUAL");
	else
	System .out.println("UNEQUAL");
  }
}