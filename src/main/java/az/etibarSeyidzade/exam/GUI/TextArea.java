package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;
import java.awt.*;

public class TextArea {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame");
        frame.setSize(400, 400);

        JTextArea textArea = new JTextArea("TA1");
        textArea.setBounds(50, 100, 200, 100);
        frame.add(textArea);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
