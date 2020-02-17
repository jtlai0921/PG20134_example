
public class ko4_1 
    {
     public static int top=0,max=4;
     public static char item[]=new char[max];
     public static void main(String args[])
	{
	int i;
	add('A');
	add('B');
	add('C');
	delete();
	add('D');
	add('E');
	for (i=1;i<top+1;i++)
	    System.out.println("item["+i+"]="+item[i-1]);
	}
     public static void add(char ch)
	{
	if (top==(max))	     //判斷堆疊是否已堆滿
	    {
	    System.out.println("堆疊已堆滿!");
	    System.exit(1);  //離開
	    }
	else
	    {
	    item[top]=ch;
	    top++;
	    }
	}
     public static void delete()
	{
	if (top==0)	    //判斷堆疊是否空的
	    {
	    System.out.println("堆疊空的!");
	    System.exit(1);
	    }
	else
	    top--;
	}
     }