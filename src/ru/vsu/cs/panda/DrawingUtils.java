package ru.vsu.cs.panda;

import java.awt.*;

public class DrawingUtils {
    public static void drawRect(Graphics2D g , int x, int y, int width, int height , Color c) {
        g.setColor(c);
        g.fillRect(x, y, width, height);
    }
    public static void drawArc(Graphics2D g, int x, int y, int width, int height, int startAngle, int arcAngle, Color c){
        g.setColor(c);
        g.fillArc(x,y,width,height,startAngle,arcAngle);
    }
    public static void drawOval(Graphics2D g, int x, int y, int width, int height , Color c){
        g.setColor(c);
        g.fillOval(x, y, width, height);
    }
    public static void copyingRectangles(Graphics2D g , int x, int y, int width, int height , Color c) {
        for (int i = 0; i<18; i++){
            g.setColor(c);
            g.fillRect(50*i+x,y,width,height);
        }
        g.setColor(c);


    }
}

