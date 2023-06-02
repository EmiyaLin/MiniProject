package org.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The main frame of the application.
 */
public class MainFrame {
    protected JFrame mainFrame;
    protected int randomNumber1 = (int) (Math.random() * 10 + 1);
    protected int randomNumber2 = (int) (Math.random() * 10 + 1);

    protected TopText topText;
    private PlusImage plusImage;
    private RabbitImage image1, image2;
    private ButtomText buttomText;

    /**
     * Constructs the MainFrame object.
     */
    public MainFrame() {
        mainFrame = new JFrame("Welcome to Sum it up!");
    }

    /**
     * Initializes the components of the frame.
     */
    public void init() {
        this.topText = new TopText();
        this.image1 = new RabbitImage();
        this.image2 = new RabbitImage();
        this.plusImage = new PlusImage("Task2//img//plus.png");
        this.buttomText = new ButtomText();
    }

    /**
     * Adds the components to the frame.
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
     * Adds rabbit images to the frame.
     */
    public void addRabbitImage() {
        for (int i = 1; i <= randomNumber1; i++) {
            this.image1.addImages("Task2//img//rabbit.jpg");
        }

        for (int i = 1; i <= randomNumber2; i++) {
            this.image2.addImages("Task2//img//rabbit.jpg");
        }
    }

    /**
     * Adds the bottom text component to the frame.
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
