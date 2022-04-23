//3.Crie um programa que  armazene 10 notas em um array e mostre a maior nota, a menor nota, e a média

import java.util.Scanner;

public class Tarefa4ex3{
  public static void main (String [] args){
    int [] notas = new int[10];
    int maior = 0;
    int menor = 10;
    int soma = 0;

    for(int i = 0; i< notas.length; i++ ){
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite a nota da posição "+ (i+1));
      int entrada = sc.nextInt();
      notas[i] = entrada;
      
      if(notas[i] > maior){
        maior = notas[i];
      }
      
      if(notas[i] < menor){
        menor = notas[i];
      }
      
      soma = soma + notas[i];
    }    

      System.out.println("A maior nota é: "+ maior);
      System.out.println("A menor nota é: "+ menor);
      System.out.println("A média é "+ (soma/notas.length));
  }
}