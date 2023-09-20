package ru.vsu.cs.panda.elements;

import java.awt.*;

public class Bench {
    private int x, y;

    public Bench(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g){
        Color save = g.getColor();
        //Ножки для лавочки
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 580, 10, 40);
        g.fillRect(300, 580, 10, 40);
        //Сиденье у скамейки
        g.setColor(Color.BLUE);
        g.fillRect(60, 550, 300, 30);
        // Ножки к спинке скамейки
        g.setColor(Color.DARK_GRAY);
        g.fillRect(120, 530, 10, 20);
        g.fillRect(320, 530, 10, 20);
        //Спинка Скамейки
        g.setColor(Color.BLUE);
        g.fillRect(90, 500, 300, 30);
        g.setColor(save);
    }

}
