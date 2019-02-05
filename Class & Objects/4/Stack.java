import java.util.*;
class Stack
{
	int e[]=new int[10];
    int tos=-1;
    void push(int a)
    {
      if(!isFull())
      {
       tos++;
       e[tos]=a;
      }
      else
      System.out.println("full");
    }
    void pop()
    {
      if(!isEmpty())
      {
      tos--;
      System.out.println("popped");
      }
      else
      System.out.println("empty");
    }
    boolean isEmpty()
    {
    if(tos==-1)
    return true;
    else 
    return false;
    }
    boolean isFull()
    {
    if (tos==9)
    return true;
    else 
    return false;
    }
    void spaceLeft()
    {
    int d=9-tos;
    System.out.println("Space left: "+d);
    }
    void display()
    {
        for(int i=tos;i>=0;i++)
            System.out.println(e[i]);
    }
}