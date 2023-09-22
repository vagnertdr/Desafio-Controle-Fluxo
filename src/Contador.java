import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o Primeiro Parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o Segundo Parâmetro: ");
            int parametroDois = terminal.nextInt();


            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: o segundo parâmetro deve ser maior que o primeiro
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");

        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //Validar se parametroUm é maior que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

        for (int i=0; i < contagem; i++ )
            System.out.println("Imprimindo o número: "  +  (i+1));
    }
}