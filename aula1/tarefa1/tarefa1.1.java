import java.util.Scanner;

public class Tarefa11 {
public static void main (String [] args){
  //1. Crie um programa que recebe 2 números e mostra a: soma,multiplicação,divisão,subtração
  System.out.println("Digite o primeiro número: ");
  Scanner inputA = new Scanner(System.in);
  int a = inputA.nextInt();

  System.out.println("Digite o segundo número: ");
  Scanner inputB = new Scanner(System.in);
  int b = inputB.nextInt();

  int soma = a + b;
  int mult = a * b;
  int div = a / b;
  int sub = a - b;

  System.out.println("A soma entre os números é = "+ soma);
  System.out.println("A multiplicação entre os números é = "+ mult);
  System.out.println("A divisão entre os números é = "+ div);
  System.out.println("A subtração entre os números é = "+ sub);

}
}