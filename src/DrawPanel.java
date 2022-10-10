import objects.Cloud;
import objects.DrawUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DrawPanel extends JPanel {
    private Cloud cloud;
    public DrawPanel() {
        cloud = new Cloud(0, 800);
        Timer t = new Timer(100, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cloud.moveClouds(1);
                repaint();
            }
        });
        t.start();
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        DrawUtils.drawBackground(g);

        cloud.drawClouds(g);

        DrawUtils.drawTablo(g);

        DrawUtils.drawTrain(g, 4);

        DrawUtils.drawRoad(g, 30);

        DrawUtils.drawMan(g);
    }
}