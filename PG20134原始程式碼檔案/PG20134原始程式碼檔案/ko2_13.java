public class ko2_13 
    {
     public static int ko[][]={
		{1,1,1,1,1,1,1,1,1,1,1},
		{1,0,1,0,1,1,0,0,0,1,1},
		{1,0,0,0,0,0,0,1,0,1,1},
		{1,0,1,0,1,0,1,0,0,1,1},
		{1,1,1,0,1,0,0,0,1,1,1},
		{1,1,0,0,1,1,1,0,1,0,1},
		{1,0,0,1,0,0,1,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1,1}};
     public static void main(String args[])
	{
	int n,m;
	System.out.println("�Ʀr0�N��i�檺���C");
	System.out.println("�Ʀr1�N�������q�C");
	System.out.println("�Ʀr8�N��w���L�����C");
	System.out.println("�g�c���|�Ϧp�U�ҥܡC");
	path(6,9);
	for (n=1;n<=6;n++)
	    {
	     for (m=1;m<=9;m++)
		 System.out.print(ko[n][m]);
	     System.out.println();
	     }
         }
     public static int path(int x,int y)
	{
	if (x==1 && y==1)
	   {
	   ko[x][y]=8;
	   return 1;
	   }
	else if (ko[x][y]==0)
	   {
	   ko[x][y]=8;
           if (path(x-1,y)+path(x+1,y)+path(x,y-1)+path(x,y+1)==0)
               {
		ko[x][y]=0;
		return 0;
		}
	   else
		return 1;
	   }
	else
	   return 0;
	}   
     }