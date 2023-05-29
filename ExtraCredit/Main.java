package org.ExtraCredit;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        try {
            mainFrame.maxn = Integer.parseInt(args[0]);
//            if (setNum < 10 || setNum > 25)
//                throw Exception;
        } catch (Exception e) {
            System.out.println("You don't insert");
        }
        mainFrame.setUp();
        mainFrame.init();
        mainFrame.addComponent();
        mainFrame.addRabbitImage(); // 1, 2
        mainFrame.addButtomText(); // 4 south
        mainFrame.show();
    }
}
