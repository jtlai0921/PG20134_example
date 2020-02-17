import java.io.*;
public class ko7_6 
    {
     public static int []a=new int[80];
     public static int n;
     public static void main(String args[])throws IOException
	{
	int i;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("累堆排序法(由小排到大)：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
	for (i=1;i<n;i++)
	    {
	    str2=keyin.readLine();
	    a[i]=Integer.parseInt(str2);
	    }
	heap(n-1);
	}
     public static void heap(int m)
	{
	int i,j,temp;
	for (i=m;i>=1;i--)
	    adjust(i,m);
	System.out.println("累堆的內容：");
	for (j=1;j<n;j++)
	    System.out.print(a[j]+"  ");
	System.out.println();
	System.out.print("累堆排序法的結果：");
	for (i=m-1;i>=1;i--)
	   {
	    temp=a[i+1];
	    a[i+1]=a[1];
	    a[1]=temp;
	    adjust(1,i);
	    System.out.println();
	    for (j=1;j<n;j++)
	    	System.out.print(a[j]+"  ");
	   }
	}
     public static void adjust(int x,int y)
	{
	int s,temp;
	boolean d=false;
	s=2*x;
	temp=a[x];
	while (s<=y && !d)
	    {
	    if ((s<y) && (a[s]<a[s+1]))
		s++;
	    if (temp>=a[s])
		d=true;
	    else
	       {
		a[s/2]=a[s];
		s=s*2;
	       }
	    }
	a[s/2]=temp;
	}
     }