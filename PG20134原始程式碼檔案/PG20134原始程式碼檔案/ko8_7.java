import java.util.*;
import java.io.*;
public class ko8_7 
    {
     public static void main(String args[])throws IOException
	{
	int m,n,num,i;
	String str;
	int a[]={23,2,25,11,8,45,34,59,5};
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("原始陣列：");
	n=a.length;
	for (m=0;m<n;m++)
	     System.out.print(a[m]+"   ");
	System.out.println();
	System.out.print("欲輸入搜尋的數：");
	str=keyin.readLine();
	num=Integer.parseInt(str);
	i=Arrays.binarySearch(a,num);
	if (i>0)
	      System.out.println("搜尋值"+num+"在a["+i+"]找到了!");
	else
	   System.out.println("找不到搜尋值："+num);
	}
     }