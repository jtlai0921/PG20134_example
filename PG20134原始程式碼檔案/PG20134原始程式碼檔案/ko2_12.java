import java.io.*;
public class ko2_12 
    {
     public static void main(String args[])throws IOException
	{
	int n;
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�@�ӼơA�H���j��k�D�e������C");
	System.out.print("��J��L�ơG");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	towers(n,'a','b','c');
	}
     public static void towers(int i,char a,char b,char c)
	{
	if (i<=1)
	   System.out.println("���ʶ�L1�q��W"+ a +"���W"+c);
	else
	   {
	   towers(i-1,a,c,b);
	   System.out.println("���ʶ�L"+i+"�q��W"+ a +"���W"+c);
	   towers(i-1,b,a,c);
	   }
	}
     }