import java.io.*;
public class ko5_6 
    {
     public static int []a=new int[80];
     public static int n=8;
     public static void main(String args[])throws IOException
	{
	int m,k,t;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("決策樹：");
	System.out.println("輸入8個金幣重量：");
	for (m=0;m<n;m++)
	    {
	    str=keyin.readLine();
	    a[m]=Integer.parseInt(str);
	    } 
	if ((a[0]+a[1]+a[2])==(a[3]+a[4]+a[5]))
	    k=1;
	else if ((a[0]+a[1]+a[2])>(a[3]+a[4]+a[5]))
	    k=2;
	else 
	    k=3;
	if ((a[0]+a[3])==(a[1]+a[4]))
	    t=1;
	else if ((a[0]+a[3])>(a[1]+a[4]))
	    t=2;
	else
	    t=3;
	switch(k)
	    {
	     case 1:
		{
		if (a[6]>a[7])
		    comp(a[6],a[7],a[0]);
		else
		    comp(a[7],a[6],a[0]);
		}break;
	    case 2:
		{
		switch(t)
		    {
		     case 1:comp(a[2],a[5],a[0]);break;
		     case 2:comp(a[0],a[4],a[1]);break;
		     case 3:comp(a[1],a[3],a[0]);break;
		    }
		}break;
	    case 3:
		{
		switch(t)
		    {
		     case 1:comp(a[5],a[2],a[0]);break;
		     case 2:comp(a[3],a[1],a[0]);break;
		     case 3:comp(a[4],a[0],a[1]);break;
		    }
		}break;
	    }
	}
     public static void comp(int x,int y,int z)
	{ 
	System.out.print("比較結果:");
	if (x>z)
	    System.out.println("偽幣"+x+"公克較重");
	else
	    System.out.println("偽幣"+y+"公克較輕");
	}
     }