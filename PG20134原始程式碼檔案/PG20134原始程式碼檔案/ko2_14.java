import java.io.*;
public class ko2_14
   {
    public static void main(String args[])throws IOException 
      {
       int [][] ko=new int [15][15];
       int i=0,j,n;
       String x;
       BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter an integer(odd):");
       x=keyin.readLine();
       n=Integer.parseInt(x); 
       i=0;j=(n-1)/2;
       ko[i][j]=1;
       for(int k=2;k<=n*n;k++)
          {
           i--;j--;
           if ((i==-1)&&(j==-1))
	      {i=1;
	       j=0;}
           else if (i==-1)
	       i=n+i;
	   else if (j==-1)
               j=n+j;
           if (ko[i][j]!=0)
	       {i+=2;
                j++;}
           ko[i][j]=k;
           }
       for(i=0;i<n;i++)
	  {
	   for(j=0;j<n;j++)
	      if (ko[i][j]>=100)
                 System.out.print("  "+ko[i][j]);
              else if(ko[i][j]>=10)
		 System.out.print("   "+ko[i][j]);
	      else 
                 System.out.print("    "+ko[i][j]);
	   System.out.println();
          }
     }
   }