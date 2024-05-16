import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        String nomeCliente;
        Integer conta;
        String agencia;
        double saldo;

        System.out.println("********************************");
        System.out.println("         Banco                  ");
        System.out.println(" Informe o seu Nome? ");
        Scanner sc = new Scanner(System.in);
        nomeCliente = sc.nextLine();
        System.out.println("Informe o Número da Agência Ex:(XXXX-X)");
        agencia = sc.next();
        System.out.println("Informe o Número da Conta: ");
        conta = sc.nextInt();
        System.out.println("O Saldo Disponivel é : ");
        saldo = sc.nextDouble();




        System.out.println(" Olá " +nomeCliente+ " Obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + " " +
                " Conta: " + conta + " seu saldo: R$" + saldo + " Já está disponivel para saque."  );

        sc.close();


    }
}

