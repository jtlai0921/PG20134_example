import java.util.*;
public class ko7_10 
    {
     public static void main(String args[])
	{
     	int n,i;
	int []a={6,8,2,3,4,1,7,5};
	n=a.length;
	System.out.println("原始陣列：");
	for (i=0;i<n;i++)
	    System.out.print(a[i]+"  ");
	System.out.println();
	Arrays.sort(a);
	System.out.println("排序的結果：");
	for (i=0;i<n;i++)
	    System.out.print(a[i]+"  ");
        }
   }