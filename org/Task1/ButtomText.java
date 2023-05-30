package org.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * The ButtomText class represents a JPanel object with a FlowLayout for displaying text fields and a check button.
 */
public class ButtomText extends JPanel {
    protected JPanel jPanel;
    protected JButton button;

    /**
     * Constructs a ButtomText object with a FlowLayout.
     */
    public ButtomText() {
        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField numTextField1 = new JTextField(2);
        jPanel.add(numTextField1);
        jPanel.add(new JLabel("+"));
        JTextField numTextField2 = new JTextField(2);
        jPanel.add(numTextField2);
        jPanel.add(new JLabel("="));
        JTextField numTextField3 = new JTextField(2);
        jPanel.add(numTextField3);
        button = new JButton("Check!");
        jPanel.add(button);
    }
}
