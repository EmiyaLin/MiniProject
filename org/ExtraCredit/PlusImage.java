package org.ExtraCredit;

import javax.swing.*;
import java.awt.*;

/**
 * The PlusImage class represents an image of a plus sign.
 */
public class PlusImage {

    JPanel panel = new JPanel(new GridLayout(1, 1));

    /**
     * Constructs a PlusImage object with the specified image path.
     *
     * @param path The path to the image.
     */
    public PlusImage(String path) {
        panel.add(new JLabel(new ImageIcon(path), JLabel.CENTER), BorderLayout.CENTER);
    }

}
