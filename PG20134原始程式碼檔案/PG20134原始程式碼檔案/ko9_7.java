import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_7 extends Applet
  {
    public void paint(Graphics g)
      {
        Graphics2D g2=(Graphics2D)g;
	int n,x,y,w,h;
	x=50;
	y=50;
	w=90;
	h=50;
	Rectangle2D square=new Rectangle2D.Double(x,y,w,h);
	g2.translate(getWidth()/2,getHeight()/2);
	AffineTransform t=new AffineTransform();
	t.setToRotation(Math.toRadians(20),x,y);
	g2.setColor(Color.black);
	for (n=0;n<18;n++)
	    {
	    g2.transform(t);
	    g2.draw(square);
	    }
      }
  }
