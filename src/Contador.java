import classes.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int numeroUm = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int numeroDois = scanner.nextInt();
        System.out.println(" ");

        try {

            contar(numeroUm, numeroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println(e.getMessage());

        }
        scanner.close();
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if (numeroUm > numeroDois) {
            String mensagem = "O segundo parâmetro deve ser maior que o primeiro";
            throw new ParametrosInvalidosException(mensagem);
        } else {
            int contador = numeroDois - numeroUm;
            for (int i = 0; i <= contador; i++) {
                System.out.println("Imprimindo número " + i);
            }
        }
    }

}



