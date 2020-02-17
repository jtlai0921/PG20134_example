import java.io.*;
public class ko1_18 
    {
     public static void main(String args[])throws IOException
	{
	int []ko={23,56,113,8,56,95,159,30,16};
	int min,max,n,k;
	min=max=ko[0];
	n=ko.length();
	for (k=0;k<=n;k++)
	    {
	     if max<ko[k]
		max=ko[k];
	     if min>ko[k]
                min=ko[k];
	     }
	System.out.println("最大值="+max);
	System.out.println("最小值="+min);
	}
     }