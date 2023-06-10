package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;

public class CheckBox {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame");
        frame.setSize(400, 400);

        JCheckBox checkbox = new JCheckBox("CB1");
        checkbox.setBounds(50, 100, 200, 30);
        frame.add(checkbox);

        JCheckBox checkbox1 = new JCheckBox("CB2");
        checkbox1.setBounds(50, 150, 200, 30);
        frame.add(checkbox1);

        JCheckBox checkbox2 = new JCheckBox("CB3");
        checkbox2.setBounds(50, 200, 200, 30);
        frame.add(checkbox2);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
