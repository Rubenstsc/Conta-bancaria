import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dados do cliente.
        String nome = "Light Yagami";
        String tipoConta = "Conta Corrente";
        double saldo = 2500.00;

        System.out.println("***********************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo de conta:" + tipoConta);
        System.out.println("Saldo atual : " + saldo);
        System.out.println("\n***********************");

        //menu de opção.
        int op = 0;

        String menu = """
                *** Digite sua opção 
                
                1- Ver saldo 
                2- Sacar
                3- Depositar
                4- Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (op != 4) {
            System.out.println(menu);
            op = leitura.nextInt();

            if (op == 1) {
                System.out.println("Seu saldo atual: " + saldo);
            } else if (op == 2) {
                System.out.println("Qual valor deseja sacar: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo indisponivel");
                } else {
                    saldo -= valor;
                    System.out.println("Seu saldo atual: " + saldo);
                }
            } else if (op == 3) {
                System.out.println("Qual valor deseja depositar: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (op != 4){
                System.out.println("Opcao invalida");
            }
        }
    }
}