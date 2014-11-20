package TemplateMethod;

import java.applet.Applet;
import java.awt.*;

/**
 * Hook methods in Applet
 */
public class MyApplet extends Applet{
    String message;

    @Override
    public void init(){
        message = "I'm initializing...";
        repaint();
    }

    @Override
    public void start(){
        message = "I'm starting...";
        repaint();
    }

    @Override
    public void stop(){
        message = "I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy(){

    }

    @Override
    public void paint(Graphics g){
        g.drawString(message, 50, 50);
    }
}
