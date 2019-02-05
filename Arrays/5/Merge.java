import java.util.*;
public class Merge
{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
    int a[]= new int[5];
    int b[]= new int[5];
    int merge[]=new int[10];
    int k=0,j=0,i=0,x;
    System.out.print("Enter elements of array1: ");
    for(x=0;x<5;x++)
     {
		a[x]=in.nextInt();
	   }
    System.out.print("Enter elemnts of array2: ");
    for(x=0;x<5;x++)
     {
	   b[x]=in.nextInt();
	   }
     while(i<5 && j<5)
     {
      if(a[i]<b[j])
        merge[k++]=a[i++];
      else 
        merge[k++]=b[j++];
     }
     while(i<5)
      merge[k++]=a[i++];
    while(j<5)
      merge[k++]=b[j++];
    System.out.println("MERGED SORTED ARRAY :");
    for(x=0;x<10;x++)
      System.out.print(merge[x]+" ");
 }
}