class value
   {
   public int x,y;
   public value(int s,int t)
     {
     x=s;
     y=t;
     }
    }
public class koappe_1
   {
    public static void main(String args[]) 
      {
       int p;
       value num=new value(11,22);
       p=num.x+num.y;
       System.out.println("add="+p);
      }
    }