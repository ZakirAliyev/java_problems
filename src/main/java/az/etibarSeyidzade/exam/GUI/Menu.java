package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;

public class Menu {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame");
        frame.setSize(400, 400);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("Menu");

        String[] a = {"File", "About"};

        for (String elem : a) {
            menu.add(new JMenuItem(elem));
        }

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}