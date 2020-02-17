class ko1
   {
   int x,y;
   ko1(int a,int b)
     {
     x=a;
     y=b;
     }
    }
class ko2 extends ko1
    {
      ko2(int a,int b)
	{
	super(a,b);
	}
    }

public class koappe_2
   {
    public static void main(String args[]) 
      {
       int t;
       ko2 no=new ko2(11,22);
       t=no.x+no.y;
       System.out.println("add="+t);
      }
    }