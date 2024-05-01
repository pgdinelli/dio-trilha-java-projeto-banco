/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dio.contaterminal;

/**
 *
 * @author Paulo
 */
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        //usando a classe Locale para usar o padrão de ponto flutuante
        Locale.setDefault(Locale.US);
        //importando a classe scanner
        Scanner sc = new Scanner(System.in);
        
        //declaração de variáveis
        int numeroConta;
        double saldo;
        String agencia, nomeCliente;
        
        //exibir as mensagens para o usuário e obtendo valores
        System.out.print("Por favor, informe seu nome completo: ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.next();
        System.out.print("Digite o número da conta: ");
        numeroConta = sc.nextInt();
        System.out.print("Informe o saldo que deseja sacar: R$");
        saldo = sc.nextDouble();
        
        //exibir a mensagem final da conta
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +  " e seu saldo R$" + saldo + " já está disponível para saque");
        sc.close();
    }
}
