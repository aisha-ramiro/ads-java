//4.Crie um programa que mostre de 0 até o número digitado.

import java.util.Scanner;

public class Tarefa3ex4{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número");
    int entrada = sc.nextInt();
    int contador = 0;

    while(contador < entrada){
      contador++;
      System.out.println(contador);
    }

  } 
}