package projeto05_sistema_de_gerenciamento_de_biblioteca;

import java.util.List;

public class Usuario {

    // Atributos
     
    private String nome;
    private List<Emprestimo> historicoEmprestimos;

    // Construtor
    
    public Usuario(String nome, List<Emprestimo> historicoEmprestimos) {
        this.nome = nome;
        this.historicoEmprestimos = historicoEmprestimos;
    }

    // Setter e Getters

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Emprestimo> getHistoricoEmprestimos(){
        return historicoEmprestimos;
    }

    public void setHistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
        this.historicoEmprestimos = historicoEmprestimos;
    }

}