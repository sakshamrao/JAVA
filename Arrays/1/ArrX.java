import java.util.*;
public class ArrX
{
	public static void main( String[] args)
	{
	 int i,j,a[][]=new int[3][3],count=0;
	 Scanner in = new Scanner(System.in);
	 System.out.println("enter the elements of an array :");
	 for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
	   a[i][j]=in.nextInt();
	  }
     }
    System.out.println("the array is : ");
     for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
	   	System.out.print(a[i][j]+" ");
	  }
	 System.out.println();
     }
     System.out.println("My ARRAY elements :");
     for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
	   System.out.println("a["+i+"]["+j+"]="+a[i][j]+" ");
	  }
	 }
	 System.out.println("NEW ARRAY elements : ");
     for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
	   System.out.println("a["+i+"]["+j+"]="+(2*a[i][j])+" ");
	  }
	 }
    }
}