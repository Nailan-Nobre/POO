import java.util.Scanner;

public class Decisao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("Você não tem permissão, jovem");
        }else{
            System.out.println("Você tem permissão, jovem");
        }
    }
}
