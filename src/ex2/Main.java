package ex2;
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        Livro livro4 = new Livro();

        livro1.registrarLivro(505);
        livro2.registrarLivro(506, "Crepúsculo");
        livro3.registrarLivro(507, "A culpa é das estrelas", "Romance");
        livro4.registrarLivro(508, "It - A coisa", "Terror", "Stephen King");
    }
}