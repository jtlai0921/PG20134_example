import java.io.*;
public class ko8_5 
    {
     public static int []a=new int[255];
     public static int temp[][]=new int[80][80];
     public static int n,num=0;
     public static String str;
     public static void main(String args[])throws IOException
	{
	int m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��Ʒj�M�k�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    } 
	System.out.print("����J�j�M���ơG");
	str=keyin.readLine();
	num=Integer.parseInt(str);
	radix(10);
	search(num);
	}
     public static void radix(int d)
	{ 
	int b,x,i,m,num=1,ten=10;
	int c[]=new int[20];
	for (m=1;m<=d;m++)
	    {
	    for (i=0;i<d;i++)
	        c[i]=0;
	    if (m>1)
		num*=ten;
	    for (i=0;i<n;i++)
	        {
                x=a[i];
		b=(x/num)%ten;
	        c[b]++;
	        temp[b][c[b]]=x;
		}
	    }	 
	}
    public static void search(int key)
	{
	boolean flag=false;
	int x,i;
	x=key/10;
	for (i=0;i<=20;i++)
	    if (temp[x][i]==key)
		{
		System.out.println("���j�M����"+key+"�b"+x+"�d�l��!");
		flag=true;
		}
	if (flag==false)
	    System.out.println("�䤣��j�M���ơG"+key);
	}
     }