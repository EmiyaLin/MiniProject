package org.Task1;

import javax.swing.*;

/**
 * The Image class is an abstract class that is extended by the RabbitImage class and PlusImage class.
 */
public class Image extends JPanel {
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
     * @param path The path to the image.
     */
    public void addImages(String path) {
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(path);
        jLabel.setIcon(imageIcon);
        image.add(jLabel);
    }
}
