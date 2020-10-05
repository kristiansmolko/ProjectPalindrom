package sk.kosickaakademia.kristian.math.aritmeria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Zadaj cislo: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int m2 = m;
        int y = 0;

        while (m2 != 0){
            y -= -(m2%10);
            y *= 10;
            m2 /= 10;
        }
        y /= 10;

        if (m==y)
            System.out.println("Cislo je palindrom");
        else
            System.out.println("Cislo nie je palindrom");





    }
}
