import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scan = new Scanner(System.in);
        Cliente cliente = new Cliente();

        //Exibir as mensagens para o usuário e bter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência!");
        cliente.setAgencia(scan.next());
        System.out.println("Por favor, digite o seu nome!");
        cliente.setNomeCliente(scan.next());

        System.out.println("Olá " + cliente.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + cliente.getAgencia() + ", conta " + cliente.getNumero() +
                " e seu saldo " + cliente.getSaldo() + " já está disponível para saque");


    }
}