import objects.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        Background.drawBackground(g);

        Tablo.drawTablo(g);

        Train.drawTrain(g, 4);

        Clouds.drawClouds(g);

        Road.drawRoad(g, 30);

        Man.drawMan(g);
    }
}