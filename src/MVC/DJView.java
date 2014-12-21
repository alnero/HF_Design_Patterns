package MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Two main views for the beat model.
 */
public class DJView implements ActionListener, BeatObserver, BPMObserver{
    BeatModelInterface model;
    ControllerInterface controller;
    JFrame viewFrame;
    JPanel viewPanel;
    JFrame controlFrame;
    JPanel controlPanel;
    JTextField bpmTextField;
    JButton setBPMBtn;
    JButton increaseBPMBtn;
    JButton decreaseBPMBtn;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;
    JLabel bpmOutputLabel;
    BeatBar beatBar;

    public DJView(BeatModelInterface model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BPMObserver)this);
        model.registerObserver((BeatObserver)this);
    }

    public void createView(){
        viewPanel = new JPanel(new GridLayout(1,2));
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bpmOutputLabel = new JLabel("Offline", SwingConstants.CENTER);
        beatBar = new BeatBar();
        beatBar.setValue(0);
        JPanel BPMPanel = new JPanel(new GridLayout(2,1));
        BPMPanel.add(beatBar);
        BPMPanel.add(bpmOutputLabel);
        viewPanel.add(BPMPanel);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setSize(200, 80);
        viewFrame.setLocationRelativeTo(null);
        viewFrame.setVisible(true);
    }

    public void createControls(){
        controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        controlPanel = new JPanel(new GridLayout(1,2));

        menuBar = new JMenuBar();
        menu = new JMenu("Menu");

        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.start();
                bpmTextField.setText(model.getBpm() + "");
            }
        });

        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem);
        stopMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.stop();
            }
        });

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        menu.add(exitMenuItem);
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmTextField = new JTextField(2);
//        bpmTextField.setText(model.getBpm() + "");
        setBPMBtn = new JButton("Set BPM");
        setBPMBtn.setSize(10,40);
        increaseBPMBtn = new JButton(" >> ");
        decreaseBPMBtn = new JButton(" << ");
        setBPMBtn.addActionListener(this);
        increaseBPMBtn.addActionListener(this);
        decreaseBPMBtn.addActionListener(this);

        JPanel enterPanel = new JPanel(new GridLayout(1, 3));
        enterPanel.add(decreaseBPMBtn);
        enterPanel.add(bpmTextField);
        enterPanel.add(increaseBPMBtn);
        JPanel insideControlPanel = new JPanel(new GridLayout(2, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBPMBtn);
        controlPanel.add(insideControlPanel);

        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        controlFrame.getRootPane().setDefaultButton(setBPMBtn);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setSize(200, 120);
        controlFrame.setLocation(viewFrame.getX(), viewFrame.getY() + viewFrame.getHeight());
        controlFrame.setVisible(true);
    }

    public void updateBPM(){
        int bpm = model.getBpm();
        if(bpm == 0){
            bpmOutputLabel.setText("offline");
        } else {
            bpmOutputLabel.setText(model.getBpm() + "BPM");
        }
    }

    public void updateBeat(){
        beatBar.setValue(100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == setBPMBtn){
            int bpm = Integer.parseInt(bpmTextField.getText());
            controller.setBPM(bpm);
        } else if (e.getSource() == increaseBPMBtn){
            controller.increaseBPM();
            bpmTextField.setText(model.getBpm() + "");
        } else if (e.getSource() == decreaseBPMBtn){
            controller.decreaseBPM();
            bpmTextField.setText(model.getBpm() + "");
        }
    }

    public void enableStopMenu(){
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenu(){
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenu(){
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenu(){
        startMenuItem.setEnabled(false);
    }


}
