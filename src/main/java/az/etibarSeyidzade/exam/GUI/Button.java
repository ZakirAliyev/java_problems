package az.etibarSeyidzade.exam.GUI;

import javax.swing.*;

public class Button {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(700, 700);

        JButton button = new JButton("Button");
        JButton button1 = new JButton();
        JButton button2 = new JButton(new ImageIcon("C:\\Users\\aliye\\" +
                "IdeaProjects\\java_problems\\src\\main\\java\\az\\etibarSeyidzade\\ex" +
                "am\\mobile-computer.png"));

        button.setBounds(50, 10, 95, 30);
        button1.setBounds(50, 120, 95, 30);
        button2.setBounds(50, 110, 512, 512);

        frame.add(button);
        frame.add(button1);
        frame.add(button2);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}