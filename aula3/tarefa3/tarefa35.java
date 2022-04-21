//5.Crie um programa que enquanto não houver o valor de saída digitado (defina um valor), 
//o mesmo apresente a opção para digitar um novo valor.

import java.util.Scanner;

public class Tarefa3ex5{
  public static void main (String [] args){
    int valor = 10;
    int entrada = 0;

    do{
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor");
    entrada = sc.nextInt();
    } while (entrada != valor);

  }
}


