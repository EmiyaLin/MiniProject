package org.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A JPanel class that represents a panel with text fields and a button.
 * The text fields have key listeners to limit the input based on certain conditions.
 */
public class ButtomText extends JPanel {
    protected JPanel jPanel;
    protected JButton button;

    /**
     * Constructs a ButtomText panel with text fields and a button.
     * The text fields have key listeners to limit the input based on certain conditions.
     */
    public ButtomText() {
        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // First number text field
        JTextField numTextField1 = new JTextField(2);
        numTextField1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String key = numTextField1.getText();
                int count = 10;
                String value = getLimit(key, count);
                if (value.indexOf(e.getKeyChar()) < 0)
                    e.consume();
            }
        });
        jPanel.add(numTextField1);
        jPanel.add(new JLabel("+"));

        // Second number text field
        JTextField numTextField2 = new JTextField(2);
        numTextField2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String key = numTextField2.getText();
                int count = 10;
                String value = getLimit(key, count);
                if (value.indexOf(e.getKeyChar()) < 0)
                    e.consume();
            }
        });
        jPanel.add(numTextField2);
        jPanel.add(new JLabel("="));

        // Result text field
        JTextField numTextField3 = new JTextField(2);
        numTextField3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String key = numTextField3.getText();
                int count = 100;
                String value = getLimit(key, count);
                if (value.indexOf(e.getKeyChar()) < 0)
                    e.consume();
            }
        });
        jPanel.add(numTextField3);

        button = new JButton("Check!");
        jPanel.add(button);
    }

    /**
     * Generates a string representation of consecutive numbers between 'a' and 'b'.
     *
     * @param a The starting number.
     * @param b The ending number.
     * @return The string representation of consecutive numbers.
     */
    private String string(int a, int b) {
        String value = "";
        for (int i = a; i <= b; i++)
            value += String.valueOf(i);
        return value;
    }

    /**
     * Gets the limit for input based on the provided key and number.
     *
     * @param key The input key.
     * @param num The limit number.
     * @return The string representation of valid input values.
     */
    private String getLimit(String key, int num) {
        String value = String.valueOf(num);
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int b = num;
        int len = key.length(), length = value.length();
        for (int i = 0; b > 0; i++, b /= 10)
            a[length - 1 - i] = b % 10;
        int in;
        if (key.equals(""))
            in = 0;
        else
            in = Integer.parseInt(key) * 10;
        if (len < length - 1) {
            if (len == 0)
                value = string(1, 9);
            else
                value = string(0, 9);
        } else if (len == length - 1) {
            if (in <= num)
                if (in == 0)
                    value = string(1, a[len]);
                else
                    value = string(0, a[len]);
            else
                value = "";
        } else {
            value = "";
        }
        return value;
    }
}
