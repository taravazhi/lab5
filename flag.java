import java.applet.*;
import java.awt.*;

/*<applet code="flag.class" width=400 height=600> </applet>*/

public class flag extends Applet
{

public void paint (Graphics g)
{

g.setColor(Color.orange); g.fillRect(100, 100, 200, 50);

g.setColor(Color.white);

g.fillRect(100,150,200,50);

g.setColor(Color.green);

g.fillRect(100,200,200,50); g.setColor(Color.blue);

g.drawOval (175,150,50,50);

g.drawLine(200,150,200,200); g.drawLine(175,175,225,175);

g.drawLine(180,160,220,190);
g.drawLine(180,190,220,160);
g.setColor(Color.black);
g.fillRect(90, 90, 10, 500);
}
}