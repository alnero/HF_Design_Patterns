package Proxy.ImageVirtualProxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Virtual image proxy object standing between the client sending the download request and real object
 * which is downloaded from a network.
 */
public class ImageProxy implements Icon{
    volatile ImageIcon imageIcon;
    final URL url;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.url = url;
    }

    synchronized void setImageIcon(ImageIcon icon){
        this.imageIcon = icon;
    }

    @Override
    public void paintIcon(final Component c, Graphics  g, int x,  int y) {
        if (imageIcon != null) {
            // additional check if there is an error while downloading
            if(imageIcon.getImageLoadStatus() == 4){
                g.drawString("ERROR loading CD cover, check connection...", x+270, y+350);
            }
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x+310, y+350);
            if (!retrieving) {
                retrieving = true;
                // separate thread to download a cd cover
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            // constructor won't return an image until it is fully loaded,
                            // but will create an object if there is an error while downloading
                            setImageIcon(new ImageIcon(url, "CD Cover"));
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        // additional check that icon is fully and properly loaded
        if (imageIcon != null && imageIcon.getImageLoadStatus() == 8) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        // additional check that icon is fully and properly loaded
        if (imageIcon != null && imageIcon.getImageLoadStatus() == 8) {
            return imageIcon.getIconHeight();
        } else {
            return 800;
        }
    }
}
