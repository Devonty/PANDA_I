package ru.vsu.cs.panda.elements;

import ru.vsu.cs.panda.DrawingUtils;

import java.awt.*;

public class Coping {
    private int x, y, width, height;
    private Color c;

    public Coping( int x, int y, int width, int height, Color c) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;
    }
    public void draw(Graphics2D g) {
        DrawingUtils.copyingRectangles(g,x,y,width,height, c);

    }
}