import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_3 extends Applet
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
	g2.rotate(Math.PI/4);
	g2.setColor(Color.gray);
	g2.draw(square);
	for (n=0;n<=10;n++)
	    {
	    g2.rotate(Math.PI/4);
	    g2.scale(0.707,0.707);
	    g2.draw(square);
	    }
      }
  }
