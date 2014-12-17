package Proxy.ImageVirtualProxyUsingState;

import javax.swing.*;
import java.awt.*;

/**
 * Component to properly paint the CD cover image in a window.
 */
public class ImageComponent extends JComponent {
    private static final long serialVersionUID = 1L;
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = icon.getIconWidth();
        int height = icon.getIconHeight();
        int x = (700 - width) / 2;
        int y = (600 - height) / 2;
        icon.paintIcon(this, g, x, y);
    }
}

