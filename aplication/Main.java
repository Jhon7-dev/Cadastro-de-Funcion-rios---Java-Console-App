package cadastroFuncionario_e_Gerente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args ){
        Scanner scn = new Scanner(System.in);
        char opcao;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
do {

        System.out.println("=== Empresa Sunset ===");
        System.out.println("1 - Assistente ");
        System.out.println("2 - Estagiário ");
        System.out.println("3 - Diretor ");
        System.out.println("4 - Gerente ");
        System.out.println("5 - Sair ");
        System.out.println("Escolha uma opcão:");
        opcao = scn.nextLine().charAt(0);

        switch (opcao){
            case '1':
                Assistente  assistente = new Assistente();


                assistente.imprimirDados();
                break;

            case '2':


        }

}
while(opcao!=5)
    }
}
