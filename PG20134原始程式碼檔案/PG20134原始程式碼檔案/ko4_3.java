
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
	if (rear==max)	     //�P�_��C�O�_�w�ﺡ
	    {
	    System.out.println("��C�w�ﺡ!");
	    System.exit(1);  //���}
	    }
	else
	    {
	    q[rear]=ch;
	    rear++;
	    }
	}
     public static void delete()
	{
	if (front==rear)	    //�P�_��C�O�_�Ū�
	    {
	    System.out.println("��C�Ū�!");
	    System.exit(1);
	    }
	else
	    front++;
	}
     }