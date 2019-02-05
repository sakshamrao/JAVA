import java.util.*;
public class ArrY
{
	public static void main( String[] args)
	{
	 int flag=0,x,i,j,a[][]=new int[3][3],sum=0,max,min,max2,sum2=0,sum3=0,count=0,count2=0,num=0;
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
	   sum=sum+a[i][j];
	  }
	 }
	 max=max2=a[0][0];
     min=a[0][0];
     for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
        if(a[i][j]>max)
        	max=a[i][j];
       }
     }
     for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
        if(a[i][j]<max && a[i][j]>max2)
        	max2=a[i][j];
       }
     }
    for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
        if(a[i][j]<min)
        	min=a[i][j];
       }
     }
     for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
       if((i+j)%2==0)
       sum2=sum2+a[i][j]; 
       else
       sum3=sum3+a[i][j];       	
       }
     }
     
     
     for(i=0;i<3;i++)
	 { 
	  for(j=0;j<3;j++)
	  {
	  	if(a[i][j]%2==0)
	  		count++;
	  }
	 } 
	 System.out.println("Choose any 1 Option from below :");
	 num=in.nextInt();
	 System.out.println("1-ELEMENTS of an array");
	 System.out.println("2-SUM of all the elements of an array");
	 System.out.println("3-LARGEST ELEMENT in the array");
	 System.out.println("4-SMALLEST ELEMENT in the array");
	 System.out.println("5-SECOND LARGEST ELEMENT in the array");
	 System.out.println("6-SUM of ALTERNATE ELEMENTS in the array");
	 System.out.println("7-COUNT of EVEN NUMBERS in the array");
	 System.out.println("8-OCCURENCE and FREQUENCY of a given number in the array");
	 switch(num)
	 {
       case 1: for(i=0;i<3;i++)
	           { 
	            for(j=0;j<3;j++)
	             System.out.println("a["+i+"]["+j+"]="+a[i][j]+" ");
	           }
       break;
       case 2: System.out.println("SUM of elements :"+sum);
       break;
       case 3: System.out.println("LARGEST element :"+max);
       break;
       case 4: System.out.println("SMALLEST element :"+min);
       break;
       case 5: System.out.println("SECOND LARGEST element :"+max2);
       break;
       case 6: System.out.println("Sum of alternate elements from a[0][0]:"+sum2);
               System.out.println("Sum of alternate elements from a[0][1]:"+sum3);
       break;
       case 7: System.out.println("Total EVEN NUMBERS :"+count);
       break;
       case 8 : 
	  System.out.println("Enter any number :");
    	x=in.nextInt();
    	for(i=0;i<3;i++)
	   { 
	    for(j=0;j<3;j++)
	    {
	    	if(a[i][j]==x)
	  		{
	  			count2++;
	  	       flag=1;
	     	}
	    }
	   }
	   if(flag==1)
	   System.out.println("FREQUENCY of "+x+"is"+count2);
	else
		System.out.println("OOPS! no such element");
	break;
      default :
      System.out.println("OOPS! wrong choice");
    
     }
    }
}
	