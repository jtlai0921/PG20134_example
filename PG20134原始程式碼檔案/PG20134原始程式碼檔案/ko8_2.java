import java.io.*;
public class ko8_2 
    {
     public static void main(String args[])throws IOException
	{
	int n,m,s,low,mid,high,i,j,temp;
	boolean flag=false;
	int []a=new int[20];
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�G���j�M�k�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    }  
	for (i=0;i<n-1;i++)
	    for (j=i+1;j<n;j++)
		if (a[i]>a[j])
		   {
		   temp=a[i];
		   a[i]=a[j];
		   a[j]=temp;
		   }
	System.out.println("�Ƨǫ᪺�}�C���e�G");
	for (m=0;m<n;m++)
	    {
	    System.out.print(a[m]+"   ");
	    }  
	System.out.println();
	System.out.print("�п�J���j�M���ơG");
	str1=keyin.readLine();
	s=Integer.parseInt(str1);
	low=0;
	high=n-1;
	while(low<=high)
	    {
	    mid=(low+high)/2;
	    if (s<a[mid])
		high=mid-1;
	    else if (s>a[mid])
		low=mid+1;
	    if (s==a[mid])
	        {
		System.out.println(s+"�Q�o�{��a["+mid+"]��!");
		flag=true;
		break;
		}
	    }
        if (flag==false)
	   System.out.println(s+"�S�����!!");
	}
     }