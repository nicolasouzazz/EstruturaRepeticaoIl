import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estrutura de Repetição II");
        System.out.println("=========================");

        // int contador = 0;

        /*
         * Exemplo de estrutura de repetição do-while
         * - O laço "do-while" executa o bloco de código pelo menos uma vez antes de
         * verificar a condição.
         * - Neste exemplo, o contador inicia em 0 e incrementa até 5, imprimindo o
         * valor do contador a cada iteração.
         * 
         * do {
         * System.out.println("Contador de cambalhotas: " + contador);
         * System.out.println("==========================");
         * contador++;
         * 
         * } while (contador < 5); // Condição verificada após a execução do bloco
         */

        /* Ex1 - Soma de numeros atraves do teclado */

        int numero, soma = 0;
        String resposta;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número:");
            numero = scanner.nextInt();
            System.out.println("==========================");
            soma += numero; // soma = soma + numero
            System.out.print("Quer continuar? (S/N):");
            resposta = scanner.next();
            System.out.println("==========================");
        } while (resposta.equals("S"));
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("==========================");
        scanner.close();
    }
}
