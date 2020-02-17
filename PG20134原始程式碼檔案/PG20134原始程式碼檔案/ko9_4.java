import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_4 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	double y1,z1,a;
	int n,x,y,z;
	a=Math.PI/180;
	g2.translate(50,50);
	for (x=0;x<450;x+=9)
	    {
	     y1=20+50*Math.sin(x*a);
	     z1=20+50*Math.cos(x*a);
	     y=(int)y1;
	     z=(int)z1;
	     if (x==45||x==225||x==405)
                g2.drawString("=",x,y);
	     else
		{
		 g2.drawString("+",x,y);
		 g2.drawString("*",x,z);
		}
	    }
       }	
  }
