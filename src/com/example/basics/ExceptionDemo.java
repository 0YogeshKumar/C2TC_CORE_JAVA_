package com.example.basics;

import java.util.Collection;
import java.util.ArrayList;

public class ExceptionDemo {

    public static void main(String[] args) {
        int d = 5;
        int a[] = new int[d];
        System.out.println("Value of d is " + d);

        try {
            int x = 42 / d;   // may throw ArithmeticException
            a[4] = 30;        // may throw ArrayIndexOutOfBoundsException

            // ✅ Proper Collection usage
            Collection<String> names = new ArrayList<>();
            names.add("Hello");
            names.add("World");
            System.out.println("Collection content: " + names);
        }
        catch (ArithmeticException e) {
            System.out.println("Cant divide a number by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cant assign a value");
        }
        finally {
            System.out.println("I am in a finally block");
        }

        System.out.println("outside catch block");
    }
}
