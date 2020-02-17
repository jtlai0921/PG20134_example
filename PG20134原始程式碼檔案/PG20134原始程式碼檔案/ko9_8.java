import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_8 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	int n,x,y,w,h;
	x=50;
	y=50;
	w=100;
	h=80;
	g2.translate(getWidth()/2,getHeight()/2);
	AffineTransform t=new AffineTransform();
	t.setToRotation(Math.toRadians(-20),x,y);
	g2.setColor(Color.black);
	for (n=1;n<13;n++)
	    {
	    g2.transform(t);
	    g2.draw(new Rectangle2D.Double(x,y,w*n/12,h*n/12));
	    }
      }
  }
