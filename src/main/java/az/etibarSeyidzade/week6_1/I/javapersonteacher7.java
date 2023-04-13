package az.etibarSeyidzade.week6_1.I;

import java.util.ArrayList;

class Person {
    protected String Surname, Name;
    protected int Age;

    Person(String Surname, String Name, int Age) {
        this.Surname = Surname;
        this.Name = Name;
        this.Age = Age;
    }

    public String toString() {
        return Surname + " " + Name + " " + Age;
    }
}

class Teacher extends Person {
    protected String Subject;
    protected int Salary;

    Teacher(String Surname, String Name, int Age, String Subject, int Salary) {
        super(Surname, Name, Age);
        this.Subject = Subject;
        this.Salary = Salary;
    }

    Teacher(Teacher a) {
        super(a.Surname, a.Name, a.Age);
        this.Subject = a.Subject;
        this.Salary = a.Salary;
    }

    public String toString() {
        return super.toString() + " " + Subject + " " + Salary;
    }
}

class ListOfPeople {
    ArrayList<Person> a = new ArrayList<Person>();

    public void add(Person p) {
        a.add(p);
    }

    public int size() {
        return a.size();
    }

    public String toString() {
        String result = "";
        for (Person elem : a) {
            result += elem.toString() + "\n";
        }
        return result;
    }

    public Teacher getTeacherWithMaxSalary() {
        Teacher teacher = null;
        int max = Integer.MIN_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Salary > max) {
                max = ((Teacher) elem).Salary;
                teacher = (Teacher) elem;
            }
        }
        return teacher;
    }

    public Teacher getTeacherWithMaxSalary(String Subject) {
        Teacher teacher = null;
        int max = Integer.MIN_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject) && ((Teacher) elem).Salary > max) {
                max = ((Teacher) elem).Salary;
                teacher = (Teacher) elem;
            }
        }
        return teacher;
    }

    public Teacher getTeacherWithMinSalary() {
        Teacher teacher = null;
        int min = Integer.MAX_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Salary < min) {
                min = ((Teacher) elem).Salary;
                teacher = (Teacher) elem;
            }
        }
        return teacher;
    }

    public Teacher getTeacherWithMinSalary(String Subject) {
        Teacher teacher = null;
        int min = Integer.MAX_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject) && ((Teacher) elem).Salary < min) {
                min = ((Teacher) elem).Salary;
                teacher = (Teacher) elem;
            }
        }
        return teacher;
    }
}