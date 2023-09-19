package ru.vsu.cs.panda;

import ru.vsu.cs.panda.elements.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        // background
        g.setColor(new Color(22, 38, 40));
        g.fillRect(0,0, this.getWidth(), this.getHeight());
        // Рисуем основу фонаря

        Rect o2 = new Rect(250, 150, 100, 300, Color.BLACK);
        o2.draw(g);

        // Рисуем верхнюю часть фонаря

        Arc a2 = new Arc(225, 125, 150, 150, 0, 180, Color.BLACK);
        a2.draw(g);

        // Рисуем стекло фонаря

        Arc a3 = new Arc(250, 150, 100, 100, 0, 180, Color.YELLOW);
        a3.draw(g);

        // Рисуем основную часть столба фонаря

        Rect o3 = new Rect(275, 400, 50, 200, Color.BLACK);
        o3.draw(g);

        // Рисуем кронштейн фонаря

        Rect k1 = new Rect(250, 450, 100, 50, Color.BLACK);
        k1.draw(g);

        // Рисуем асфальт
        Plate m = new Plate(0, 600, 20, new Color(119, 115, 115, 255));
        m.draw(g, 45, 80);


        // Рисуем основание клетки

        Rect o1 = new Rect(550, 600, 900, 30, Color.DARK_GRAY);
        o1.draw(g);

        //Задаем надпись на основании клетки

        g.setColor(new Color(0xFFFFFF));
        g.setFont(new Font("Times", Font.PLAIN, 25));
        g.drawString("Заключенный №01010.Не кормить.", 780, 617);

        // Рисуем бамбук в клетке
        Coping b1 = new Coping(570, 250, 20, 350, new Color(45, 108, 5));
        b1.draw(g);


        //Верхняя часть туловища

        Oval t1 = new Oval(700, 400, 170, 180, Color.black);
        t1.draw(g);

        // Нижняя часть тела панды

        Oval t2 = new Oval(680, 470, 200, 130, Color.WHITE);
        t2.draw(g);

        // Правая нога панды

        Oval t3 = new Oval(680, 550, 50, 50, Color.BLACK);
        t3.draw(g);

        //Левая нога панды

        Oval t4 = new Oval(830, 550, 50, 50, Color.BLACK);
        t4.draw(g);

        //правое ухо панды

        Oval t6 = new Oval(830, 340, 30, 30, Color.black);
        t6.draw(g);

        //левое ухо панды

        Oval t7 = new Oval(710, 340, 30, 30, Color.black);
        t7.draw(g);

        //Голова Панды

        Oval t5 = new Oval(715, 340, 140, 110, Color.WHITE);
        t5.draw(g);

        //Овалы глаз

        Oval t8 = new Oval(740, 360, 25, 40, Color.black);
        t8.draw(g);
        Oval t9 = new Oval(800, 360, 25, 40, Color.black);
        t9.draw(g);

        // Глаза
        Oval t10 = new Oval(745, 375, 10, 10, Color.white);
        t10.draw(g);
        Oval t11 = new Oval(805, 375, 10, 10, Color.white);
        t11.draw(g);

        //Зрачки

        Oval t15 = new Oval(745, 377, 7, 7, Color.black);
        t15.draw(g);
        Oval t16 = new Oval(807, 377, 7, 7, Color.black);
        t16.draw(g);

        // Рот

        Arc a4 = new Arc(760, 410, 50, 20, 180, 180, Color.black);
        a4.draw(g);

        // Нос

        Oval t12 = new Oval(780, 390, 10, 10, Color.black);
        t12.draw(g);

        // Правая лапа

        Oval t13 = new Oval(830, 445, 120, 30, Color.black);
        t13.draw(g);

        //Левая лапа

        Oval t14 = new Oval(630, 445, 120, 30, Color.black);
        t14.draw(g);

        //  папайя в руке у панды
        Arc a5 = new Arc(630, 400, 50, 120, 100, 180, Color.yellow);
        a5.draw(g);

        //  домик
        Rect l1 = new Rect(1000, 570, 20, 30, Color.ORANGE);
        l1.draw(g);
        Rect l2 = new Rect(1300, 570, 20, 30, Color.ORANGE);
        l2.draw(g);
        Rect m1 = new Rect(1000, 370, 330, 200, Color.red);
        m1.draw(g);
        Arc a7 = new Arc(990, 270, 350, 200, 0, 180, Color.yellow);
        a7.draw(g);
        Rect l3 = new Rect(1050, 470, 240, 100, Color.black);
        l3.draw(g);
        Rect l4 = new Rect(1040, 570, 170, 20, Color.darkGray);
        l4.draw(g);
        Rect l5 = new Rect(1020, 590, 170, 10, Color.darkGray);
        l5.draw(g);


        // Рисуем решетки клетки панды
        Coping g1 = new Coping(560, 200, 7, 400, Color.gray);
        g1.draw(g);
        //Крыша клетки
        Arc a6 = new Arc(500, 50, 1000, 300, 0, 180, Color.blue);
        a6.draw(g);

        //Ножки для лавочки

        Rect o4 = new Rect(100, 580, 10, 40, Color.DARK_GRAY);
        o4.draw(g);
        Rect o5 = new Rect(300, 580, 10, 40, Color.DARK_GRAY);
        o5.draw(g);

        //Сиденье у скамейки

        Rect o6 = new Rect(60, 550, 300, 30, Color.blue);
        o6.draw(g);

        // Ножки к спинке скамейки

        Rect o7 = new Rect(120, 530, 10, 20, Color.DARK_GRAY);
        o7.draw(g);
        Rect o8 = new Rect(320, 530, 10, 20, Color.DARK_GRAY);
        o8.draw(g);

        //Спинка Скамейки
        Rect o9 = new Rect(90, 500, 300, 30, Color.blue);
        o9.draw(g);
    }
}

