import java.io.*;
public class ko3_1
   { 
    public static void main(String args[]) throws IOException 
      {
       BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));	
       char ko[]={'a','b','c','b','a','c','c','d','b','a'};
       String ans;
       System.out.print("Enter a string:");
       ans=keyin.readLine();
       int n=ko.length,y=0;
       System.out.print("The Standard answer:");
       for (int x=0;x<n;x++)
            {
            System.out.print(" "+ko[x]);
            if (ko[x]==ans.charAt(x))
	       y++;
            }
       System.out.println();
       System.out.print("The  Student answer:");
       for (int x=0;x<n;x++)
            {
            System.out.print(" "+ans.charAt(x));
            }
       System.out.println();
       System.out.println("The correct answers:"+y);
      }
    }
