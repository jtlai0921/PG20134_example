import java.io.*;
public class ko4_2 
    {
     public static void main(String args[])throws IOException
	{
	int []st=new int[80];
	int n,m,k=0;
	String ch;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入中序式，將轉換成後序式。");
	System.out.print("輸入一個中序式(須包含小括號)：");
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