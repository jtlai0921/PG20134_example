import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_5 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	double y1,z1,a;
	int n=0,x,y,z;
	a=Math.PI/180;
	g2.translate(100,100);
	for (x=0;x<720;x+=8)
	    {
	     y1=n*Math.sin(x*a);
	     z1=n*Math.cos(x*a);
	     y=(int)y1;
	     z=(int)z1;
	     g2.drawString("¡D",y,z);
	     n+=1;
	    }
       }	
  }
