package org.ExtraCredit;

import javax.swing.*;
import java.awt.*;

/**
 * The TopText class represents a JLabel for displaying top text in the main frame.
 */
public class TopText extends JLabel {
    protected JPanel topTextWord;
    protected JLabel word;

    /**
     * Constructs a TopText object with a default text.
     */
    public TopText() {
        topTextWord = new JPanel(new FlowLayout(FlowLayout.CENTER));
        word = new JLabel("Enter two operands, result and click on 'Check!'");
        topTextWord.add(word);
    }

    /**
     * Constructs a TopText object with the specified text.
     *
     * @param string The text to be displayed.
     */
    public TopText(String string) {
        topTextWord = new JPanel();
        word = new JLabel(string);
        topTextWord.add(word);
    }

}
