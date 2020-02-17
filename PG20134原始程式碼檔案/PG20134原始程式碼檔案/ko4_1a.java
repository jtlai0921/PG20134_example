import java.util.*;
public class ko4_1a 
    {
     public static void main(String args[])
	{
	int n;
	Stack st=new Stack();
	st.add("A");
	st.push("B");
	st.push("C");
	st.pop();
	st.push("D");
	st.push("E");
	n=st.size();
	while(true)
	    {
	    try
		{
	        System.out.println("Item["+n+"]="+st.pop());
		n--;
		}
	    catch(EmptyStackException e)
		{
		System.exit(0);
		}
	    }
	}
    }