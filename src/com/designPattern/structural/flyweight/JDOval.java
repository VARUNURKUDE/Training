package com.designPattern.structural.flyweight;

import java.awt.*;

public class JDOval implements JDShape {

    private boolean fill;
    public JDOval(boolean f){
        this.fill =f;
        System.out.println("Creating oval object with fill = "+f);

        try{
                Thread.sleep(2000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
                circle.setColor(color);
                circle.drawOval(x,y,width,height);
                if(fill){
                    circle.fillOval(x,y,width,height);
                }
    }
}
