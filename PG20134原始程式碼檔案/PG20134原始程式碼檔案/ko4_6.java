import java.util.*;
public class ko4_6
    {
     public static void main(String args[])
	{
	int n=1,m=5;
	String num[]={"1","2","3","4","stop"};
	LinkedList ld=new LinkedList();
	System.out.println("在鏈結串列中間插入9!");
	while(n<=m)
	     {
	     ld.addLast(num[n-1]);
	     n++;
	     }
	ld.add(2,"9");
	while(ld.getFirst()!="stop")
	     {
	     System.out.print(ld.getFirst()+"->");
	     ld.removeFirst();
	     }
	System.out.print("null");
	}
     }