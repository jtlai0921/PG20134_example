
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
	if (top==(max))	     //�P�_���|�O�_�w�ﺡ
	    {
	    System.out.println("���|�w�ﺡ!");
	    System.exit(1);  //���}
	    }
	else
	    {
	    item[top]=ch;
	    top++;
	    }
	}
     public static void delete()
	{
	if (top==0)	    //�P�_���|�O�_�Ū�
	    {
	    System.out.println("���|�Ū�!");
	    System.exit(1);
	    }
	else
	    top--;
	}
     }