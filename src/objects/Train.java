package objects;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Train {
    public static void drawTrain(Graphics2D g, int NumOfWin) {
        g.setColor(Color.lightGray);
        g.fillOval(550,425,50,50);
        g.fillOval(450,425,50,50);
        g.fillOval(30,425,50,50);

        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 290,600, 150);

        GeneralPath path = new GeneralPath();
        path.moveTo(600, 290);
        path.curveTo(800, 360, 880,460,600, 440);
        g.fill(path);

        g.setColor(new Color(133, 133, 133));
        g.fillRect(450, 430, 150,10);
        g.fillRect(-70, 430, 150,10);

        g.setColor(Color.RED);
        g.fillRect(0,420,720,10);
        g.fillRect(380,295,70,135);

        g.fillRect(0,310,350,60);
        g.fillRect(480,310,140,60);

        g.setColor(Color.black);
        g.drawRect(380,295,70,135);

        g.setColor(new Color(174, 176, 179));
        g.fillRect(395,315,40,50);

        g.fillRect(500,315,100,50);

        for (int i = 0; i < NumOfWin; i++ ){
            g.fillRect(20 + i * 80,315,60,50);
        }

        g.setColor(new Color(138, 138, 140));
        g.drawRect(395,315,40,50);

        g.drawRect(500,315,100,50);
    }
}
