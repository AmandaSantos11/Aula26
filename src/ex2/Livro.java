package ex2;
public class Livro {
    public String genero;
    public String nomeDoLivro;
    public int isbn;
    public String autor;
    public void registrarLivro (int isbn){
        System.out.println("O livro foi registrado com o isbn: "+isbn);
    }
    public void registrarLivro (int isbn, String nomeDoLivro){
        System.out.println("O livro foi registrado com o isbn: "+isbn+" e o nome: "+nomeDoLivro);
    }
    public void registrarLivro (int isbn, String nomeDoLivro, String genero){
        System.out.println("O livro foi registrado com o isbn: "+isbn+", o nome: "+nomeDoLivro+", e o gênero: "+genero);
    }
    public void registrarLivro (int isbn, String nomeDoLivro, String genero, String autor){
        System.out.println("O livro foi registrado com todos os atributos");
    }
}