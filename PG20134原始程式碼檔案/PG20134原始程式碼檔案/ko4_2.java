import java.io.*;
public class ko4_2 
    {
     public static void main(String args[])throws IOException
	{
	int []st=new int[80];
	int n,m,k=0;
	String ch;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J���Ǧ��A�N�ഫ����Ǧ��C");
	System.out.print("��J�@�Ӥ��Ǧ�(���]�t�p�A��)�G");
	ch=keyin.readLine();
	n=ch.length();
	for (m=0;m<n;m++)
	    {
	     if (((ch.charAt(m)>='A') && (ch.charAt(m)<='Z')) || ((ch.charAt(m)>='a') && (ch.charAt(m)<='z')))
		System.out.print(ch.charAt(m));
	     if (ch.charAt(m)=='*')
		{
		st[k]=ch.charAt(m);	
		k++;
		}
	     if (ch.charAt(m)=='/')
		{
		st[k]=ch.charAt(m);	
		k++;
		}
	     if (ch.charAt(m)=='-')
		{
		st[k]=ch.charAt(m);	
		k++;
		}
	     if (ch.charAt(m)=='+')
		{
		st[k]=ch.charAt(m);	
		k++;
		}
	     if (ch.charAt(m)==')')
		System.out.print((char)st[--k]);
	     }
         }
     }