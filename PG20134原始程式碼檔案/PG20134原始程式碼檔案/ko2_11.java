import java.io.*;
public class ko2_11 
    {
     public static void main(String args[])throws IOException
	{
	int n,m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入兩數，以遞迴方法求組合公式。");
	System.out.print("輸入第一個數：");
	str1=keyin.readLine();
	System.out.print("輸入第二個數：");
	str2=keyin.readLine();
	n=Integer.parseInt(str1);  
	m=Integer.parseInt(str2);  
	System.out.println(comb(n,m));
	}
     public static int comb(int x,int y)
	{
	if ((y==0)||(x==y))
	  return 1;
	else
	  return comb(x-1,y)+comb(x-1,y-1);
	}
     }