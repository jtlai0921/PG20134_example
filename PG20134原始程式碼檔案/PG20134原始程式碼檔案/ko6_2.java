import java.io.*;
public class ko6_2
    {
     public static int [][]ko=new int[20][20];
     public static int n,k,m;
     public static void main(String args[])throws IOException
	{
	int p,x,y,temp=0;
	String str1,str2,str3,str4;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("相鄰串列表示法：");
	System.out.print("欲輸入頂點總數：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.print("欲輸入頂點的數目：");
	str2=keyin.readLine();
	p=Integer.parseInt(str2);
	System.out.println("請輸入"+p+"個頂點：");
	for (k=0;k<n;k++)
	    for (m=0;m<n;m++)
		ko[k][m]=0;
	while(p>temp)
	    { 
	    System.out.print("從頂點：");
	    str3=keyin.readLine();
	    x=Integer.parseInt(str3)-1;
	    System.out.print("到頂點：");
	    str4=keyin.readLine();
	    y=Integer.parseInt(str4)-1;
	    ko[x][y]=1;
	    temp++;
	    }  
	display();
	}
      public static void display()
	{
	System.out.println("相鄰串列為：");
	for (k=0;k<n;k++)
	    {
	    System.out.print("v"+k);
	    for (m=0;m<n;m++)
                {
		if (ko[k][m]==1)
		    {
		    if (m<n)
		       System.out.print("=>");
		    System.out.print("v"+m);
		    }
                 }
	    System.out.println();
	    }
	}
     }