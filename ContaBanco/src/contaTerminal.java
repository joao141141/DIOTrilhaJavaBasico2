import java.util.Locale;
import java.util.Scanner;


public class contaTerminal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de usuario!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite agora o número de sua Agência!");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Agora, digite seu nome!");
        String nome = scanner.next();
        scanner.nextLine();

        System.out.println("Agora, faça seu primeiro deposito!");
        double saldo = scanner.nextDouble();
        

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de R$ " + saldo + " já está disonivel para saque.");


        //TODO:Conhecer e importar a classe scanner (feito)
        //Exibir as mensagens pra nosso usuario (feito)
        //obterpela classe scanner os valores  digitados no terminal (feito)
        //exibir a mensagem final (feito)






    }
}
