import java.io.*;
public class ko7_3 
    {
     public static void main(String args[])throws IOException
	{
	int n,m,x,y,temp,min;
	int []ko=new int[20];
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��ܱƧǪk(�Ѥp�ƨ�j)�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    ko[m]=Integer.parseInt(str2);
	    }  
	System.out.println("��ܱƧǪ����G�G");
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