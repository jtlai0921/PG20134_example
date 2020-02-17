import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ko9_9 extends Applet
  {
    public void paint(Graphics g)
      {
	Graphics2D g2=(Graphics2D)g;
	GeneralPath ko=new GeneralPath();
	double x,x1,y1,x2,y2,x3,y3,x4,y4;
	int a1,b1,a2,b2,a3,b3,a4,b4;
	g2.translate(getWidth()/2,getHeight()/2);
	for (x=0;x<=360;x+=5)
	    {
	    x1=30*(Math.sin(Math.PI*x/180));
	    y1=30*(Math.cos(Math.PI*x/180));
	    x2=40*(Math.sin(Math.PI*x/180));
	    y2=60*(Math.cos(Math.PI*x/180));
	    x3=50*(Math.sin(Math.PI*x/180));
	    y3=90*(Math.cos(Math.PI*x/180));
	    x4=100*(Math.sin(Math.PI*x/180));
	    y4=30*(Math.cos(Math.PI*x/180));
	    a1=(int)x1;
	    b1=(int)y1;
	    a2=(int)x2;
	    b2=(int)y2;
	    a3=(int)x3;
	    b3=(int)y3;
	    a4=(int)x4;
	    b4=(int)y4;
	    ko.moveTo(a1,b1);
	    ko.curveTo(a2,b2,a3,b3,a4,b4);
	    g2.draw(ko);
	    }
      }
  }
