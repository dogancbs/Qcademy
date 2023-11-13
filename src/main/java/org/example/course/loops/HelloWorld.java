package org.example.course.loops;

public class HelloWorld {

    public static int summe(int n) {
        int sum = 0;

        for (int i=1; i <= n; i++) {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = summe(6);
        int result2 = summe(17);
        int result3 = summe(39);

        System.out.println("Summe von 1 bis 6: " + result1);
        System.out.println("Summe von 1 bis 17: " + result2);
        System.out.println("Summe von 1 bis 39: " + result3);
    }


}
