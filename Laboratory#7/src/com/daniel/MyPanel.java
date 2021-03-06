package com.daniel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class MyPanel extends JPanel {
    private BufferedImage buffer;

    MyPanel(){
        int width = (int) (1950 / (1.5));
        int height = (int) (1050 / 1.5);
        setPreferredSize(new Dimension(width, height));
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(buffer, 0, 0, null);
    }

    public BufferedImage getBuffer(){
        return buffer;
    }

    public void loadImage(BufferedImage buf){
        buffer.createGraphics().setColor(Color.WHITE);
        buffer.createGraphics().fillRect(0, 0, getWidth(), getHeight());
        buffer.createGraphics().drawImage(buf,0,0,null);
        repaint();
    }

}
