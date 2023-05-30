package org.Task2;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setUp();
        mainFrame.init();
        mainFrame.addComponent();
        mainFrame.addRabbitImage(); // 1, 2
        mainFrame.addButtomText(); // 4 south
        mainFrame.show();
    }
}
