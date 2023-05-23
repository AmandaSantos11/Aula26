package ex1;
public class Fiat extends Carro{
    public Fiat(String marca, String cor, int ano, int portas, double valor, double velocidade){
        super ("Fiat",cor, ano,portas,valor,3);
    }
    @Override
    public void partidaNoMotor() {
        System.out.println("Iniciando o motor.... minha velocidade está em "+velocidade+(" km/h"));
    }
    @Override
    public void freiar(){
        if (velocidade <= 6){
            System.out.println("O carro está parado");
        }
        else {
            velocidade = velocidade - 6;
            System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
        }
    }
    @Override
    public void acelerar(){
        velocidade = velocidade + 12;
        System.out.println("Acelerando... minha velocidade está em "+velocidade+" km/h");
    }
}