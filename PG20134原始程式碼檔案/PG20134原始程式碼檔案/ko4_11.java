import java.lang.*;
import java.util.*;
public class ko4_11
    {
     public static void main(String args[])
	{
	int n=0,m,i,j;
	String num[]={"7","1","3","4","9","6","stop"};
	String t[]=new String[80];
	m=num.length;
	LinkedList ld=new LinkedList();
	System.out.println("使用鏈結串列排序!");
	//Arrays.sort(num);
	while(n<m)
	     {
	     ld.addLast(num[n]);
	     n++;
	     }
	Arrays.sort(ld);
	while(n<m)
	     {
	     ld.addLast(t[n]);
	     n++;
	     }
	while(ld.getFirst()!="stop")
	     {
	     System.out.print(ld.getFirst()+"->");
	     ld.removeFirst();
	     }
	System.out.print("null");
	}
     }