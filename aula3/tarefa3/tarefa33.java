// 3.Crie um programa que some 10 números digitados pelo usuário.

import javax.swing.*;
import javax.swing.JOptionPane;

public class Tarefa3ex3{
  public static void main (String [] args){
    int entrada = 0;
    for(int i = 0; i < 10; i++){
      int soma = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor nº "+ (i + 1)));
      entrada += soma;
    }
    System.out.println("O resultado é: " + entrada);
  }
}