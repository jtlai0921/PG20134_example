import java.io.*;
public class ko6_6
    {
     public static int [][]cost=new int[20][20];
     public static int n,k,m,c1,c2,p=0,q;
     public static int a[]=new int[20];
     public static int b[]=new int[20];
     public static int c[]=new int[20];
     public static int n1[]=new int[20];
     public static int n2[]=new int[20];
     public static void main(String args[])throws IOException
	{
	int p,x,y,t,temp=1;
	String str1,str2,str3,str4,str5,str6,str7;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�̵u���|�G");
	System.out.print("����J���I�`�ơG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.print("����J���I���ƥءG");
	str2=keyin.readLine();
	p=Integer.parseInt(str2);
	System.out.println("�п�J"+p+"�ӳ��I�G");
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
	    System.out.print("�q���I�G");
	    str3=keyin.readLine();
	    x=Integer.parseInt(str3);
	    System.out.print("�쳻�I�G");
	    str4=keyin.readLine();
	    y=Integer.parseInt(str4);
	    System.out.print("��J�[�v�ơG");
	    str5=keyin.readLine();
	    t=Integer.parseInt(str5);
	    cost[x][y]=t;
	    cost[y][x]=t;
	    temp++;
	    }  
	display();
	System.out.println("�D�̵u���|���檺���G�G");
	System.out.print("��J�_�l��}�G");
	str6=keyin.readLine();
	c1=Integer.parseInt(str6);
	System.out.print("��J���I��}�G");
	str7=keyin.readLine();
	c2=Integer.parseInt(str7);
	mindist();
	}
      public static void display()
	{
	System.out.println("�۾F�}�C���G");
	for (k=1;k<=n;k++)
	    {
	    for (m=1;m<=n;m++)
		System.out.print(cost[k][m]+"  ");
	    System.out.println();
	    }
	}
      public static void mindist()
	{
	int j,i,d=0,temp,t=0;
	q=c1;
	for (j=1;j<n;j++)
            {temp=32767;
	     a[c1]=-1;
	     for (i=1;i<=n;i++)
		{
		if (cost[c1][i]!=0 && a[i]==0 && b[i]==0)
		   {
		    b[i]=cost[c1][i]+t;
		    c[i]=c1;
		   }
		else if (cost[c1][i]!=0 && a[i]==0  && cost[c1][i]+t<b[i] && b[i]!=0)
		   {
		    b[i]=cost[c1][i]+t;
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
	     t=temp;
	     n1[j]=c[c1];
	     n2[j]=c1;
	    }
	while(true)
	    {
	    for(i=1;i<8;i++)
		if (n2[i]==c2)
		    {
		     c2=n1[i];
		     System.out.println(n2[i]+"=>"+n1[i]);
		     p+=cost[n1[i]][n2[i]];
		     break;
		    }
		if (c2==q)
		   break;
	    }
	 System.out.println("�Ҷ��Z����"+p);
	}
     }