package org.ExtraCredit;

public class Main {
    public static void main(String[] args) {
        int numT = 25;
        try {
            numT = Integer.parseInt(args[0]);
            if (numT < 10 || numT > 25) {
                throw new Exception("out of range!");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        MainFrame mainFrame = new MainFrame(numT);
        // System.out.println(mainFrame.maxn);
        // System.out.println(mainFrame.randomNumber1);
        // System.out.println(mainFrame.randomNumber2);
        mainFrame.setUp();
        mainFrame.init();
        mainFrame.addComponent();
        mainFrame.addRabbitImage(); // 1, 2
        mainFrame.addButtomText(); // 4 south
        mainFrame.show();
    }
}
