public class ko3_10
   {
    public static void main(String args[]) 
      {
       int i,j,k;
       int k1[][]={{1,3,5,4,7,6},
		   {0,2,6,3,8,7},
		   {0,0,9,5,4,8},
		   {0,0,0,3,7,9},
		   {0,0,0,0,1,5},
		   {0,0,0,0,0,8}};
       int k2[]=new int[21];
       System.out.println("��ܤW�T���x�}:"); 
       for(i=0;i<6;i++)
          {
	  for(j=0;j<6;j++)
	     System.out.print(k1[i][j]+"  ");
	  System.out.println(); 
	  }
	for(i=0;i<6;i++)
           for(j=0;j<6;j++)
	      {
	       if (i<=j)
		  {
		  k=j*(j+1)/2+i;
		  k2[k]=k1[i][j];
		  }
	       }
	 System.out.println("��ܥH�欰�D�ഫ�᪺�}�C:"); 
	 for(i=0;i<21;i++)
	    System.out.print(k2[i]+"  ");  
	 }
      }
