package TemplateMethod.FrameHook;

import javax.swing.*;
import java.awt.*;

/**
 * Using JFrame to get into its update() method with hook method paint()
 */
public class MyFrame extends JFrame{
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        String msg = "Hello Design Patterns";
        g.setColor(Color.RED);
        g.drawString(msg, 90, 150);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Hook!");
    }
}
