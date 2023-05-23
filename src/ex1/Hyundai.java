package ex1;
public class Hyundai extends Carro{
    public Hyundai(String marca, String cor, int ano, int portas, double valor, double velocidade){
        super ("Hyundai",cor, ano,portas,valor,5);
    }
    @Override
    public void partidaNoMotor() {
        System.out.println("Iniciando o motor.... minha velocidade está em "+velocidade+(" km/h"));
    }
    @Override
    public void freiar(){
        if (velocidade <= 2){
            System.out.println("O carro está parado");
        }
        else {
            velocidade = velocidade - 2;
            System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
        }
    }
    @Override
    public void acelerar(){
        velocidade = velocidade + 15;
        System.out.println("Acelerando... minha velocidade está em "+velocidade+" km/h");
    }
}