import java.io.*;
public class ko8_4 
    {
     public static int []a=new int[255];
     public static int []tree=new int[255];
     public static int n,s,num=0;
     public static String str;
     public static void main(String args[])throws IOException
	{
	int m;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�G����j�M�k�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    } 
	System.out.print("����J�j�M���ơG");
	str=keyin.readLine();
	num=Integer.parseInt(str);
	maketree();
	}
     public static void maketree()
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
	System.out.println("�G���j�M�𪺤��e�G");
	for (j=1;j<=s;j++)
	    System.out.print(tree[j]+"   ");
	System.out.println();
	searchnode();
	}
    public static void searchnode()
	{
	int node=1,i;
	boolean flag=false;
	while(s>=node)
	    {
	     if (num==tree[node])
		{
		System.out.println("�j�M����"+num+"�b"+node+"�`�I�W!");
		flag=true;
		System.exit(1);
		}
	     else if (num>tree[node])
		node=2*node+1;
	     else
		node=2*node;
	    }
	if (flag==false)
	    System.out.println("�j�M����"+num+"�䤣��!!");
	}
     }