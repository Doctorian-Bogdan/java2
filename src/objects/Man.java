package objects;

import java.awt.*;

public class Man {
    public static void drawMan(Graphics2D g) {
        g.setColor(new Color(0, 0, 0));
        g.drawLine(450, 550, 480, 510);
        g.drawLine(515, 540, 480, 510);
        g.drawLine(475, 455, 480, 510);
        g.drawLine(475, 455, 500, 495);
        g.drawLine(475, 455, 430, 430);
        g.fillOval(465,430,25,25);
    }
}
