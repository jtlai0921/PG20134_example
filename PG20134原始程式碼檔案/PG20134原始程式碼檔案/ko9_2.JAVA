import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_2 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	int n,x,y,w,h,a;
        g2.setColor(Color.black);
	x=0;
	y=0;
	w=50;
	h=50;
	g2.translate(100,100);
	for (n=1;n<=24;n++)
	    {
	    g2.rotate(Math.PI/12);
	    g2.draw(new Rectangle2D.Double(x,y,w,h));
	   }
      }
  }
