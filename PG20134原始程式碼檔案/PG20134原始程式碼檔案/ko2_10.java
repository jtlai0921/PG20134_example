import java.io.*;
public class ko2_10 
    {
     public static int n;
     public static void main(String args[])throws IOException
	{
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入一個數，以非遞迴方法求拉丁方陣。");
	System.out.print("輸入一個數：");
	str=keyin.readLine();
	n=Integer.parseInt(str);
	latin();
	}
     public static void latin()
	{
	int i,j,k,tp;
	int [] t=new int[10];
	int [][]a=new int[10][10];
	for (i=1;i<=n;i++)
	    {
	     t[i]=i;
	     a[1][i]=i;
	     System.out.print(i);
	    }
	System.out.println(" ");   
	for (i=2;i<=n;i++)
	    {
	    tp=t[n];
	    for(k=1;k<=n-1;k++)
                t[n-k+1]=t[n-k];
	    t[1]=tp;
	    for(j=1;j<=n;j++)
		{
		a[i][j]=t[j];
		System.out.print(a[i][j]);
		if (j==n)
		   System.out.println(" ");
	    	}
	     }
	}
     }