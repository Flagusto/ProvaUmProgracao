//autor: Flávio Augusto 
//link do github: https://github.com/Flagusto 

import java.util.Scanner;

public class ProvaProgramação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano : ");
        double ano = scanner.nextDouble();

        boolean bissexto = false;
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                }
            } else {
                bissexto = true;
            }
        }

        if (bissexto) {
            System.out.println("Ano BISSEXTO");
        } else {
            System.out.println("Não é Bissexto");
        }

        scanner.close();
    }
}
