package objects;

import java.awt.*;
import javax.swing.*;

public class Road{
    public static void drawRoad(Graphics2D g, int plitka) {
        int k =0;
        for (int j = 0; j<13; j++){
            if(k%2 == 0){
                for (int i = 0; i < plitka; i++ ){
                    g.setColor(new Color(208, 176, 132));
                    g.fillRect(i*30,450 + j * 10,30,10);
                    g.setColor(new Color(77, 77, 77));
                    g.drawRect(i*30,450 + j * 10,30,10);
                    k++;
                }
            }else{
                for (int i = 0; i < plitka; i++ ){
                    g.setColor(new Color(208, 176, 132));
                    g.fillRect(-15 +i*30,460 + j * 10,30,10);
                    g.setColor(new Color(77, 77, 77));
                    g.drawRect(-15 + i*30,460 + j * 10,30,10);
                    k++;
                }
            }
        }
    }
}
