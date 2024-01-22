package Calculator;

import java.security.Key;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);

    double broj1;
    double broj2;
    char operacija;
    double rezultat;




    public void Calculator (Scanner sc){

        System.out.println("Unesite neki karakter da zapocnete program!");
        while (true){

            if(rezultat == 0){
                System.out.println("Unesite broj: ");
                broj1 = sc.nextDouble();
            }
            System.out.println("Unesite operaciju: ");
            sc.nextLine();
            operacija = sc.nextLine().charAt(0);
            rezultat = 0;
            System.out.println("Unesite broj: ");
            broj2 = sc.nextDouble();
            switch (operacija) {
                case '+' -> rezultat = broj1 + broj2;
                case '-' -> rezultat = broj1 - broj2;
                case '*' -> rezultat = broj1 * broj2;
                case '/' -> rezultat = broj1 / broj2;
                default -> System.out.println("Nepoznata operacija");
            }
            System.out.println("Rezultat: " + rezultat);
            System.out.println("Unesite operaciju: ");
            sc.nextLine();
            operacija = sc.nextLine().charAt(0);
            System.out.println("Unesite broj: ");
            broj2 = sc.nextDouble();
            switch (operacija) {
                case '+' -> rezultat +=  broj2;
                case '-' -> rezultat -=  broj2;
                case '*' -> rezultat *=  broj2;
                case '/' -> rezultat /=  broj2;
                default -> System.out.println("Nepoznata operacija");
            }
            System.out.println("Rezultat: " + rezultat);
        }
    }





}
