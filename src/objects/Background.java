package objects;

import java.awt.*;

public class Background {
    public static void drawBackground(Graphics2D g) {
        g.setColor(new Color(83, 189, 222, 166));
        g.fillRect(0, 0, 800, 600);
    }
}
