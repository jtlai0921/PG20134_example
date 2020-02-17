import java.io.*;
public class ko1_1 
    {
     public static void main(String args[])throws IOException
	{
	int n=1,m=1,x;
	double e=1,sum=0;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入一個x值，計算exp(x)之值。");
	System.out.print("輸入x值：");
	str=keyin.readLine();
	x=Integer.parseInt(str);  
	while(e>0.0005)
	   {
	   n=n*m;
	   e=Math.pow(x,m)/n;
           sum=sum+e;
	   m=m+1;
           }
	sum=sum+1;
	System.out.println("exp("+x+")="+sum);
	}
     }