import java.util.*;
public class ko4_7
    {
     public static void main(String args[])
	{
	int n=1,m=5;
	String num[]={"1","2","3","4","stop"};
	LinkedList ld=new LinkedList();
	System.out.println("�b�쵲��C���ݴ��J9!");
	while(n<=m)
	     {
	     ld.addLast(num[n-1]);
	     n++;
	     }
	ld.remove("stop");//����stop
	ld.add("9");//�쵲��C���ݴ��J9
	ld.add("stop");//�쵲��C���ݴ��Jstop 
	while(ld.getFirst()!="stop")
	     {
	     System.out.print(ld.getFirst()+"->");
	     ld.removeFirst();
	     }
	System.out.print("null");
	}
     }