package org.Task1;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used to create plus image
 */
public class PlusImage {

    /**
     * constructor of plus image, use grid layout
     */
    JPanel panel = new JPanel(new GridLayout(1, 1));

    /**
     * constructor of plus image, use grid layout
     * @param path path of image
     */
    public PlusImage(String path) {
        panel.add(new JLabel(new ImageIcon(path), JLabel.CENTER), BorderLayout.CENTER);
    }

}
