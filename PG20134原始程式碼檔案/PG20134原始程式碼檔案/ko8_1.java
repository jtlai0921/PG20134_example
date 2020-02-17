import java.io.*;
public class ko8_1 
    {
     public static void main(String args[])throws IOException
	{
	int n,m,s;
	boolean flag=false;
	int []a=new int[20];
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("循序搜尋法：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    }  
	System.out.println("原始陣列為：");
	for (m=0;m<n;m++)
	    System.out.print(a[m]+"   ");
	System.out.println();
	System.out.print("請輸入欲搜尋的數：");
	str1=keyin.readLine();
	s=Integer.parseInt(str1);
	for (m=0;m<n;m++)
	    if (s==a[m])
	        {
		System.out.println(a[m]+"被發現於a["+m+"]中!");
		flag=true;
		}
        if (flag==false)
	   System.out.println(s+"沒有找到!!");
	}
     }