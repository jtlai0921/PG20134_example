import java.io.*;
public class ko2_5 
    {
     public static void main(String args[])throws IOException
	{
	int n,m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入兩數，以遞迴方法計算Ackermann's Function。");
	System.out.print("輸入第一個數：");
	str1=keyin.readLine();
	System.out.print("輸入第二個數：");
	str2=keyin.readLine();
	n=Integer.parseInt(str1);  
	m=Integer.parseInt(str2);  
	System.out.println(A(n,m));
	}
     public static int A(int x,int y)
	{
	if (x==0)
	  return y+1;
	else if (y==0)
	  return A(x-1,1);
	else
	  return A(x-1,A(x,y-1));
	}
     }