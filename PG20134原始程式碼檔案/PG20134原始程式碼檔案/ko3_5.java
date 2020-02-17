public class ko3_5
   {
    public static void main(String args[]) 
      {
       int sum;
       int ko[][]={{4,-6,1,3},{-2,3,7,2},{1,0,4,5}};
       System.out.println("              Total");
       for(int n=0;n<3;n++)
	  {
          sum=0;
	  for(int m=0;m<4;m++)
	     {
	     sum=sum+ko[n][m];
	     if (ko[n][m]>=0)
	         System.out.print("  "+ko[n][m]);
	     else 
		 System.out.print(" "+ko[n][m]);
	     }
	   System.out.print("    "+sum);
	   System.out.println();
	   }
     }
   }