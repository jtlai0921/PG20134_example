import java.io.*;
public class ko2_2 
    {
     public static void main(String args[])throws IOException
	{
	int n;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�Y�@�ӼƦr�A�H���j�覡�p��n!�C");
	System.out.print("��J�@�ӼƦr�G");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	System.out.println(n+"!="+step_prod(n));
	}
     public static long step_prod(int x)
	{
	if (x==1)
	  return 1;
	else
	  return x*step_prod(x-1);
	}
     }