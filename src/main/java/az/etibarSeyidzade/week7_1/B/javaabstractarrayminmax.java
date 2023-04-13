package az.etibarSeyidzade.week7_1.B;

abstract class Arr {
    int[] a;
    int n;

    abstract int Min();

    abstract int Max();
}

class Array extends Arr {
    Array(int n) {
        this.n = n;
        a = new int[n];
    }

    int Min() {
        int min = a[0];
        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    int Max() {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}

