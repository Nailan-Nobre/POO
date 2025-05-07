package Atividades;

public class ExercicioE {
    public static void main(String[] args) {
        long fatorial = 1;
        long i = 1;

        while (i <= 20) {
            fatorial *= i;
            System.out.println("fatorial de " + i + " = " + fatorial);
            i++;
        }
    }
}