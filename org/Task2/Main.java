package org.Task2;

/**
 * The main class to run the application.
 */
public class Main {
    /**
     * The main method that starts the application.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setUp();
        mainFrame.init();
        mainFrame.addComponent();
        mainFrame.addRabbitImage();
        mainFrame.addButtomText();
        mainFrame.show();
    }
}
