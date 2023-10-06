package projeto05_sistema_de_gerenciamento_de_biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int isbn;
    private int copiasDisponiveis;
    
    public Livro(String titulo, String autor, int isbn, int copiasDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.copiasDisponiveis = copiasDisponiveis;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public int getCopiasDisponiveis() {
        return copiasDisponiveis;
    }
    public void setCopiasDisponiveis(int copiasDisponiveis) {
        this.copiasDisponiveis = copiasDisponiveis;
    }
    

}