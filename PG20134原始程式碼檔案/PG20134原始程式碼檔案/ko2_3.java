import java.io.*;
public class ko2_3 
    {
     public static void main(String args[])throws IOException
	{
	int n,m;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�@��n�ȡA�H���j��k�C�Xn�Ӥ��O��ƦC�C");
	System.out.print("��Jn�ȡG");
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