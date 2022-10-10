package objects;

import java.awt.*;

public class Cloud {
    private int x, width;
    public Cloud(int x, int width) {
        this.width = width;
        this.x = x;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void drawClouds(Graphics2D g){
        DrawUtils.drawClouds(g,x,width);
    }

    public void moveClouds(int shift){
        x -= shift;
    }
}
