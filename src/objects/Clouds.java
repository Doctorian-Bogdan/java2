package objects;

import java.awt.*;

public class Clouds {
    public static void drawClouds(Graphics2D g) {
        g.setColor(Color.white);
        g.fillOval(50,30,50,30);
        g.fillOval(5,10,50,30);
        g.fillOval(15,20,70,20);

        g.fillOval(660,50,50,30);
        g.fillOval(700,50,50,30);
        g.fillOval(680,65,70,30);
    }
}
