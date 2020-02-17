import java.io.*;
public class ko2_1a 
    {
     public static void main(String args[])throws IOException
	{
	int n,x,sum;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入某一個數字，以遞迴方式計算從1到此數之總和。");
	System.out.print("輸入一個數字：");
	str=keyin.readLine();
	n=Integer.parseInt(str); 
	sum=0;
 	for (x=1;x<=n;x++)
	    sum+=x;
	System.out.println("1+2+3+...+"+n+"="+sum);
	}
     }