package Proxy.ImageVirtualProxyUsingState;

import java.awt.*;
import java.net.URL;

/**
 * Main class - image of the CD cover.
 * Using virtual proxy patterns to get an image from internet and state pattern to transfer between placeholder and downloaded image.
 */
public class Image implements ImageState{
    URL url;
    private ImageState state;
    private ImageState proxyState;

    public Image(URL url) {
        this.url = url;
        proxyState = new ImageNotLoadedState(this, url);
        state = proxyState;
    }

    public ImageState getState() {
        return state;
    }

    public void setState(ImageState state) {
        this.state = state;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }

    @Override
    public int getIconWidth() {
        return state.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return state.getIconHeight();
    }
}
