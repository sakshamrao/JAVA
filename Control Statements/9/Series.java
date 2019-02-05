import java.util.*;
 public class Series
 {
	public static void main(String args[])
	{
		int x,i,j,k,n;
		float num,num2,term,series=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		x=in.nextInt();
		System.out.print("Enter thr number of terms: ");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			num=1;
			for(j=0;j<i;j++)
				num=num+x;
			num2=1;
			for(k=0;k<i;k++)
				num2=num2*j;
			term=num/num2;
		System.out.println(series=series+term);
		}
	}
}
