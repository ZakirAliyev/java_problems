package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;

public class TextField {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame");
        frame.setSize(400, 400);

        JTextField textField = new JTextField("TF1");
        textField.setBounds(50, 100, 200, 30);
        frame.add(textField);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
