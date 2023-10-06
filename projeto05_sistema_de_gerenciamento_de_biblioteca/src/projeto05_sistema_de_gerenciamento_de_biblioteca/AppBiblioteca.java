package projeto05_sistema_de_gerenciamento_de_biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean continuar = true;

        List<Livro> livros = new ArrayList<>();

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

            System.out.print("\nInforme o que deseja (de acordo com o número, de 1 a 10): ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nAdicionar livro");
                    
                    System.out.print("\nTítulo: ");
                    String titulo = scan.nextLine();
                    scan.nextLine();
                    System.out.print("Autor: ");
                    String autor = scan.nextLine();
                    System.out.print("ISBN: ");
                    int isbn = scan.nextInt();
                    System.out.print("Número de cópias disponíveis: ");
                    int copiasDisponiveis = scan.nextInt();

                    Livro novoLivro = new Livro(titulo, autor, isbn, copiasDisponiveis);
                    livros.add(novoLivro);

                    System.out.print("\nLivro adicionado com sucesso!\n");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    continuar = false;
                    System.out.println("\nFim da aplicação. Agradeço pelo uso!");
                    break;
                default: 
                    System.out.print("\nOpção inválida. Tente novamente.");
                    break;
                
            }
           
        }
        scan.close();
    }
        

        

}
