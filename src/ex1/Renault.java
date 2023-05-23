package ex1;
public class Renault extends Carro{
    public Renault(String marca, String cor, int ano, int portas, double valor, double velocidade){
        super ("Renault",cor, ano,portas,valor,0);
    }
    @Override
    public void partidaNoMotor() {
        System.out.println("Iniciando o motor.... minha velocidade está em "+velocidade+(" km/h"));
    }
    @Override
    public void freiar(){
        if (velocidade <= 5){
            System.out.println("O carro está parado");
        }
        else {
            velocidade = velocidade - 5;
            System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
        }
    }
    @Override
    public void acelerar(){
        velocidade = velocidade + 10;
        System.out.println("Acelerando... minha velocidade está em "+velocidade+" km/h");
    }
}