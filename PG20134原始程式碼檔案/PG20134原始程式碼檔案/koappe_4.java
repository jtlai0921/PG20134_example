class ko
   {
   String name="xxxxx";
   int age=45;
   ko()
     { 
     }
   ko(String a)
     {
     name=a;
     }
   koString a,int b)
     {
     name=a;
     age=b;
     }
   public void display()
     {
     System.out.println("Name="+name+","+"Age="+age);
    }
   }
public class koappe_4
   {
    public static void main(String[] args) 
      {
       person ko1=new ko();
       person ko2=new ko("Wen-chao Ko");
       person ko3=new ko("Wen-chao Ko",50);
       ko1.display();
       ko2.display();
       ko3.display();
    }
   }