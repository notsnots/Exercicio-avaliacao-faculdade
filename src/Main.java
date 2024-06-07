import java.util.Scanner;
/**
 * Elabore um programa que leia um vetor de 30 valores reais e o escreva. A seguir, o programa dever trocar o elemento da posição i pelo da posição i + 2 e escrever novamente o vetor. A leitura, a troca e a escrita devem ser feitas por métodos.
 @author Eduardo Rosa Rodrigues
 @version 07/06/2024
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] vetor = new double[30];

        lerVetor(vetor, in);

        System.out.println("valor original é : ");
        escreverVetor(vetor);

        System.out.println("");

        trocarElementos(vetor);
        System.out.println("valor com os valores trocados: ");
        escreverVetor(vetor);
    }
public static void lerVetor(double[] vetor, Scanner in){
    for(int i = 0; i < vetor.length; i++){
        System.out.println("Digite um valor real");
        vetor[i] = in.nextDouble();
    }
    System.out.println("Todos os valores foram armazenados");
}
public static void escreverVetor(double[] vetor) {
    for (double valor : vetor) {
        System.out.println(valor);
    }
}
public static void trocarElementos(double[] vetor){
        for(int i = 0; i < vetor.length - 2; i++){
            double valorAntigo = vetor[i];
            vetor[i] = vetor [i + 2];
            vetor[i + 2] = valorAntigo;
        }

    }
}