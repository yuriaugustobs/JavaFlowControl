import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class controle {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            // Capturando o primeiro número
            System.out.println("Digite o primeiro parâmetro:");
            int entrada1 = entrada.nextInt();

            // Capturando o segundo número
            System.out.println("Digite o segundo parâmetro:");
            int entrada2 = entrada.nextInt();

            contar(entrada1, entrada2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            entrada.close(); 
        }
    }

    static void contar(int entrada1, int entrada2) throws ParametrosInvalidosException {
        if (entrada2 <= entrada1) {
            throw new ParametrosInvalidosException("O segundo parâmetro precisa ser maior que o primeiro.");
        } else {
            int diferenca = entrada2 - entrada1;
            int contagem = 1;
            do {
                System.out.println("Imprimindo o número " + contagem);
                contagem++;
            } while (contagem <= diferenca);
        }
    }
}
