import java.util.*;
public class ko4_8
    {
     public static void main(String args[])
	{
	int n=1,m=5;
	String num[]={"1","2","3","4","stop"};
	LinkedList ld=new LinkedList();
	System.out.println("�R���쵲��C�e�ݤ���!");
	while(n<=m)
	     {
	     ld.addLast(num[n-1]);
	     n++;
	     }
	ld.removeFirst();
	while(ld.getFirst()!="stop")
	     {
	     System.out.print(ld.getFirst()+"->");
	     ld.removeFirst();
	     }
	System.out.print("null");
	}
     }