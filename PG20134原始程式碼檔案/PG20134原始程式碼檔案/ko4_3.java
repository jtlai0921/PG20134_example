
public class ko4_3
    {
     public static int front=0,rear=0,max=10;
     public static char q[]=new char[max];
     public static void main(String args[])
	{
	int i;
	add('A');
	add('B');
	delete();
	add('C');
	delete();
	add('D');
	add('E');
	for (i=front;i<rear;i++)
	    System.out.println("q["+i+"]="+q[i]);
	}
     public static void add(char ch)
	{
	if (rear==max)	     //判斷佇列是否已堆滿
	    {
	    System.out.println("佇列已堆滿!");
	    System.exit(1);  //離開
	    }
	else
	    {
	    q[rear]=ch;
	    rear++;
	    }
	}
     public static void delete()
	{
	if (front==rear)	    //判斷佇列是否空的
	    {
	    System.out.println("佇列空的!");
	    System.exit(1);
	    }
	else
	    front++;
	}
     }