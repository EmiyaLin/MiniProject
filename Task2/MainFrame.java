package org.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    protected JFrame mainFrame;
    protected int randomNumber1 = (int)(Math.random() * 10 + 1);
    protected int randomNumber2 = (int)(Math.random() * 10 + 1);

//    private JPanel panel_center = new JPanel(new GridLayout(1, 1, 0, 0));

    protected TopText topText;

    private PlusImage plusImage;

    private RabbitImage image1, image2;
    private ButtomText buttomText;

    public MainFrame() {
        mainFrame = new JFrame("Welcome to Sum it up!");
    }

    public void init() {
        this.topText = new TopText();
        this.image1 = new RabbitImage();
        this.image2 = new RabbitImage();
        this.plusImage = new PlusImage("Task1//img//plus.png");
        this.buttomText = new ButtomText();
    }

    public void addComponent() {
        this.mainFrame.add(topText.topTextWord, BorderLayout.NORTH);
        this.mainFrame.add(image1.image, BorderLayout.WEST);
        this.mainFrame.add(image2.image, BorderLayout.EAST);
        this.mainFrame.add(plusImage.panel, BorderLayout.CENTER);
        this.mainFrame.add(buttomText.jPanel, BorderLayout.SOUTH);
    }
    public void setUp() {
        mainFrame.setBounds(400, 200, 800, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        mainFrame.pack();
    }

    public void show() {
        mainFrame.setVisible(true);
    }
    public void addRabbitImage() {

        for (int i = 1; i <= randomNumber1; i ++) {
            this.image1.addImages("Task1//img//rabbit.jpg");
        }
//        mainFrame.add(this.image1.image, BorderLayout.WEST);

        for (int i = 1; i <= randomNumber2; i ++) {
            this.image2.addImages("Task1//img//rabbit.jpg");
        }
//        mainFrame.add(this.image2.image, BorderLayout.EAST);
    }

//    public void addPlusImage() {
//        this.plusImage = new PlusImage("C:\\Users\\Zhao\\Desktop\\MiniProject\\src\\main\\java\\org\\Task1\\plus.png");
////        plus.addImages("C:\\Users\\Zhao\\Desktop\\MiniProject\\src\\main\\java\\org\\Task1\\plus.png");
////        this.plusImage.image.setLayout(new GridLayout(0,0));
////        mainFrame.add(plusImage.image, BorderLayout.CENTER);
////        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Zhao\\Desktop\\MiniProject\\src\\main\\java\\org\\Task1\\plus.png");
////        JLabel jLabel = new JLabel();
////        jLabel.setIcon(imageIcon);
////        panel_center.add(jLabel);
////        mainFrame.add(panel_center, BorderLayout.CENTER);
//
//    }

//    public void addTopText() {
//        this.topText = new TopText();
////        mainFrame.add(this.topText.topTextWord, BorderLayout.NORTH);
//    }

    public void addTopText(String string) {
        this.topText = new TopText(string);
//        mainFrame.add(this.topText.topTextWord, BorderLayout.NORTH);
    }

    public void addButtomText() {
        ButtomText buttomText = new ButtomText();
        mainFrame.add(buttomText.jPanel, BorderLayout.SOUTH);
        buttomText.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField a = (JTextField)buttomText.jPanel.getComponent(0);
                String stringa = a.getText();
                JTextField b = (JTextField)buttomText.jPanel.getComponent(2);
                String stringb = b.getText();
                JTextField c = (JTextField)buttomText.jPanel.getComponent(4);
                String stringc = c.getText();
                if (stringa.equals("") || stringb.equals("") || stringc.equals(""))
                    return;
                int numa = Integer.parseInt(stringa);
                int numb = Integer.parseInt(stringb);
                int numc = Integer.parseInt(stringc);
                if (numa == randomNumber1 && numb == randomNumber2 && numc == randomNumber1 + randomNumber2) {
                    // System.out.println("true");
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
                }
                else {
                    topText.word.setText("Wrong! Try again!");
                }
            }
        });
    }
}
