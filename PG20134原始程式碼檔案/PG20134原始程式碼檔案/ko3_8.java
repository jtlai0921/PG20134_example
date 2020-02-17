public class ko3_8
   {
    public static void main(String args[]) 
      {
       int i,j,k;
       int k1[][]={{9,0,0,0,0,0},
		   {8,6,0,0,0,0},
		   {2,1,3,0,0,0},
		   {7,2,9,5,0,0},
		   {3,6,9,1,3,0},
		   {1,2,4,5,7,8}};
       int k2[]=new int[21];
       System.out.println("顯示下三角矩陣："); 
       for(i=0;i<6;i++)
          {
	  for(j=0;j<6;j++)
	     System.out.print(k1[i][j]+"  ");
	  System.out.println(); 
	  }
	for(i=0;i<6;i++)
           for(j=0;j<6;j++)
	      {
	       if (i>=j)
		  {
		  k=(13-j)*j/2+i-j;
		  k2[k]=k1[i][j];
		  }
	       }
	 System.out.println("顯示以行為主轉換後的陣列:"); 
	 for(i=0;i<21;i++)
	    System.out.print(k2[i]+"  ");  
	 }
      }
