import java.util.*;
class book
{
	String bookName,department,author;
	int yop,bookId;
	book(int a,String b,String c,String d,int e)
	{
		bookId=a;
		bookName=b;
		department=c;
		author=d;
		yop=e;
	}
	book()
	{
		bookId=0;
		bookName=null;
		department=null;
		author=null;
		yop=0;
	}
	void displayAll()
	{
		System.out.println(bookId+"\t"+bookName+"\t"+department+"\t"+author+"\t"+yop);
	}
	
	static int bookCount()
	{
		int count=0;
		count++;
		return count;
	}
}

class bookmain
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,bi,year,search,l;
		String bn,dep,aut;
		System.out.println("Enter no.of books to be entered");
		n=in.nextInt();
		book[] arr=new book[n];
		do
		{
			System.out.println("Enter 1 to insert details\n Enter 2 to display book details with given book ID\nEnter 3 to display details of all the books");
			int k=in.nextInt();
			switch(k)
			{
				case 1:
				{
					for(int i=0;i<n;i++)
					{
						System.out.println("Enter the Book ID");
						bi=in.nextInt();
						System.out.println("Enter the Book Name");
						bn=in.nextLine();
						System.out.println();
						System.out.println("Enter Department");
						dep=in.nextLine();
						System.out.println("Enter the Author Name");
						aut=in.nextLine();
						System.out.println("Enter the Year of Publication");
						year=in.nextInt();
						arr[i]=new book(bi,bn,dep,aut,year);
					}
					break;
				}
				case 3:
				{
					System.out.println("Enter the Book ID");
					search=in.nextInt();
					for(int i=0;i<n;i++)
					{
						if(arr[i].bookId==search)
						{
							System.out.println("Book ID\tBook Name\tDepartment\tAuthor\tYear of Publication");
							arr[i].displayAll();
						}
					}
					break;
				}
				case 2:
				{
					System.out.println("Book ID\tBook Name\tDepartment\tAuthor\tYear of Publication");
					for(int j=0;j<n;j++)
					{
						arr[j].displayAll();
					}
					break;
				}
				default:
				{
					System.out.println("OOPS!! INVALID INPUT");
					break;
				}
			}
			System.out.println("Enter 0 to try again");
			l=in.nextInt();
		}
		while(l==0);
		System.out.println("Count: "+arr[0].bookCount());
	}
}