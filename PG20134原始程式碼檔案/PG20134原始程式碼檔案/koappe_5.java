public class koappe_5 implements Runnable
   { 
    int n;
    koappe_5()
	{
	Thread td=new Thread(this);
	td.setPriority(Thread.MIN_PRIORITY);
	td.start();
	}
    public void run()
	{
	for (n=0;n<6;n++)
	   {
	    try
	      {
	      System.out.print("a");
              Thread.sleep(250);
	      }
	   catch(InterruptedException e)
	      {
	      System.out.println("Exception1");
	      }
           }
         }
       public static void main(String args[])
	  {
	   new koappe_5();
	   new Tthread();
          }
       }
class Tthread
  {
   int n=0;
    {
    while(n<6)
	{
	 try
	   {
	   System.out.print("B");
           Thread.sleep(750);
	   }
	 catch(InterruptedException e)
	   {
	   System.out.println("Exception2");
	   }
	n++;
        }
    }
}