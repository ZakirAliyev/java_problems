package az.etibarSeyidzade.week7_1.C;

abstract class Arr {
    int a[];
    int n;

    abstract int Sum();

    abstract double Average();
}

class Array extends Arr {
    Array(int n) {
        this.n = n;
        a = new int[n];
    }

    int Sum() {
        int sum = 0;
        for (int elem : a) {
            sum += elem;
        }
        return sum;
    }

    double Average() {
        double s = Sum();
        return s / n;
    }
}


