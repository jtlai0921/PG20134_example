import java.io.*;
public class ko2_6 
    {
     public static void main(String args[])throws IOException
	{
	int n,m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J��ơA�H���j��k�D�̤j���]�ơC");
	System.out.print("��J�Ĥ@�ӼơG");
	str1=keyin.readLine();
	System.out.print("��J�ĤG�ӼơG");
	str2=keyin.readLine();
	n=Integer.parseInt(str1);  
	m=Integer.parseInt(str2);  
	System.out.println(gcd(n,m));
	}
     public static int gcd(int x,int y)
	{
	if (y==0)
	  return x;
	else
	  return gcd(y,x%y);
	}
     }