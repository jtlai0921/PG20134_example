import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_13 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	GeneralPath ko=new GeneralPath();
	double t,x1,y1,x2,y2,t1,t2;
	int n,m,x,y,a,b;
	g2.translate(getWidth()/2,getHeight()/2);
	t=Math.PI/180;
	for (n=0;n<360;n+=30)
	    for (m=0;m<360;m+=30)
	    {
	     t1=n*t;
	     t2=m*t;
	     x1=150+80*Math.cos(t1);
	     y1=100-70*Math.sin(t1);
	     a=(int)(x1);
             b=(int)(y1);
	     ko.moveTo(a,b);
	     x2=150+80*Math.sin(t2);
	     y2=100-70*Math.cos(t2);
	     x=(int)(x2);
	     y=(int)(y2);
	     ko.lineTo(x,y);
	     g2.draw(ko);
	     x1=x2;
	     y1=y2;
	     }
       	}	
  }
