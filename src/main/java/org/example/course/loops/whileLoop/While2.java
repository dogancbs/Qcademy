package org.example.course.loops.whileLoop;

public class While2 {
    public static int ggt(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return Math.abs(n);
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 48;
        int result = ggt(num1, num2);
        System.out.println("Der größte gemeinsame Teiler von " + num1 + " und " + num2 + " ist " + result);
    }
}
