package Carro;

public class MainCarro {
    public static void main (String[] args) {
        Motor motor = new Motor();
        motor.setTipo(1.6);
        Carro carro = new Carro();
        carro.setModelo("fusca");
        carro.setMotor(motor);

        carro.mostrarDetalhes ();
    }

}
