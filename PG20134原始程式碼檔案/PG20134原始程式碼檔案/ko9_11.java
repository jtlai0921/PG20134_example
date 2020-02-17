import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_11 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	GeneralPath ko=new GeneralPath();
	double t,x1,y1,t1,p,t0;
	int n,i,x,y,s=40,m=0,x0=20,y0=20;
	g2.translate(getWidth()/2,getHeight()/2);
	t=Math.PI/180;
	for (n=3;n<=9;n++)
	    {
	     t0=2*Math.PI/n;
	     t1=m*t;
	     ko.moveTo(x0,y0);
	     x1=x0;
	     y1=y0;
	     for (i=1;i<=n;i++)
		{
		x1=x1+s*Math.cos(t1);
		y1=y1+s*Math.sin(t1);
		x=(int)(x1+0.5);
		y=(int)(y1+0.5);
		ko.lineTo(x,y);
		g2.draw(ko);
		t1=t1+t0;
		}
	    }
       	}	
  }
