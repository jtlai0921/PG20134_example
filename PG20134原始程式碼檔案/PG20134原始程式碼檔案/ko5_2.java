import java.io.*;
public class ko5_2 
    {
     public static int []a=new int[80];
     public static int []tree=new int[255];
     public static int n;
     public static void main(String args[])throws IOException
	{
	int m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("建立二元樹：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    } 
	bintree();
	}
     public static void bintree()
	{ 
	int s=0,node=0,i,j,temp,left,right;
	for (i=0;i<255;i++)
	    tree[i]=0;
	tree[1]=a[0];
	temp=n;
	for (i=1;i<n;i++)
	    {
            node=1;
	    while(tree[node]!=0)
		{
	        if (a[i]<tree[node])
		    node=2*node;
	        else 
		    node=2*node+1;
		if (temp<node)
		   {
		   temp=node;
		   s=temp;
		   }
		}
	    tree[node]=a[i];
	    }	 
	System.out.println("鏈結串列二元樹的內容：");
	System.out.println("節點  左子樹 鍵值  右子樹");
	for (j=1;j<=s;j++)
	    {
	     left=2*j;
	     right=2*j+1;
	     if (tree[left]==0)
		left=0;
	     if (tree[right]==0)
		right=0;
	     if (tree[j]!=0)
	        System.out.println(j+":      ["+left+"]   ["+tree[j]+"]    ["+right+"]");
	    }
	}
     }