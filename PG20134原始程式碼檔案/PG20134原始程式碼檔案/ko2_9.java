import java.io.*;
public class ko2_9 
    {
     public static void main(String args[])throws IOException
	{
	int [] p=new int[10];
	int n;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入一個數，以遞迴方法求所有排列。");
	System.out.print("輸入一個數：");
	str=keyin.readLine();
	n=Integer.parseInt(str);
	for (int m=0;m<n;m++)
	   p[m]=m+1;
	perm(p,1,n);
	}
     public static void perm(int p[],int x,int y)
	{
	int i,t;
	if (x==y)
	    {
	    for (i=0;i<y;i++)
	      System.out.print(p[i]);
	    System.out.println(" ");
	    }
	else    
	    for (i=x-1;i<y;i++)
		{
		t=p[x-1];p[x-1]=p[i];p[i]=t;
		perm(p,x+1,y);
		t=p[x-1];p[x-1]=p[i];p[i]=t;
		}
	}
     }