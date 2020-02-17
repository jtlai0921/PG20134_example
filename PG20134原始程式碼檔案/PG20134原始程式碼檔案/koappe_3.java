class koA
	{
	 public int x,y;
	 koA(int a,int b)
            {
             x=a;
             y=b;  
	      }	
         public void display()
           {int z;
            z=x+y;
            System.out.println("add="+z);
           }
        }
class koB extends koA
	{
         koB(int a,int b)
            {
            super(a,b);
	    }   
         public void display()
            {int z;
             z=x*y;
      	     System.out.println("product="+z);
            }
       }
class koappe_3 extends koB
   { 
    koappe_3(int x,int y)
	{
	super(x,y);
	}
    public static void main(String args[]) 
      { 
       koA num1=new koA(11,22);
       koB num2=new koB(11,22);
       koappe_3 num3=new koappe_3(11,22);
       num1.display();
       num2.display();
       num3.display();
      }
    }