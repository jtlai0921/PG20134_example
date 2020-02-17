import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_12 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	GeneralPath ko=new GeneralPath();
	double t,x1,y1,t1,r;
	int n,x,y,a=40,b=60,r0=50;
	g2.translate(getWidth()/2,getHeight()/2);
	t=Math.PI/180;
	for (n=0;n<=360;n+=2)
	    {
	     t1=n*t;
	     r=r0*(Math.cos(t1)-1);
	     ko.moveTo(a,b);
	     x1=a+r*Math.cos(t1);
	     y1=b-r*Math.sin(t1);
	     x=(int)(x1);
	     y=(int)(y1);
	     ko.lineTo(x,y);
	     g2.draw(ko);
	     x1=a;
	     y1=b;
	     }
       	}	
  }
