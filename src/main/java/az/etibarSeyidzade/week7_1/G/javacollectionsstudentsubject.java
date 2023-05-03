package az.etibarSeyidzade.week7_1.G;

import java.util.*;

public class javacollectionsstudentsubject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- != 0) {
            list.add(new Student(sc.next(), sc.next()));
        }
        int t = sc.nextInt();
        while (t-- != 0) {

            List<String> students = new ArrayList<>();
            String a = sc.next();
            boolean flag = true;
            for (Student elem : list) {
                if (elem.getSubject().equals(a)) {
                    students.add(elem.getSurname());
                    flag = false;
                }
            }
            if (flag) {
                for (Student elem : list) {
                    if (elem.getSurname().equals(a)) {
                        students.add(elem.getSubject());
                    }
                }
            }
            Collections.sort(students);
            for (String elem : students) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}

class Student {

    private String subject;
    private String surname;

    public Student(String subject, String surname) {
        this.subject = subject;
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}