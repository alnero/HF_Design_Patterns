package Proxy.ImageVirtualProxyUsingState;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Class representing the state when icon is not downloaded yet.
 * The download process is started in separate thread in paintIcon() method.
 */
public class ImageNotLoadedState implements ImageState {
    URL url;
    ImageIcon imageIcon;
    Image image;

    public ImageNotLoadedState(Image image, URL url) {
        this.image = image;
        this.url = url;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        g.drawString("Loading CD cover, please wait...", x+260, y+300);
        Thread retrievalThread = new Thread(new Runnable() {
            public void run() {
                try {
                    // constructor won't return an image until it is fully loaded,
                    // but will create an object if there is an error while downloading
                    imageIcon = new ImageIcon(url, "CD Cover");
                    image.setState(new ImageLoadedState(imageIcon));
                    c.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        retrievalThread.start();
    }

    @Override
    public int getIconWidth() {
        return 700;
    }

    @Override
    public int getIconHeight() {
        return 700;
    }
}
