import java.io.*;
public class ko7_8 
    {
     public static int []a=new int[80];
     public static int n=1;
     public static void main(String args[])throws IOException
	{
	int m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("基數排序法：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    } 
	System.out.println("原始陣列資料：");
	for (m=0;m<n;m++)
	    System.out.print(a[m]+"  ");
	System.out.println();
	radix(10);
	}
     public static void radix(int d)
	{ 
	int []t=new int[10];
	int [][]ko=new int[100][100];
	int b,num=1,i,j,m,p,s,ten=10;
	for (m=1;m<=d;m++)
	    {
	     for (j=0;j<d;j++)
		t[j]=0;
	     if (m>1)
		num*=ten;
	     s=0;
	     while(s<n)
		{
		p=a[s];
		b=(p/num)%ten;
		t[b]++;
		ko[b][t[b]]=p;
		s++;
		}
	     i=0;
	     s=0;
	     while(ten>s)
		{
		if (t[s]!=0)
		     for (j=1;j<=t[s];j++)
			{
			a[i]=ko[s][j];
			i++;
			}
		s++;
		}
	     }
	  System.out.println("輸出基數排列：");
	  for (j=0;j<n;j++)
	      System.out.print(a[j]+"  ");
	  System.out.println();
	}
     }