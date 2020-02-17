
public class ko4_5a 
    {
     public class node  
	{
	int data;
	node next;
	}
     public static void main(String args[])
	{
	node head=new node(1,null);
        node t;
	int n,m=5;
	for (n=1;n<=m;n++)
	   {
	    node p;
	    p.data=n;   
	    t.next=p;
	    t=p;
	    }
	head=head.next;
	t=head;
	while(head!=null)
	    {
            System.out.print(head.data+"->");
	    head=head.next;
	    }
	System.out.println("null");
	}
     }