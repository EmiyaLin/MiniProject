/**
 * The Main class is for running SumItUp!
 *
 * @version 1.0
 * @author Xinran Zhao
 */
package org.Task1;

/**
 * The Main class builds the main frame and adds all components to it.
 */
public class Main {

    /**
     * The main entry point of the application.
     *
     * @param args The string arguments to pass to the main.
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
