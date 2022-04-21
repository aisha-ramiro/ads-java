import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;

// 1.Crie um programa que  receba uma nota e partir desta nota ele apresente aprovado se nota maior que 5 e reprovado se nota menor que 5.

public class Tarefa2ex1 {
  public static void main (String [] args){
    String entrada = JOptionPane.showInputDialog("Digite a nota do aluno");
    int nota = Integer.parseInt(entrada);

    if (nota >= 5 )
    JOptionPane.showMessageDialog(null, "O aluno foi aprovado!");
    else
    JOptionPane.showMessageDialog(null, "O aluno foi reprovado!");
  }
}