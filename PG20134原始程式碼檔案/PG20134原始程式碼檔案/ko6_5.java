import java.io.*;
public class ko6_5
    {
     public static int [][]cost=new int[20][20];
     public static int n,k,m,c1;
     public static int a[]=new int[20];
     public static int b[]=new int[20];
     public static int c[]=new int[20];
     public static void main(String args[])throws IOException
	{
	int p,x,y,t,temp=1;
	String str1,str2,str3,str4,str5,str6;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("花費最小擴張樹：");
	System.out.print("欲輸入頂點總數：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.print("欲輸入頂點的數目：");
	str2=keyin.readLine();
	p=Integer.parseInt(str2);
	System.out.println("請輸入"+p+"個頂點：");
	for (k=1;k<20;k++)
	   {
	    a[k]=0;
	    b[k]=0;
	    c[k]=0;
	   }
	for (k=1;k<=n;k++)
	    for (m=1;m<=n;m++)
		cost[k][m]=0;
	while(p>=temp)
	    { 
	    System.out.print("從頂點：");
	    str3=keyin.readLine();
	    x=Integer.parseInt(str3);
	    System.out.print("到頂點：");
	    str4=keyin.readLine();
	    y=Integer.parseInt(str4);
	    System.out.print("輸入加權數：");
	    str5=keyin.readLine();
	    t=Integer.parseInt(str5);
	    cost[x][y]=t;
	    cost[y][x]=t;
	    temp++;
	    }  
	display();
	str6=keyin.readLine();
	c1=Integer.parseInt(str6);
	mst();
	}
      public static void display()
	{
	System.out.println("相鄰陣列為：");
	for (k=1;k<=n;k++)
	    {
	    for (m=1;m<=n;m++)
		System.out.print(cost[k][m]+"  ");
	    System.out.println();
	    }
	}
      public static void mst()
	{
	int j,i,d=0,temp;
	System.out.println("花費最小擴張樹的結果：");
	System.out.print("輸入起始位址：");
	for (j=1;j<n;j++)
            {temp=32767;
	     a[c1]=-1;
	     for (i=1;i<=n;i++)
		{
		if (cost[c1][i]!=0 && a[i]==0 && b[i]==0)
		   {
		    b[i]=cost[c1][i];
		    c[i]=c1;
		   }
		else if (cost[c1][i]!=0 && a[i]==0  && cost[c1][i]<b[i] && b[i]!=0)
		   {
		    b[i]=cost[c1][i];
		    c[i]=c1;
		   }
		if (b[i]!=0 && b[i]<temp && a[i]==0)
		   {
		    temp=b[i];
		    d=i;
		   }
		}
	     c1=d;
	     b[c1]=0;
	     System.out.println(c[c1]+"-"+c1);
	    }
	}
     }