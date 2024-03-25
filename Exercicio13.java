public class Exercicio13 {
    public static void executar(){

    
        System.out.println("Informe um número para a sequência : ");
        int N = Prompt.lerInteiro();
        int[] fibonacci = new int[N];

        int a = 1, b = 1;

        for (int i = 0; i < N; i++) {
            fibonacci[i] = a;
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.print("Sequência de Fibonacci com os " + N + " primeiros termos: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci[i] + " ");
        }

    }
}
