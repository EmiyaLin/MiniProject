package org.Task1;

import javax.swing.*;
import java.awt.*;

public class TopText extends JLabel {
    protected JPanel topTextWord;
    protected JLabel word;
    public TopText() {
        topTextWord = new JPanel(new FlowLayout(FlowLayout.CENTER));
        word = new JLabel("Enter two oprands, result and click on 'Check!'");
        topTextWord.add(word);
    }

    public TopText(String string) {
        topTextWord = new JPanel();
        word = new JLabel(string);
        topTextWord.add(word);
    }

//    public void rightCheck() {
//        word.setText("Correct! Have another go?");
//    }
}
