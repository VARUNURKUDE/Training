package com.designPattern.structural.flyweight;

import java.awt.*;

public class JDLine implements JDShape {

    public JDLine(){
        System.out.println("Creating line object");

        //adding time delay
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){
                ex.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
            line.setColor(color);
            line.drawLine(x1,y1,x2,y2);
    }
}
