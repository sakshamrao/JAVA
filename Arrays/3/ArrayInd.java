import java.util.*;
public class ArrayInd
{
	public static void main( String [] args)
	{
	 Scanner in=new Scanner(System.in);
	 System.out.println("enter the number of elements");
	 int n=in.nextInt();
	 int arr[]=new int[n];
	 System.out.println("enter elements");
	 for(int i=0;i<n;i++)
	 {
	  arr[i]=in.nextInt();
	 }
	 System.out.println("enter no. to be searched : ");
	 int x=in.nextInt();
	 int flag=0;
	 for(int i=0;i<n;i++)
	 {
	 	if(arr[i]==x)
	 	{
	 		System.out.println("arr["+i+"]="+x);
	 		flag=0;
	 		break;
	 	}
	 	else
	 		flag=1;
	 }
	 if(flag==1)
	 	System.out.println("Oops! element entered is not in our array");
	 System.out.println("our array is :");
	 for(int i:arr)
	 {
	 	System.out.print(" "+i+" ");
	 }
	}
}