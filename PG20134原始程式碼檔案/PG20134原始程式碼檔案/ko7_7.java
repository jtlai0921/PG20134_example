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
	System.out.println("�º��ƧǪk(�Ѥp�ƨ�j)�G");
	System.out.print("����J�X�ӼƥءG");
	str1=keyin.readLine();
	no=Integer.parseInt(str1);
	System.out.println("�п�J"+no+"�ӼơG");
	for (i=0;i<no;i++)
	    {
	    str2=keyin.readLine();
	    a[i]=Integer.parseInt(str2);
	    }
	System.out.println("��l�}�C�G");
	for (i=0;i<no;i++)
	    System.out.print(a[i]+"  ");
	System.out.println();
	System.out.println("�º��ƧǪk�����G�G");
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