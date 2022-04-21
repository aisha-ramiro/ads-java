// 3.Crie um programa que receba 2 números e um operador (+, -. *, /) e faça a respectiva operação.
import java.util.Scanner;

public class Tarefa2ex3 {
  public static void main (String [] args){
    System.out.println("Digite o primeiro número");
      Scanner a = new Scanner(System.in);
      int numA = a.nextInt();
    
    System.out.println("Digite o segundo número");
      Scanner b = new Scanner(System.in);
      int numB = b.nextInt();

    System.out.println("Digite o operador desejado (+ - * /)");
      Scanner c = new Scanner(System.in);
      String operador = c.next();

    switch(operador){
      case "+":
      System.out.println("A soma entre "+ numA + " e " + numB + " é igual a: " + (numA+numB)); //colocando a operação direto
      break;
      case "-":
      int sub = numA-numB;
      System.out.println("A subtração entre "+ numA + " e " + numB + " é igual a: " + sub); //ou criando uma operação antes
      break;
      case "*":
      System.out.println("A multiplicação entre "+ numA + " e " + numB + " é igual a: " + (numA*numB));
      break;
      case "/":
      System.out.println("A divisão entre "+ numA + " e " + numB + " é igual a: " + (numA/numB));
      break;
      default:
      System.out.println("Não foi possível identificar o operador");    
    }
    
  }
}