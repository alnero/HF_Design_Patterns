package Proxy.ImageVirtualProxyUsingState;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

/**
 * Testing proxy and state patterns working together in CD cover downloading.
 */
public class ProxyWithStateTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("Your favourite CD Covers by Amazon.com");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> cds = new Hashtable<>();

    public static void main(String[] args) throws Exception {
        ProxyWithStateTestDrive testDrive = new ProxyWithStateTestDrive();
    }

    public ProxyWithStateTestDrive() throws Exception {
        cds.put("Best Songs","http://ecx.images-amazon.com/images/I/31%2Bby83AF9L.jpg");
        cds.put("Natasha","http://ecx.images-amazon.com/images/I/51H6AOeMhyL.jpg");
        cds.put("Sinyaya Boroda","http://ecx.images-amazon.com/images/I/41ROoPOfcqL.jpg");
        cds.put("Rocket Ride A.D.","http://ecx.images-amazon.com/images/I/51wVtzymhsL.jpg");
        cds.put("Music From The Eastblock Jungles","http://ecx.images-amazon.com/images/I/511qMBI3SkL.jpg");
        cds.put("Twisted Balloon","http://ecx.images-amazon.com/images/I/515T15aFovL._SS280.jpg");

        URL initialURL = new URL(cds.get("Best Songs"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favourite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for(String name : cds.keySet()){
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new Image(getCDURL(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon icon = new Image(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setVisible(true);
    }

    private URL getCDURL(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }
    }
}
