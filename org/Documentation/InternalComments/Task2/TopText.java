package org.Task2;

import javax.swing.*;
import java.awt.*;

/**
 * A label that displays the top text.
 */
public class TopText extends JLabel {
    protected JPanel topTextWord;
    protected JLabel word;

    /**
     * Constructs a TopText object with the default text.
     */
    public TopText() {
        topTextWord = new JPanel(new FlowLayout(FlowLayout.CENTER));
        word = new JLabel("Enter two operands, result and click on 'Check!'");
        topTextWord.add(word);
    }

    /**
     * Constructs a TopText object with a custom text.
     *
     * @param string The custom text to be displayed.
     */
    public TopText(String string) {
        topTextWord = new JPanel();
        word = new JLabel(string);
        topTextWord.add(word);
    }
}
