import java.io.*;
public class ko6_1 
    {
     public static int [][]ko=new int[20][20];
     public static int n,k,m;
     public static void main(String args[])throws IOException
	{
	int p,x,y,temp=0;
	String str1,str2,str3,str4;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�۾F�}�C��ܪk�G");
	System.out.print("����J���I�`�ơG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.print("����J���I���ƥءG");
	str2=keyin.readLine();
	p=Integer.parseInt(str2);
	System.out.println("�п�J"+p+"�ӳ��I�G");
	for (k=0;k<n;k++)
	    for (m=0;m<n;m++)
		ko[k][m]=0;
	while(p>temp)
	    { 
	    System.out.print("�q���I�G");
	    str3=keyin.readLine();
	    x=Integer.parseInt(str3)-1;
	    System.out.print("�쳻�I�G");
	    str4=keyin.readLine();
	    y=Integer.parseInt(str4)-1;
	    ko[x][y]=1;
	    temp++;
	    }  
	display();
	}
      public static void display()
	{
	System.out.println("�۾F�}�C���G");
	for (k=0;k<n;k++)
	    {
	    for (m=0;m<n;m++)
		System.out.print(ko[k][m]+"  ");
	    System.out.println();
	    }
	}
     }