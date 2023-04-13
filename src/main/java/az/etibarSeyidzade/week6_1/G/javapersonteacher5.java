package az.etibarSeyidzade.week6_1.G;

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

    Teacher(String Surname, String Name, int Age) {
        super(Surname, Name, Age);
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
        String person = "";
        for (Person elem : a) {
            person += elem.toString() + "\n";
        }
        return person;
    }

    public Teacher getOldestTeacher() {
        Teacher old = null;
        int max = Integer.MIN_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher) {
                if ((int) elem.Age > max) {
                    max = elem.Age;
                    old = (Teacher) elem;
                }
            }
        }
        return old;
    }

    public Teacher getOldestTeacher(String Subject) {
        Teacher old = null;
        int max = Integer.MIN_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject) && (int) elem.Age > max) {
                max = elem.Age;
                old = (Teacher) elem;
            }
        }
        return old;
    }

    public Teacher getYoungestTeacher() {
        Teacher young = null;
        int min = Integer.MAX_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher) {
                if ((int) elem.Age < min) {
                    min = elem.Age;
                    young = (Teacher) elem;
                }
            }
        }
        return young;
    }

    public Teacher getYoungestTeacher(String Subject) {
        Teacher young = null;
        int min = Integer.MAX_VALUE;
        for (Person elem : a) {
            if (elem instanceof Teacher && ((Teacher) elem).Subject.equals(Subject) && (int) elem.Age < min) {
                min = elem.Age;
                young = (Teacher) elem;
            }
        }
        return young;
    }
}
