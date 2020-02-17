public class ko3_4
   {
    public static void main(String args[]) 
      {
       int sum=0,max,min;
       int ko[][]={{21,32,13},{34,65,86},{17,48,49}};
       max=min=ko[0][0];
       for(int n=0;n<3;n++)
	  for(int m=0;m<3;m++)
	     {
	      if (max<ko[n][m])
		 max=ko[n][m];
	      if (min>ko[n][m])
		 min=ko[n][m];
	     }
       System.out.println("max="+max);
       System.out.println("min="+min);
     }
   }