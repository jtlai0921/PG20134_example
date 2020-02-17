import java.io.*;
public class ko2_3 
    {
     public static void main(String args[])throws IOException
	{
	int n,m;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入一個n值，以遞迴方法列出n個之費氏數列。");
	System.out.print("輸入n值：");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	for (m=1;m<=n;m++)
	    System.out.print(" "+f(m));
	}
     public static int f(int x)
	{
	if ((x==1)||(x==2))
	  return 1;
	else
	  return f(x-1)+f(x-2);
	}
     }