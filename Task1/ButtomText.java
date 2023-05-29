package org.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtomText extends JPanel {
    protected JPanel jPanel;
    protected JButton button;

    public ButtomText() {
//        ArrayList<numTextField> arrayList = new ArrayList<numTextField>();
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
