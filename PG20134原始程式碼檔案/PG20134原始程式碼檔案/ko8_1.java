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
	System.out.println("�`�Ƿj�M�k�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	n=Integer.parseInt(str1);
	System.out.println("�п�J"+n+"�ӼơG");
	for (m=0;m<n;m++)
	    {
	    str2=keyin.readLine();
	    a[m]=Integer.parseInt(str2);
	    }  
	System.out.println("��l�}�C���G");
	for (m=0;m<n;m++)
	    System.out.print(a[m]+"   ");
	System.out.println();
	System.out.print("�п�J���j�M���ơG");
	str1=keyin.readLine();
	s=Integer.parseInt(str1);
	for (m=0;m<n;m++)
	    if (s==a[m])
	        {
		System.out.println(a[m]+"�Q�o�{��a["+m+"]��!");
		flag=true;
		}
        if (flag==false)
	   System.out.println(s+"�S�����!!");
	}
     }