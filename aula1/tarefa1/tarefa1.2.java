import java.util.Scanner;

public class Tarefa12{
public static void main (String [] args){
//2.Crie um programa que receba 3 números e mostre a média

  System.out.println("Digite o primeiro número: ");
  Scanner inputA = new Scanner(System.in);
  int a = inputA.nextInt();

  System.out.println("Digite o segundo número: ");
  Scanner inputB = new Scanner(System.in);
  int b = inputB.nextInt();

  System.out.println("Digite o terceiro número: ");
  Scanner inputC = new Scanner(System.in);
  int c = inputC.nextInt();

  int media = (a+b+c) / 3;

  System.out.println("A média entre os números é = " + media);
}
}