import java.io.*;
public class ko7_1 
    {
     public static void main(String args[])throws IOException
	{
	int n,m,x,y,temp;
	int []ko=new int[20];
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��w�ƧǪk(�Ѥp�ƨ�j)�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    ko[m]=Integer.parseInt(str2);
	    }  
	System.out.println("��w�ƧǪ����G�G");
	for (x=0;x<n-1;x++)
	    {
	     for (y=0;y<n-1;y++)
		if (ko[y]>ko[y+1])
		    {
		     temp=ko[y];
		     ko[y]=ko[y+1];
		     ko[y+1]=temp;
		    }
	     for (int s=0;s<n;s++)
		{
		System.out.print(ko[s]+"   ");
		}
	     System.out.println();
	    }
	}
     }