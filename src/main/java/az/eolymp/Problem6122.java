package az.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem6122 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        label:
        while (true) {

            String a = sc.next();

            switch (a) {
                case "push":
                    int n = sc.nextInt();
                    list.add(n);
                    System.out.println("ok");
                    break;
                case "pop":
                    System.out.println(list.get(list.size() - 1));
                    list.remove(list.size() - 1);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "back":
                    System.out.println(list.get(list.size() - 1));
                    break;
                case "clear":
                    list.clear();
                    System.out.println("ok");
                    break;
                case "exit":
                    System.out.println("bye");
                    break label;
            }
        }
    }
}
