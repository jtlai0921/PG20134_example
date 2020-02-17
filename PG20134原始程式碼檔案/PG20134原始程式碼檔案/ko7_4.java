import java.io.*;
public class ko7_4 
    {
     public static int []ko=new int[80];
     public static int n;
     public static void main(String args[])throws IOException
	{
	int x;
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("快速排序法(由小排到大)：");
	System.out.print("欲輸入幾個數目：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("請輸入"+n+"個數：");
	for (x=0;x<n;x++)
	    {
	    str2=keyin.readLine();
	    ko[x]=Integer.parseInt(str2);
	    }
	System.out.println("快速排序法的結果：");
	sort(0,1,n-1); 
	}
     public static void sort(int first,int s,int t)
	{
	int last=t,k=0; //k代表尋找的次數
	while(s!=t)
	    {
	    k++;
	    for (;s<t;s++)//由左至右尋找大於鍵值
		if (ko[first]<ko[s])
		    break;
	    for (;t>s;t--)//由右至左尋找小於鍵值
		if (ko[first]>ko[t])
		    break;
            exchange(s,t);
	    if (k==1 && s==last && ko[last]<ko[first])
		{
		k=0;
		exchange(first,last);//頭尾資料對調
		s=first+1;
		t=last-1;//最大鍵值已排在最後面
		last--;
		}
	     }
	if (ko[last]<ko[first])
	    exchange(first,last);
	exchange(first,s-1);//基準鍵值調到中間
	if (first+1<=s-1)
	    sort(first,first+1,s-1);
	if (s+1<=last)
	    sort(s,s+1,last);
	}
    public static void exchange(int x,int y)
	{
	int temp,m;
	if (x!=y)
	    {
	     temp=ko[x];
	     ko[x]=ko[y];
	     ko[y]=temp;
	     for (m=0;m<n;m++)
		System.out.print(ko[m]+"  ");
	     System.out.println();
	    }
	}
     }