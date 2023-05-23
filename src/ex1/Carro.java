package ex1;
public class Carro {
    public String marca, cor;
    public int ano, portas;
    public double valor, velocidade;

    public Carro(String marca, String cor, int ano, int portas, double valor, double velocidade){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.portas = portas;
        this.valor = valor;
        this.velocidade = velocidade;
    }

    public void partidaNoMotor(){
    }
    public void freiar(){
    }
    public void acelerar(){
    }
}
