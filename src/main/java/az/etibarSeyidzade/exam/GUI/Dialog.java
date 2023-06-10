package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dialog {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400, 400);

        JDialog dialog = new JDialog(frame, "Dialog Example", true);
        dialog.setLayout(null);
        JButton b = new JButton("OK");
        dialog.add(new JLabel("Click button to continue."));
        dialog.add(b);
        frame.add(dialog);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}