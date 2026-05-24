import br.com.agendamento_barbearia.model.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Menu Barbearia =====");
        System.out.println(" 1 - Login Cliente \n 2 - Cadastro Cliente \n 3 - Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Digite seu email:");
                String email_login = scanner.nextLine();
                System.out.println("Dite sua senha:");
                String senha_login = scanner.nextLine();
                System.out.println("Login Realizado!");
                break;



            case 2:
                System.out.println("Digite seu nome:");
                String nome = scanner.nextLine();
                System.out.println("Digite seu email:");
                String email = scanner.nextLine();
                System.out.println("Digite sua nova senha:");
                String senha = scanner.nextLine();
                break;


            case 3:
                break;

        }
    }
}