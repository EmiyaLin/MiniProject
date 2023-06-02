package org.ExtraCredit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * A panel that displays the bottom text and a check button.
 */
public class ButtomText extends JPanel {
    protected JPanel jPanel;
    protected JButton button;

    /**
     * Constructs a ButtomText object.
     */
    public ButtomText() {
        jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JTextField numTextField1 = new JTextField(2);
        numTextField1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String key = numTextField1.getText();
                int count = 25;
                String value = getLimit(key, count);
                if (value.indexOf(e.getKeyChar()) < 0)
                    e.consume();
            }
        });
        jPanel.add(numTextField1);

        jPanel.add(new JLabel("+"));

        JTextField numTextField2 = new JTextField(2);
        numTextField2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                String key = numTextField2.getText();
                int count = 25;
                String value = getLimit(key, count);
                if (value.indexOf(e.getKeyChar()) < 0)
                    e.consume();
            }
        });
        jPanel.add(numTextField2);

        jPanel.add(new JLabel("="));

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
     * Returns a string representation of numbers between a and b (inclusive).
     *
     * @param a the starting number
     * @param b the ending number
     * @return a string representation of numbers between a and b
     */
    private String string(int a, int b) {
        String value = "";
        for (int i = a; i <= b; i++)
            value += String.valueOf(i);
        return value;
    }

    /**
     * Returns a limited string based on the key and count.
     *
     * @param key the key string
     * @param num the count
     * @return a limited string based on the key and count
     */
    private String getLimit(String key, int num) {
        // 示例讲解：key = "13" count = 135
        String value = String.valueOf(num); // value = "135";
        int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int b = num;
        // b = 135,a[] = {0,……};
        int len = key.length(), length = value.length();
        // len = 2,length = 3;
        for (int i = 0; b > 0; i++, b /= 10)
            a[length - 1 - i] = b % 10;
        // a[] = {1,3,5,0,……};
        int in;
        if (key.equals(""))
            in = 0;
        else
            in = Integer.parseInt(key) * 10;
        // in = 130;
        if (len < length - 1) {
            if (len == 0)
                value = string(1, 9); // 限制第一位不能输入0
            else
                value = string(0, 9);
        } else if (len == length - 1) {
            // 进入这里 in = 130 < num = 135
            if (in <= num)
                if (in == 0)
                    value = string(1, a[len]);
                else
                    value = string(0, a[len]); // 所以：value = "012345";
            else
                value = "";
        } else {
            value = "";
        }
        // 返回的字符串为："0123456"
        return value;
    }
}
