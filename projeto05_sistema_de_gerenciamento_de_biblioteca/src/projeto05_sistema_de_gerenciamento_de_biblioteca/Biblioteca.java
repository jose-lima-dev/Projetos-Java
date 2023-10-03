package projeto05_sistema_de_gerenciamento_de_biblioteca;

// Imports

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Atributos

    private List<Livro> livros;
    private List<Usuario> usuarios;

    // Construtor

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    // Métodos

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void editarLivro(Livro livroParaEditar, Livro livroEditado) {
        int index = livros.indexOf(livroParaEditar);
        if (index != -1) {
            livros.set(index, livroEditado);
            System.out.print("Livro editado com sucesso!");
        }
        else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }
    
    public void excluirLivro(Livro livro) {
        if (livros.contains(livro)) {
            livros.remove(livro);
            System.out.print("Livro removido com sucesso!");
        }
        else {
            System.out.print("Livro não encontrado na bibiloteca.");
        }
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void editarUsuario(Usuario usuarioParaEditar, Usuario usuarioEditado) {
        int index = usuarios.indexOf(usuarioParaEditar);
        if (index != -1) {
            usuarios.set(index, usuarioEditado);
            System.out.print("Usuario editado com sucesso!");
        }
        else {
            System.out.println("Usuario não encontrado na biblioteca.");
        }
    }

    public void excluirUsuario(Usuario usuario) {
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
            System.out.print("Usuario removido com sucesso!");
        }
        else {
            System.out.print("Usuario não encontrado na bibiloteca.");
        }
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livros.contains(livro)) {

            livros.remove(livro);
            usuarios.add(usuario);

            System.out.print("Livro emprestado com sucesso para " + usuario.getNome());
        }
        else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    public void devolverLivro(Usuario usuario, Livro livro) {
            livros.add(livro);
            usuarios.remove(usuario);

            System.out.print("Livro devolvido com sucesso por " + usuario.getNome());
    }

    public void gerarRelatorio(String relario) {
        try {

            String relatorio = "C:\\Users\\José Soares\\Downloads\\relatorio.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(relatorio));

            writer.write("Relaório de livros emprestados:");
            writer.newLine();

            for (Usuario usuario : usuarios) {
                for (Emprestimo livro : usuario.getHistoricoEmprestimos()) {
                    writer.write("Usuário...............: " + usuario.getNome());
                    writer.newLine();
                    writer.write("Livro.................: " + livro.getLivro());
                    writer.newLine();
                    writer.write("Data de empréstimo....: " + livro.getDataEmprestimo());
                    writer.newLine();
                    writer.write("Data de devolução.....: " + livro.getDataDevolucao()); 
                    writer.newLine();
                    writer.write("-------------------------------------");   
                    writer.newLine();
                }
            }

            writer.close();
            System.out.print("Relatório exportado para: " + relatorio + " com sucesso!");
        
        } catch (IOException e) {
            System.err.print("Erro ao exportar o relatório: " + e.getMessage());
        }
    }
}

