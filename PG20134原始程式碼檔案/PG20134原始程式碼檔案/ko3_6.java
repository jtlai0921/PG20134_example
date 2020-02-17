public class ko3_6
   {
    public static void main(String args[]) 
      {
       int i,j,k;
       int k1[][]={{1,3,5},{2,6,3}};
       int k2[][]={{2,4},{4,5},{2,4}};
       int r[][]=new int[2][2];
       for(i=0;i<2;i++)
	  for(j=0;j<2;j++)
	     for(k=0;k<3;k++)
		r[i][j]+=k1[i][k]*k2[k][j];
       for(i=0;i<2;i++)
	  {
	  for(j=0;j<2;j++)
	     System.out.print("  "+r[i][j]);
	  System.out.println();
	  }
       }
   }