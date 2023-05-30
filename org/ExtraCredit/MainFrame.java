package org.ExtraCredit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The MainFrame class represents the main frame of the program.
 */
public class MainFrame {
    protected JFrame mainFrame;

    protected int maxn;
    protected int randomNumber1;
    protected int randomNumber2;

    protected TopText topText;

    private PlusImage plusImage;

    private RabbitImage image1, image2;
    private ButtomText buttomText;

    /**
     * Constructs a MainFrame object with the specified maximum number.
     *
     * @param num The maximum number.
     */
    public MainFrame(int num) {
        mainFrame = new JFrame("Welcome to Sum it up!");
        this.maxn = num;
        randomNumber1 = (int) (Math.random() * this.maxn + 1);
        randomNumber2 = (int) (Math.random() * this.maxn + 1);
    }

    /**
     * Initializes the components of the main frame.
     */
    public void init() {
        this.topText = new TopText();
        this.image1 = new RabbitImage();
        this.image2 = new RabbitImage();
        this.plusImage = new PlusImage("ExtraCredit//img//plus.png");
        this.buttomText = new ButtomText();
    }

    /**
     * Adds the components to the main frame.
     */
    public void addComponent() {
        this.mainFrame.add(topText.topTextWord, BorderLayout.NORTH);
        this.mainFrame.add(image1.image, BorderLayout.WEST);
        this.mainFrame.add(image2.image, BorderLayout.EAST);
        this.mainFrame.add(plusImage.panel, BorderLayout.CENTER);
        this.mainFrame.add(buttomText.jPanel, BorderLayout.SOUTH);
    }

    /**
     * Sets up the main frame.
     */
    public void setUp() {
        mainFrame.setBounds(400, 200, 800, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * Shows the main frame.
     */
    public void show() {
        mainFrame.setVisible(true);
    }

    /**
     * Adds rabbit images to the main frame.
     */
    public void addRabbitImage() {
        for (int i = 1; i <= randomNumber1; i++) {
            this.image1.addImages("ExtraCredit//img//rabbit.jpg");
        }

        for (int i = 1; i <= randomNumber2; i++) {
            this.image2.addImages("ExtraCredit//img//rabbit.jpg");
        }
    }

    /**
     * Adds bottom text and its functionality to the main frame.
     */
    public void addButtomText() {
        ButtomText buttomText = new ButtomText();
        mainFrame.add(buttomText.jPanel, BorderLayout.SOUTH);
        buttomText.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField a = (JTextField) buttomText.jPanel.getComponent(0);
                String stringa = a.getText();
                JTextField b = (JTextField) buttomText.jPanel.getComponent(2);
                String stringb = b.getText();
                JTextField c = (JTextField) buttomText.jPanel.getComponent(4);
                String stringc = c.getText();
                if (stringa.equals("") || stringb.equals("") || stringc.equals(""))
                    return;
                int numa = Integer.parseInt(stringa);
                int numb = Integer.parseInt(stringb);
                int numc = Integer.parseInt(stringc);
                if (numa == randomNumber1 && numb == randomNumber2 && numc == randomNumber1 + randomNumber2) {
                    topText.word.setText("Correct! Have another go?");
                    image1.image.removeAll();
                    image1.image.revalidate();
                    image1.image.repaint();
                    image2.image.removeAll();
                    image2.image.revalidate();
                    image2.image.repaint();
                    randomNumber1 = (int) (Math.random() * 10 + 1);
                    randomNumber2 = (int) (Math.random() * 10 + 1);
                    addRabbitImage();
                    image1.image.revalidate();
                    image1.image.repaint();
                    image2.image.revalidate();
                    image2.image.repaint();
                    mainFrame.repaint();
                    a.setText("");
                    b.setText("");
                    c.setText("");
                } else {
                    topText.word.setText("Wrong! Try again!");
                }
            }
        });
    }
}
