import java.io.*;
public class ko5_4
    {
     public static int []a=new int[80];
     public static int []tree=new int[255];
     public static int n;
     public static void main(String args[])throws IOException
	{
	int m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�G���𪺫�ǰl�ܡG");
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
	System.out.println("�G�����ǰl�ܪ����G�G");
	postorder(1);
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
     public static void postorder(int node)
	{
	if (tree[node]!=0)
	    {
	     postorder(2*node);
	     postorder(2*node+1);
	     if (tree[node]!=0)
		System.out.print(tree[node]+"  ");
	    }
	}
     }