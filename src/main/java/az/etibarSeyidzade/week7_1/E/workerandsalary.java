package az.etibarSeyidzade.week7_1.E;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class workerandsalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Worker> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Worker(sc.next(), sc.nextInt()));
        }

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String a = sc.next();
            boolean flag = false;
            for (Worker elem : list) {
                if (elem.getName().equals(a)) {
                    System.out.println(elem.getSalary());
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }
    }
}

class Worker {

    private String name;
    private int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}