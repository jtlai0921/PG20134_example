import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_6 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	int n,x,y,w,h;
	x=-50;
	y=-50;
	w=100;
	h=100;
	Rectangle2D square=new Rectangle2D.Double(x,y,w,h);
	g2.translate(getWidth()/2,getHeight()/2);
	AffineTransform t=new AffineTransform();
	t.setToRotation(Math.toRadians(5));
	g2.setColor(Color.gray);
	g2.draw(square);
	for (n=0;n<=25;n++)
	    {
	    g2.transform(t);
	    g2.scale(1-0.005*n,1-0.005*n);
	    g2.draw(square);
	    }
      }
  }
