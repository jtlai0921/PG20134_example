import java.io.*;
public class ko2_1a 
    {
     public static void main(String args[])throws IOException
	{
	int n,x,sum;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�Y�@�ӼƦr�A�H���j�覡�p��q1�즹�Ƥ��`�M�C");
	System.out.print("��J�@�ӼƦr�G");
	str=keyin.readLine();
	n=Integer.parseInt(str); 
	sum=0;
 	for (x=1;x<=n;x++)
	    sum+=x;
	System.out.println("1+2+3+...+"+n+"="+sum);
	}
     }