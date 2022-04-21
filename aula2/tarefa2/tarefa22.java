import java.util.Scanner;

//2.Crie um programa que mostre se o número é par ou impar.  (numero%2 == 0) //par
public class Tarefa2ex2 {
  public static void main (String [] args){
  System.out.println("Digite um número");
  Scanner entrada = new Scanner(System.in);
  int numero = entrada.nextInt();

  if (numero%2 == 0){
    System.out.println("O número " + numero + " é par");
  } else {
    System.out.println("O número " + numero + " é impar");
  }

  }}