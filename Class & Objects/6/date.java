import java.util.*;
class date
{
	int month,day,year;
	//user input 
	date(int m,int d,int y)
	{
		this.month=m;
		this.day=d;
		this.year=y;
	}
	//default date
	date()
	{	
		this.month=1;
		this.day=1;
		this.year=2000;
	}
	void display()
	{
		System.out.println(day+"/ "+month+"/ "+year);

	}

}
class dateTest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the month: ");
		int month=in.nextInt();
		System.out.println("Enter the day: ");
		int day=in.nextInt();
		System.out.println("Enter the year: ");
		int year=in.nextInt();
		
			date d1=new date(month,day,year);
			date d2=new date();
			System.out.println("The date formatt is:  ");
			d2.display();//default date
			System.out.println("Today'sdate is  ");
			d1.display();//user entered 
		
	}
	
}