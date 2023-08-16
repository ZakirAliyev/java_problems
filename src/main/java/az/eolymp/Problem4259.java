package az.eolymp;

import java.util.Stack;

//public class Problem4259 {

//    public static void main(String[] args) {
//
//        Stack<Integer> stack = new Stack<>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        while (n-- != 0) {
//
//            int m = sc.nextInt();
//            if (m == 1) {
//                int k = sc.nextInt();
//                stack.push(k);
//            } else if (m == 2) {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                }
//            } else if (m == 3) {
//                if (!stack.isEmpty()) {
//                    int min = Integer.MAX_VALUE;
//                    for (int value : stack) {
//                        if (value < min) {
//                            min = value;
//                        }
//                    }
//                    System.out.println(min);
//                }
//            }
//        }
//    }

import java.util.Scanner;
public class Problem4259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StackImplementation stack = new StackImplementation();

        int n = scanner.nextInt();
        while (n-- > 0) {
            int op = scanner.nextInt();
            if (op == 1) {
                int x = scanner.nextInt();
                stack.push(x);
            } else if (op == 2) {
                stack.pop();
            } else {
                System.out.println(stack.getMin());
            }
        }

        scanner.close();
    }
}

class StackImplementation {
    private int[] m;
    private int size;

    public StackImplementation() {
        int maxSize = 1000001;
        m = new int[maxSize];
        size = 0;
    }

    public void push(int x) {
        if (size == 0) {
            m[size++] = x;
        } else {
            int pos = size - 1;
            m[size++] = Math.min(x, m[pos]);
        }
    }

    public void pop() {
        size--;
    }

    public int getMin() {
        return m[size - 1];
    }
}
