import java.util.*;
public class ko4_7
    {
     public static void main(String args[])
	{
	int n=1,m=5;
	String num[]={"1","2","3","4","stop"};
	LinkedList ld=new LinkedList();
	System.out.println("¶b√Ïµ≤¶Í¶Cß¿∫›¥°§J9!");
	while(n<=m)
	     {
	     ld.addLast(num[n-1]);
	     n++;
	     }
	ld.remove("stop");//≤æ®´stop
	ld.add("9");//√Ïµ≤¶Í¶Cß¿∫›¥°§J9
	ld.add("stop");//√Ïµ≤¶Í¶Cß¿∫›¥°§Jstop 
	while(ld.getFirst()!="stop")
	     {
	     System.out.print(ld.getFirst()+"->");
	     ld.removeFirst();
	     }
	System.out.print("null");
	}
     }