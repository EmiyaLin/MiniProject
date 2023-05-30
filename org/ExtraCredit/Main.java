package org.ExtraCredit;

/**
 * The main class to run the program.
 */
public class Main {
    public static void main(String[] args) {
        int numT = 25;

        // Check command line argument and validate the range
        try {
            numT = Integer.parseInt(args[0]);
            if (numT < 10 || numT > 25) {
                throw new Exception("out of range!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: no command line argument is given");
        } catch (Exception e) {
            System.out.println("Error: the number is out of the valid range");
        }

        // Create a MainFrame object
        MainFrame mainFrame = new MainFrame(numT);

        // Set up the frame
        mainFrame.setUp();
        mainFrame.init();
        mainFrame.addComponent();
        mainFrame.addRabbitImage(); // Add rabbit image at position 1 and 2
        mainFrame.addButtomText(); // Add bottom text at the south position
        mainFrame.show();
    }
}
