import java.util.Random; 
import java.util.Scanner;
import java.util.Date;

public class TesteBubble {
  // Codigo que gera um vetor aleatorio
  static void geraVetor (int[] v) {
    Random r = new Random();
    for (int i = 0; i < v.length; i++) {
      v[i] = r.nextInt(v.length * 10);
    }
  }
  // Código de ordenacao tipo BubbleSort
  // Obs: eh aqui que se insere os outros tipos de ordenacao
  static void bubbleSort (int[] v) {
    for (int i=1; i<v.length; i++) {
      for(int j=0; j<v.length-i; j++) {
        if(v[j] > v[j+1]) { 
          int temp= v[j];
          v[j] = v[j+1];
          v[j+1] = temp; }}}
  
  }
  // codigo de execucao de testes
  public static void main(String args[]) {
    // Aqui o usuario digita o tamanho do vetor
    int tamanho = 40000;
    int[] v = new int[tamanho];
    // loop de testes (20) que o codigo vai fazer com o vetor gerado
    for (int i = 1;  i <= 20; i++) {
      geraVetor(v);
      long inicio = new Date().getTime();
      bubbleSort(v);
      long fim = new Date().getTime();
      // Exibe quanto tempo o processo demorou
      System.out.println ("\n> O Teste" + " " + i + " " + "Demorou: " + (fim - inicio) + " millisegundos");
    }
  }
}
