import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_10 extends Applet
  {
    public void paint(Graphics g)
      {
	double x[]=new double[370];
	double y[]=new double[370];
        Graphics2D g2=(Graphics2D)g;
	double t,x1,y1,t1,p;
	int n=0,a=80,x2,y2;
	t=Math.PI/180;
	for (n=1;n<361;n++)
	    {
	     t1=(n-1)*t;
	     x[n]=a*Math.sin(2*t1);
	     y[n]=a*Math.sin(3*t1);
	    }
	for (p=0.5;p<=1;p+=0.5)
	    for (n=1;n<361;n++)
		{
		x1=x[n]*p+250+0.5;
		y1=y[n]*p+180+0.5;
		x2=(int)x1;
		y2=(int)y1;
	     	g2.drawString("¡D",x2,y2);
	    	}
       	}	
  }
