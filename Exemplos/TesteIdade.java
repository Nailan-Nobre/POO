import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Idade: " + idade);

        int idadeAnoQueVem = idade + 1;
        System.out.println("Idade ano que vem: " + idadeAnoQueVem);

        scanner.close();
    }
}
