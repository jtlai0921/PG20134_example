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
	System.out.println("基數搜尋法：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    } 
	System.out.print("欲輸入搜尋的數：");
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
		System.out.println("找到搜尋的數"+key+"在"+x+"櫃子內!");
		flag=true;
		}
	if (flag==false)
	    System.out.println("找不到搜尋的數："+key);
	}
     }