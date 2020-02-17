import java.io.*;
public class ko7_7 
    {
     public static void main(String args[])throws IOException
	{
	int []a=new int[80];
     	int no,i,gap,n,temp;
	String str1,str2;
	boolean flag=true; 
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("謝爾排序法(由小排到大)：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	no=Integer.parseInt(str1);
	System.out.println("請輸入"+no+"個數：");
	for (i=0;i<no;i++)
	    {
	    str2=keyin.readLine();
	    a[i]=Integer.parseInt(str2);
	    }
	System.out.println("原始陣列：");
	for (i=0;i<no;i++)
	    System.out.print(a[i]+"  ");
	System.out.println();
	System.out.println("謝爾排序法的結果：");
	gap=no/2;
	while (gap!=0)
	     {
	     do
	        {
		flag=false;
	        for (n=0;n<no-gap;n++)
		    {
		    if (a[n]>a[n+gap])
			{
			temp=a[n];
			a[n]=a[n+gap];
			a[n+gap]=temp;
			flag=true;
			}
		     }
		}
	     while(flag==true);
	     gap=gap/2;
	     for (n=0;n<no;n++)
		  System.out.print(a[n]+"  ");
	     System.out.println(); 
	     }
        }
   }