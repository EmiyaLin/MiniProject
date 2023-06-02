package org.Task2;

import javax.swing.*;
import java.awt.*;

/**
 * A panel that displays the plus image.
 */
public class PlusImage {

    JPanel panel = new JPanel(new GridLayout(1, 1));

    /**
     * Constructs a PlusImage object with the specified image path.
     *
     * @param path The path of the plus image.
     */
    public PlusImage(String path) {
        panel.add(new JLabel(new ImageIcon(path), JLabel.CENTER), BorderLayout.CENTER);
    }
}
