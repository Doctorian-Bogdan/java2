package objects;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawUtils {
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

    public static void drawRoad(Graphics2D g, int plitka) {
        for (int j = 0; j<13; j++){
            if(j%2 == 0){
                for (int i = 0; i < plitka; i++ ){
                    g.setColor(new Color(208, 176, 132));
                    g.fillRect(i*30,450 + j * 10,30,10);
                    g.setColor(new Color(77, 77, 77));
                    g.drawRect(i*30,450 + j * 10,30,10);
                }
            }else{
                for (int i = 0; i < plitka; i++ ){
                    g.setColor(new Color(208, 176, 132));
                    g.fillRect(-15 + i*30,450 + j * 10,30,10);
                    g.setColor(new Color(77, 77, 77));
                    g.drawRect(-15 + i*30,450 + j * 10,30,10);
                }
            }
        }
    }

    public static void drawMan(Graphics2D g) {
        g.setColor(new Color(0, 0, 0));
        g.drawLine(450, 550, 480, 510);
        g.drawLine(515, 540, 480, 510);
        g.drawLine(475, 455, 480, 510);
        g.drawLine(475, 455, 500, 495);
        g.drawLine(475, 455, 430, 430);
        g.fillOval(465,430,25,25);
    }

    public static void drawBackground(Graphics2D g) {
        g.setColor(new Color(83, 189, 222, 166));
        g.fillRect(0, 0, 800, 600);
    }

    public static void drawClouds(Graphics2D g, int x, int width) {
        for(int i = x; i < width*3; i+=500 ){
            g.setColor(Color.white);
            g.fillOval(i + 50, 30, 50, 30);
            g.fillOval(i + 5, 10, 50, 30);
            g.fillOval(i + 15, 20, 70, 20);

            g.fillOval(i + 660, 50, 50, 30);
            g.fillOval(i + 700, 50, 50, 30);
            g.fillOval(i + 680, 65, 70, 30);
        }
    }
}
