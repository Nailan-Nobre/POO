package Atividades;

public class ExercicioD {
    public static void main(String[] args) {
        int fatorial = 1;
        int i = 1;

        while (i <= 20) {
            fatorial *= i;
            System.out.println("fatorial de " + i + " = " + fatorial);
            i++;
        }
    }
}
