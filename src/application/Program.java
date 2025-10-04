package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Application;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Application barApp = new Application();

        System.out.print("Sexo: ");
        barApp.gender = scanner.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        int beers = scanner.nextInt();
        barApp.beer = beers;
        scanner.nextLine();
        System.out.print("Quantidade de refrigerantes: ");
        int softDrinks = scanner.nextInt();
        barApp.softDrink = softDrinks;
        scanner.nextLine();
        System.out.print("Quantidade de espetinhos: ");
        int barbecues = scanner.nextInt();
        barApp.barbecue = barbecues;
        scanner.nextLine();





        System.out.println("\nRELATÓRIO");
        System.out.printf("Consumo = R$ %.2f\n", barApp.feeding(barApp.beer, barApp.softDrink, barApp.barbecue));
        if(barApp.cover() == 0){
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f\n", barApp.cover());
        }
        System.out.printf("Ingresso = R$ %.2f\n", barApp.ticket());

        System.out.printf("\nValor a pagar = %.2f", barApp.total());



    }
}
