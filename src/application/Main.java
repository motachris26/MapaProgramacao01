package application;

import entities.*;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Main {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menuPrincipal() {

        System.out.println("Andrey Gheno Piekas");
        System.out.println("RA:  21095958-5");

    }

    public static void menuIngresso() {

        System.out.println(" ##########################\n");
        System.out.println("       Menu INGRESSO \n");
        System.out.println("     Opções Disponiveis: \n");
        System.out.println(" 1 - Cadastrar Ingresso");
        System.out.println("");
        System.out.println("");
        
    }

    public static void menuPessoa() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println("mapa");
        //JOptionPane.showMessageDialog(null, "mapa");
        menuPrincipal();
        int opcao;

        Scanner scan = new Scanner(System.in);
        Ingressos ingressos = new Ingressos();

        System.out.println("Selecione a Opção");
        System.out.println(" 1 - Ingressos \n");
        System.out.println(" 2 - Pessoa \n");
        System.out.println("");
        System.out.println("");
        System.out.println(" 0 - Sair\n#>");

       // System.out.println("#> ");
        opcao = scan.nextInt();

        do {

            switch (opcao) {
                case 1:
                    menuIngresso();
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 0:
                    System.out.println("Aplicação Finalizada");
                    System.exit(0);
                default:
                    System.out.println("Nenhuma opção selecionada, selecione uma opção entre e !");
                //menuPrincipal();
            }
            System.in.read();
            clearScreen();
        } while (opcao != 0);

        scan.close();
    }

}
