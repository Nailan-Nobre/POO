package Atividades;

public class ExercicioB {
    public static void main(String[] args){
        int a = 1;
        int b = 0;

        while (a <= 1000){
            b += a;
            a++;
        }
        System.out.println(b);
    }
}
