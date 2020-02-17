import java.io.*;
public class ko2_1 
    {
     public static void main(String args[])throws IOException
	{
	int n;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入某一個數字，以遞迴方式計算從1到此數之總和。");
	System.out.print("輸入一個數字：");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	System.out.println("1+2+3+...+"+n+"="+sum(n));
	}
     public static int sum(int x)
	{
	if (x==1)
	  return 1;
	else
	  return x+sum(x-1);
	}
     }