//4.Preencha e Mostre uma Matriz de inteiro 2x2.

public class Tarefa4ex4{
  public static void main (String [] args){
    int [][] numeros = new int[2][2];
    numeros [0][0] = 1;
    numeros [0][1] = 2;
    numeros [1][0] = 3;
    numeros [1][1] = 4;

    for(int i=0; i < numeros.length; i++){
      for(int j=0; j< numeros[i].length; j++){
        System.out.println(numeros[i][j]);
      }
    }
  
  }
}