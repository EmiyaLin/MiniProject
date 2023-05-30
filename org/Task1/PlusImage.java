package org.Task1;

import javax.swing.*;
import java.awt.*;

public class PlusImage {

    JPanel panel = new JPanel(new GridLayout(1, 1));
    public PlusImage(String path) {
//        JLabel jLabel = new JLabel();
//        ImageIcon imageIcon = new ImageIcon(path);
//        jLabel.setIcon(imageIcon);
        panel.add(new JLabel(new ImageIcon(path), JLabel.CENTER), BorderLayout.CENTER);
    }

}
