public class Exercicio08 {
    public static void executar(){

        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};
        int tamanhoC = A.length + B.length;
        int[] C = new int[tamanhoC];

            for(int i= 0; i<A.length; i++){
                C[i] = A[i];
            }
            for(int i= 0; i<B.length; i++){
                C[A.length + i] = B[i];
            }
             
            
        System.out.println("Vetor C (concatenação de A e B): ");
            for(int i= 0; i<C.length; i++){
                System.out.println(C[i]);
            }

            }
  }