package az.etibarSeyidzade.week7_1.D;

interface Fly {
    void fly();
}

interface Eat {
    void eat();
}

interface Sleep {
    void eat();
}

class Bird implements Fly, Eat, Sleep {
    public void fly() {
        System.out.println("Bird flies");
    }

    public void eat() {
        System.out.println("Bird eats");
    }

    public void sleep() {
        System.out.println("Bird sleeps");
    }
}
