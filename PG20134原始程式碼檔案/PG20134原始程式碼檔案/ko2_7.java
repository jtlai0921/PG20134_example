import java.io.*;
public class ko2_7
    {
     public static void main(String args[])throws IOException
	{
	int n,i,j;
        boolean []p=new boolean[256];
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�Y�ơA�H���j��k�D1��Y�ƪ��Ҧ���ơC");
	System.out.print("��J�@�ӼơG");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	for (i=1;i<=n;i++)
	   p[i]=true;
	for (i=2;i<=n/2;i++)
	   for (j=2;j<=n/i;j++)
	      p[i*j]=false;
	for (i=2;i<=n;i++)
	   if (p[i])
	      System.out.print("  "+i);
	}
     }