package Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Create a JButton with two listeners(observers) providing console output on a button press.
 */
public class SwingObserverExample {
    private JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample angelDevilButton = new SwingObserverExample();
        angelDevilButton.go();
    }

    /**
     * Create frame and button, add listeners to the button, add properties to frame and display it.
     */
    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Button listener with good advices.
     */
    private class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you may regret!");
        }
    }

    /**
     * Button listener with bad advices.
     */
    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do it!");
        }
    }
}
