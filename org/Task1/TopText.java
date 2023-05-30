package org.Task1;

import javax.swing.*;
import java.awt.*;

/**
 * class for the top text
 */
public class TopText extends JLabel {
    protected JPanel topTextWord;
    protected JLabel word;

    /**
     * Constructor for the top text
     */
    public TopText() {
        topTextWord = new JPanel(new FlowLayout(FlowLayout.CENTER));
        word = new JLabel("Enter two oprands, result and click on 'Check!'");
        topTextWord.add(word);
    }

    /**
     * Constructor for the top text
     * @param string the string to be displayed
     */
    public TopText(String string) {
        topTextWord = new JPanel();
        word = new JLabel(string);
        topTextWord.add(word);
    }

//    public void rightCheck() {
//        word.setText("Correct! Have another go?");
//    }
}
