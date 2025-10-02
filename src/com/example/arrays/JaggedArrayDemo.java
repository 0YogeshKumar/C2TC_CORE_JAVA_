package com.example.arrays;

public class JaggedArrayDemo {
    static void display(int d[] []){
        System.out.println("Array elements are: ");
        for(int i=0; i<d.length; i++){
            for(int j=0; j<d[i].length; j++){
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int d[] []= { {1,2,3}, {40}, {12,21}, {11} };

        System.out.println(d.length);
        display(d);
    }
    
}
