import java.io.*;
public class ko8_6 
    {
     public static int []a=new int[255];
     public static int n,num=0;
     public static String str;
     public static void main(String args[])throws IOException
	{
	int m,i,k,temp;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�O��j�M�k�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    } 
	for (m=0;m<n-1;m++)
	    for (k=m+1;k<n;k++)
		if (a[m]>a[k])
		    {
		    temp=a[m];
		    a[m]=a[k];
		    a[k]=temp;
		    }
	System.out.println("�Ƨǫ᪺�}�C�G");
	for (m=0;m<n;m++)
	     System.out.print(a[m]+"   ");
	System.out.println();
	System.out.print("����J�j�M���ơG");
	str=keyin.readLine();
	num=Integer.parseInt(str);
	i=search(num);
	if (i>0)
	       {
		i++;
	        System.out.println("�j�M��"+num+"�bf["+i+"]���F!");
		}
	else
	   System.out.println("�䤣��j�M�ȡG"+num);
	}
    public static int search(int k)
	{
	int r=0,j=0,s=0,t,p,temp;
	int f[]={0,1,1,2,3,5,8,13,21,34,55,89,144,233,377};
	while(f[j]<n+1)
	   j+=1;
	p=n+1-f[j];
	r=f[j-1];
	s=f[j-2];
	t=f[j-3];
	if (k>a[r])
	   r+=p;
	while((r!=0))
	    {
	    if (k<a[r])
		{
		if (t==0)
		    r=0;
		else
		    {
		     r=r-t;
		     temp=s;
		     s=t;
                     t=temp-t;
		     }
		}
	     else if (k>a[r])
		{
		 if (s==1)
		    r=0;
		 else
		    {
		     r=r+t;
		     s=s-t;
                     t=t-s;
		     }
		}
	      else
		   return r;
	      }
	      return 0;
	  }
     }