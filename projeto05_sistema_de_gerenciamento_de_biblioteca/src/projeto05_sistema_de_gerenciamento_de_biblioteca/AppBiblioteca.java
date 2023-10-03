package projeto05_sistema_de_gerenciamento_de_biblioteca;

import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("_____________Menu_____________");
            System.out.println("|                            |");
            System.out.println("|     1. Adicionar livro     |");
            System.out.println("|     2. Editar livro        |");
            System.out.println("|     3. Excluir livro       |");
            System.out.println("|     4. Adicionar usuário   |");
            System.out.println("|     5. Editar usuário      |");
            System.out.println("|     6. Excluir usuário     |");
            System.out.println("|     7. Emprestar livro     |");
            System.out.println("|     8. Devolver livro      |");
            System.out.println("|     9. Gerar relatório     |");
            System.out.println("|     10. Sair               |");
            System.out.println("|____________________________|");

            System.out.print("Informe o que deseja (de acordo com o número, de 1 a 10): ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;
                case '9':
                    break;
                default: 
                    System.out.print("Opção inválida. Tente novamente.");
                    break;
                
            }
            scan.close();
        }
        

        

    }
}
