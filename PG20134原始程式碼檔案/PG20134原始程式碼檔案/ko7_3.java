import java.io.*;
public class ko7_3 
    {
     public static void main(String args[])throws IOException
	{
	int n,m,x,y,temp,min;
	int []ko=new int[20];
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("選擇排序法(由小排到大)：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    ko[m]=Integer.parseInt(str2);
	    }  
	System.out.println("選擇排序的結果：");
	for (x=0;x<n-1;x++)
	    {
	     min=x;
	     for (y=x+1;y<n;y++)
		if (ko[y]<ko[min])
		   min=y;
	     temp=ko[min];
	     ko[min]=ko[x];
	     ko[x]=temp;
	     for (int s=0;s<n;s++)
		{
		System.out.print(ko[s]+"   ");
		}
	     System.out.println();
	    }
	}
     }