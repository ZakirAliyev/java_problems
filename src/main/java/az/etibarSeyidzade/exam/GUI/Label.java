package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;

public class Label {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame");
        frame.setSize(400, 400);

        JLabel label = new JLabel("TA1");
        label.setBounds(50, 100, 200, 100);
        frame.add(label);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
