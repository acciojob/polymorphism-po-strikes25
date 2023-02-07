package com.driver;

class Product {
    public int product(int x, int y) {
        return x * y;
    }
    public int product(int x, int y, int z) {
        return x * y * z;
    } 
    public double product(double x, double y) {
        return x * y;
    }
}

public class Main {
    public static void main(String ... args) {
        Product p = new Product();
        p.product(5, 6);
        p.product(5, 6, 7);
        p.product(5.0, 6.0);
      /* For printing the values of above 3 statements :
        System.out.println(p.product(5, 6));
        System.out.println(p.product(5, 6, 7));
        System.out.println(p.product(5.0, 6.0));
      */
    }
}
