import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_1 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	int n,x,y,w,h,a;
        g2.setColor(Color.black);
	x=50;
	y=50;
	w=20;
	h=20;
	g2.translate(120,120);
	for (n=1;n<=72;n++)
	    {
            g2.rotate(Math.PI/36);
	    g2.draw(new Rectangle2D.Double(x,y,w,h));
	   }
      }
  }
