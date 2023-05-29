package org.Task1;

import javax.swing.*;

public class Image extends JPanel {
    protected JPanel image;

    public Image() {
        image = new JPanel();
    }

    public void addImages(String path) {
        JLabel jLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(path);
        jLabel.setIcon(imageIcon);
        image.add(jLabel);
    }
}
