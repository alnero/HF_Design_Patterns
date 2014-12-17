package Proxy.ImageVirtualProxyUsingState;

import javax.swing.*;
import java.awt.*;

/**
 * Class showing the state when icon is fully downloaded.
 */
public class ImageLoadedState implements ImageState{
    ImageIcon imageIcon;

    public ImageLoadedState(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // additional check if there is an error while downloading
        if(imageIcon.getImageLoadStatus() == 4){
            g.drawString("ERROR loading CD cover, check connection...", x-120, y-50);
        }
        imageIcon.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }
}
