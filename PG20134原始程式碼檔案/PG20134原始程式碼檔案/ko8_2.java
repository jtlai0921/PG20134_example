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
	System.out.println("二元搜尋法：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
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
	System.out.println("排序後的陣列內容：");
	for (m=0;m<n;m++)
	    {
	    System.out.print(a[m]+"   ");
	    }  
	System.out.println();
	System.out.print("請輸入欲搜尋的數：");
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
		System.out.println(s+"被發現於a["+mid+"]中!");
		flag=true;
		break;
		}
	    }
        if (flag==false)
	   System.out.println(s+"沒有找到!!");
	}
     }