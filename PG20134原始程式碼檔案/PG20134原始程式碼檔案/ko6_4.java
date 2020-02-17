import java.io.*;
public class ko6_4
    {
     public static int [][]ko=new int[20][20];
     public static int n,k,m,front=-1,rear=-1;
     public static int visit[]=new int[20];
     public static int queue[]=new int[20];
     public static void main(String args[])throws IOException
	{
	int p,x,y,temp=0;
	String str1,str2,str3,str4;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("橫向搜尋法：");
	System.out.print("欲輸入頂點總數：");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.print("欲輸入頂點的數目：");
	str2=keyin.readLine();
	p=Integer.parseInt(str2);
	System.out.println("請輸入"+p+"個頂點：");
	for (k=0;k<n;k++)
	    for (m=0;m<n;m++)
		ko[k][m]=0;
	for (k=0;k<n;k++)
	    visit[k]=0;
	while(p>temp)
	    { 
	    System.out.print("從頂點：");
	    str3=keyin.readLine();
	    x=Integer.parseInt(str3)-1;
	    System.out.print("到頂點：");
	    str4=keyin.readLine();
	    y=Integer.parseInt(str4)-1;
	    ko[x][y]=1;
	    ko[y][x]=1;
	    temp++;
	    }  
	display();
	System.out.println("橫向搜尋法拜訪頂點的順序為：");
	bfs(0);
	}
      public static void display()
	{
	System.out.println("相鄰陣列為：");
	for (k=0;k<n;k++)
	    {
	    for (m=0;m<n;m++)
		System.out.print(ko[k][m]+"  ");
	    System.out.println();
	    }
	}
      public static void bfs(int i)
	{
	int j;
	visit[i]=1;
	System.out.print("v"+i+"  ");
 	for (j=0;j<n;j++)
           if (ko[i][j]==1)
		if (visit[j]!=1)
	           add(j);
	while(front!=rear)
	     {
	     i=delete();
	     if (visit[i]!=1)
		bfs(i);
	     }
	}
      public static void add(int j)
	{
	rear++;
	if (rear==20)
	   System.out.println("佇列已滿!");
	else
	   queue[rear]=j;
	}
      public static int delete()
	{
	if (front==rear)
	    System.out.println("佇列已空!");
	else
	     front++;
	     return(queue[front]);
	}
     }