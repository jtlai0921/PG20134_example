import java.io.*;
public class ko2_1 
    {
     public static void main(String args[])throws IOException
	{
	int n;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�Y�@�ӼƦr�A�H���j�覡�p��q1�즹�Ƥ��`�M�C");
	System.out.print("��J�@�ӼƦr�G");
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