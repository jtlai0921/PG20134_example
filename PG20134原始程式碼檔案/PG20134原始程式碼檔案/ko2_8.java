import java.io.*;
public class ko2_8 
    {
     public static void main(String args[])throws IOException
	{
	int n,i,j,sum;
        boolean []p=new boolean[256];
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入某數，以遞迴方法求1到某數的所有完美的數。");
	System.out.print("輸入一個數：");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	for (i=2;i<=n;i++)
	    {
	     sum=0;
	     for (j=1;j<=i/2;j++)
		{
		if ((i % j)==0)
		   sum=sum+j;
		}   
		   if (sum==i)
		      System.out.print("  "+i);
	     }
         }
     }