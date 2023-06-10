package az.etibarSeyidzade.exam.GUI;

import javax.swing.JFrame;
import javax.swing.JList;

public class List {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JList Example");
        frame.setSize(300, 200);

        Integer[] data = {1, 2, 3, 4};
        JList<Integer> jList = new JList<>(data);
        jList.setBounds(50, 100, 200, 90);

        frame.add(jList);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
