import java.io.*;
public class ko2_11 
    {
     public static void main(String args[])throws IOException
	{
	int n,m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J��ơA�H���j��k�D�զX�����C");
	System.out.print("��J�Ĥ@�ӼơG");
	str1=keyin.readLine();
	System.out.print("��J�ĤG�ӼơG");
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