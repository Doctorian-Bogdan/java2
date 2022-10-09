package objects;

import java.awt.*;

public class Tablo {
    public static void drawTablo(Graphics2D g) {
        g.setColor(Color.darkGray);
        g.fillRect(370, 0,4,30);
        g.fillRect(430, 0,4,30);

        g.fillRect(300, 30, 200, 80);

        g.fillRect(0, 450,800,150);

        g.setColor(Color.lightGray);
        g.drawRect(300, 30, 200, 80);

        g.setColor(new Color(225, 223, 48));
        g.setFont(new Font("Times", Font.PLAIN, 19));
        g.drawString("МСК - ВОР       Путь 4", 305,60);
        g.drawString("ПЕТ - ВОР       Путь 7", 305,90);
    }
}
