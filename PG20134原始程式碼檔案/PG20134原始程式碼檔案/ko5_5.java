import java.io.*;
public class ko5_5
    {
     public static int []a=new int[80];
     public static int []tree=new int[255];
     public static int n;
     public static void main(String args[])throws IOException
	{
	int m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�G���𪺫e�ǰl�ܡG");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    } 
	maketree();
	System.out.println("�G����e�ǰl�ܪ����G�G");
	preorder(1);
	}
     public static void maketree()
	{ 
	int node=1,i,j;
	for (i=0;i<255;i++)
	    tree[i]=0;
	for (i=0;i<n;i++)
	    {
	    tree[node]=a[i];
	    node++;
	    }	 
	System.out.println("�G���𪺤��e�G");
	for (j=1;j<=n;j++)
	    System.out.print(tree[j]+"   ");
	System.out.println();
	}
     public static void preorder(int node)
	{
	if (tree[node]!=0)
	    {
	     if (tree[node]!=0)
		System.out.print(tree[node]+"  ");
	     preorder(2*node);
	     preorder(2*node+1);
	    }
	}
     }