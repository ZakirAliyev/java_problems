package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;

public class Choice {
    public static void main(String[] args) {

        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(400, 500);

        Integer[] number = {1, 2, 3, 4};
        JComboBox<Integer> combobox = new JComboBox<>(number);
        combobox.setBounds(50, 50, 90, 20);

        frame.add(combobox);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}