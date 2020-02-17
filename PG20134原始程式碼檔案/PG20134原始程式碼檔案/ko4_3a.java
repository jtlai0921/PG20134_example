import java.util.*;
public class ko4_3a 
    {
     public static void main(String args[])
	{
	int n;
	queue q=new queue();
	q.add("A");
	q.push("B");
	q.push("C");
	q.pop();
	q.push("D");
	q.push("E");
	n=q.size();
	while(true)
	    {
	    try
		{
	        System.out.println("Item["+n+"]="+q.pop());
		n--;
		}
	    catch(EmptyQueueException e)
		{
		System.exit(0);
		}
	    }
	}
    }