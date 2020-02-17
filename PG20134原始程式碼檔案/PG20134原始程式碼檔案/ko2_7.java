import java.io.*;
public class ko2_7
    {
     public static void main(String args[])throws IOException
	{
	int n,i,j;
        boolean []p=new boolean[256];
	String str;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("块琘计患癹よ猭―1琘计┮Τ借计");
	System.out.print("块计");
	str=keyin.readLine();
	n=Integer.parseInt(str);  
	for (i=1;i<=n;i++)
	   p[i]=true;
	for (i=2;i<=n/2;i++)
	   for (j=2;j<=n/i;j++)
	      p[i*j]=false;
	for (i=2;i<=n;i++)
	   if (p[i])
	      System.out.print("  "+i);
	}
     }