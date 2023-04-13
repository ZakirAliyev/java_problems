package az.etibarSeyidzade.week7_1.F;

import java.util.*;

public class workerandsalary2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Worker> list = new ArrayList<>();

        while (sc.hasNext()) {

            String a = sc.next();
            int b = sc.nextInt();
            for (Worker elem : list) {
                if (elem.getName().equals(a)) {
                    list.remove(elem);
                    break;
                }
            }

            list.add(new Worker(a, b));
        }

        list.sort(Comparator.comparing(Worker::getName));

        for (Worker elem : list) {
            System.out.println(elem.toString());
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

    @Override
    public String toString() {
        return name + " " + salary;
    }
}