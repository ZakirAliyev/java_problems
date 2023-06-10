package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;
import java.awt.*;

public class Panel {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame");
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.BLUE);

        JButton button = new JButton("Button");
        button.setBounds(10, 100, 10, 10);
        panel.add(button);


        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
