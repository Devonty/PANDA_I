package ru.vsu.cs.panda.elements;


import ru.vsu.cs.panda.DrawingUtils;

import java.awt.*;

public class Arc {
    private int x, y, width, height, startAngle, arcAngle;
    private Color c;

    public Arc(int x, int y, int width, int height, int startAngle, int arcAngle, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.c = c;

    }
    public void draw(Graphics2D g) {
        DrawingUtils.drawArc(g,x,y,width,height,startAngle,arcAngle,c);

    }
}
