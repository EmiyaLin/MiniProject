package org.Task2;

import javax.swing.*;

/**
 * An abstract class that represents an image panel.
 * It provides functionality to add images to the panel.
 */
public abstract class Image extends JPanel {
    protected JPanel image;

    /**
     * Constructs an Image panel.
     */
    public Image() {
        image = new JPanel();
    }

    /**
     * Adds an image to the panel.
     *
     * @param path The path of the image file.
     */
    public void addImages(String path) {
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(path);
        jLabel.setIcon(imageIcon);
        image.add(jLabel);
    }
}
