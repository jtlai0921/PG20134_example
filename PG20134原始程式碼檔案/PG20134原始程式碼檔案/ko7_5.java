import java.io.*;
public class ko7_5 
    {
     public static int []a=new int[80];
     public static int []a1=new int[80];
     public static int []a2=new int[80];
     public static int t;
     public static void main(String args[])throws IOException
	{
	int i,k=1;
	int x,y,z;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("合併排序法(由小排到大)：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	t=Integer.parseInt(str1);
	System.out.println("請輸入"+t+"個數：");
	for (i=0;i<t;i++)
	    {
	    str2=keyin.readLine();
	    a[i]=Integer.parseInt(str2);
	    }
	System.out.println("合併排序法的結果：");
	for(x=1;x<t;x=(int)Math.pow(2,k++))
	   {
	    for(y=0;x+y<t;y+=(int)Math.pow(2,x))
		{
		for (z=0;z<x;z++)
  		    {
		     a1[z]=a[y+z];
		     a2[z]=a[x+y+z];
		    }
	        msort(x,y); 
		}
	    }
	}
     public static void msort(int x,int y)
	{
	int i=0,j=0,b,c;
	c=x;
	if (2*x+y>t)
	    c=t-x-y;
	while(i<x||j<c)
	    {
	    if (i!=x && j!=c)
		{
		if (a1[i]<=a2[j])
   		    a[i+j+y]=a1[i++];
		else if (a1[i]>=a2[j])
   		    a[i+j+y]=a2[j++];
	        }
	     else
	        {
		if (j==c)
		   a[i+j+y]=a1[i++];
		else if (i==x)
   		    a[i+j+y]=a2[j++];
	        }
	    }
	for (b=0;b<t;b++)
	    {
	     if (b>=y && b<y+2*x)
		System.out.print(a[b]+"  ");
	     else 
		System.out.print("    ");
	     }
	System.out.println();
	}
     }