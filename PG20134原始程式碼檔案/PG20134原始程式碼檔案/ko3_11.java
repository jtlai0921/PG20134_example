class ko
   {
   String name;
   int age;
   ko(String str,int n)
      {
       name=str;
       age=n;
       }
   public void display()
       {
       System.out.println("�m�W="+name);	
       System.out.println("�~��="+age);
       }
    }
public class ko3_11
   {
    public static void main(String args[]) 
      {
       ko k=new ko("�_�Űx",50);
       k.display();
      }
    }
