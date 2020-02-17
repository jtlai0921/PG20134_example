import java.io.*;
public class ko2_12 
    {
     public static void main(String args[])throws IOException
	{
	int n;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入一個數，以遞迴方法求河內之塔。");
	System.out.print("輸入圓盤數：");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	towers(n,'a','b','c');
	}
     public static void towers(int i,char a,char b,char c)
	{
	if (i<=1)
	   System.out.println("移動圓盤1從圓柱"+ a +"到圓柱"+c);
	else
	   {
	   towers(i-1,a,c,b);
	   System.out.println("移動圓盤"+i+"從圓柱"+ a +"到圓柱"+c);
	   towers(i-1,b,a,c);
	   }
	}
     }