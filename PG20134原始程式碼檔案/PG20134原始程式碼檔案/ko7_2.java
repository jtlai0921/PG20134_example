import java.io.*;
public class ko7_2 
    {
     public static void main(String args[])throws IOException
	{
	int n,m,x,y,temp,q=0;
	int []ko=new int[20];
	String str1,str2;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("���J�ƧǪk(�Ѥp�ƨ�j)�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    ko[m]=Integer.parseInt(str2);
	    }  
	System.out.println("���J�ƧǪ����G�G");
	for (x=1;x<=n-1;x++)
	    {
	     temp=ko[x];
	     for (y=x-1;y>=0;y--)
		{
		if (ko[y]<temp)
		    break;
		else
		    ko[y+1]=ko[y];
		}
	     ko[y+1]=temp;
	     for (int s=0;s<=q+1;s++)
		{
		System.out.print(ko[s]+"   ");
		}
	     System.out.println();
	     q++;
	    }
	}
     }