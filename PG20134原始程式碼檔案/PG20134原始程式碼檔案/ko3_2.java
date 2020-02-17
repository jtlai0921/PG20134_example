public class ko3_2 
   { 
    public static void main(String args[]) 
      {
       char ko[]={'D','a','t','a',' ','S','t','r','u','c','t','u','r','e'};
       int m=ko.length;
       for (int n=0;n<m;n++)
           {
             if (Character.isUpperCase(ko[n]))
		System.out.print(Character.toLowerCase(ko[n]));
	     else
	        System.out.print(Character.toUpperCase(ko[n]));
           }
      }
    }
