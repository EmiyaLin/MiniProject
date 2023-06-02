package org.ExtraCredit;

import javax.swing.*;

/**
 * An abstract class representing an image panel.
 */
public abstract class Image extends JPanel {
    protected JPanel image;

    /**
     * Constructs an Image object.
     */
    public Image() {
        image = new JPanel();
    }

    /**
     * Adds an image to the panel.
     *
     * @param path the path to the image file
     */
    public void addImages(String path) {
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(path);
        jLabel.setIcon(imageIcon);
        image.add(jLabel);
    }
}
