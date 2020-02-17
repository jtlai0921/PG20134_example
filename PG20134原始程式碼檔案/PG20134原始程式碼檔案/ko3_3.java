public class ko3_3
   {
    public static void main(String args[]) 
      {
       int temp;	
       int [] ko={26,16,217,64,85,33,55,29,91};
       for(int n=0;n<ko.length-1;n++)
          for(int m=n+1;m<ko.length;m++)
             {
	      if (ko[n]>ko[m])
		 {
                  temp=ko[n];
                  ko[n]=ko[m];
                  ko[m]=temp;
                 }
              }
       System.out.println("印出排序後的結果：");
       for(int s=0;s<ko.length;s++)
  	System.out.print(ko[s]+"  ");
     }
   }