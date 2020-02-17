class ko extends Thread
   { 
    int n;
    String s;
    Thread td;
    ko(String str)
	{
        s=str;
	td=new Thread(this);
	td.start();
	}
    public void run()
	{
	for (n=0;n<6;n++)
	   {
	    try
	      {
	      System.out.print(s);
              Thread.sleep(250);
	      }
	   catch(InterruptedException e)
	      {
	      System.out.println("Exception1");
	      }
          }
       }
    }
public class koappe_6
    {
    public static void main(String args[])
       {
	ko a=new ko("a");
	ko b=new ko("b");
	ko c=new ko("c");
	System.out.println("Thread a(alive):"+a.td.isAlive());
        System.out.println("Thread b(alive):"+b.td.isAlive());
        System.out.println("Thread c(alive):"+c.td.isAlive());  	
	try
	  {
	   a.td.join();
	   b.td.join(); 
	   c.td.join();	
	  }
	catch(InterruptedException e)
	  {
	  System.out.println("Exception2");
	  }
       System.out.println();
       System.out.println("Thread a(alive):"+a.td.isAlive());
       System.out.println("Thread b(alive):"+b.td.isAlive());
       System.out.println("Thread c(alive):"+c.td.isAlive());   
       }
    }