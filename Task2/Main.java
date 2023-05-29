package org.Task2;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setUp();
        mainFrame.init();
        mainFrame.addComponent();
//        mainFrame.addPlusImage(); // 3 center
//        mainFrame.addTopText(); // 0 north
        mainFrame.addRabbitImage(); // 1, 2
        mainFrame.addButtomText(); // 4 south
        mainFrame.show();
    }
}
