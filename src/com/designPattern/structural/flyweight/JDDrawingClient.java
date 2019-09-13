package com.designPattern.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDDrawingClient extends JFrame {

    //Wrapper classes(valueOf() method) also uses flyweight design pattern apart from string pool
    //https://howtodoinjava.com/java/basics/object-initialization-best-practices-internal-caching-in-wrapper-classes/

    private final int WIDTH;
    private final int HEIGHT;

    private static final JDShapeFactory.ShapeType shapes[]={JDShapeFactory.ShapeType.LINE, JDShapeFactory.ShapeType.OVAL_FILL, JDShapeFactory.ShapeType.OVAL_NOFILL};
    private static final Color colors[] = {Color.RED,Color.GREEN,Color.YELLOW};

    public JDDrawingClient(int width,int height){
        this.WIDTH=width;
        this.HEIGHT=height;
        Container contentPane = getContentPane();


        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 20; ++i) {
                    JDShape shape = JDShapeFactory.getShape(getRandomShape());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(),
                            getRandomHeight(), getRandomColor());
                }
            }
        });
    }

    private JDShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        JDDrawingClient drawing = new JDDrawingClient(500,600);
    }

}