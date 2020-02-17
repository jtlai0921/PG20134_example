import java.io.*;
public class ko7_8a 
    {
     public static int []a=new int[80];
     //public static int []rad=new int[255];
     public static int n,base=10;
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
	radix(5);
	}
     public static void radix(int digit)
	{ 
	int []count=new int[10];
	int [][]aux=new int[100][100];
	int degree=1,i,j,temp,k,t,bit;
	for (t=1;t<=digit;t++)
	    {
	     for (i=0;i<digit;i++)
		count[i]=0;
	     if (t>1)
		degree*=base;
	     for (i=0;i<n;i++)
		{
		temp=a[i];
		bit=(temp/degree)%base;
		count[bit]++;
		aux[bit][count[bit]]=temp;
		}
	     i=0;
	     for (j=0;j<base;j++)
		if (count[j]>0)
		     for (k=1;k<=count[j];k++)
			a[i++]=aux[j][k];
	     }
	  System.out.println("輸出基數排列：");
	  for (i=0;i<n;i++)
	      System.out.print(a[i]+"  ");
	  System.out.println();
	}
     }