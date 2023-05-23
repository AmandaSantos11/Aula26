package ex1;
public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault("", "preto",2020,4, 30.000,0);
        Fiat fiat = new Fiat("", "azul",2014,4, 50.000,0);
        Hyundai hyundai = new Hyundai("", "branco",2016,4, 100.000,0);

        renault.partidaNoMotor();
        renault.freiar();
        renault.acelerar();
    }
}