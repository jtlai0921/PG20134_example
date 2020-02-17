import java.io.*;
public class ko7_9
    {
     public static int []a=new int[80];
     public static int []tree=new int[255];
     public static int n,s=0;
     public static void main(String args[])throws IOException
	{
	int m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("二元搜尋樹排序法：");
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
	System.out.println("二元搜尋樹排序後的結果：");
	inorder(1);
	}
     public static void bintree()
	{ 
	int node=0,i,j,temp;
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
	System.out.println("二元搜尋樹的內容：");
	for (j=1;j<=s;j++)
	    System.out.print(tree[j]+"   ");
	System.out.println();
	}
     public static void inorder(int node)
	{
	if (tree[node]!=0 && node<=s)
	    {
	     inorder(2*node);
	     if (tree[node]!=0)
		System.out.print(tree[node]+"  ");
	     inorder(2*node+1);
	    }
	}
     }