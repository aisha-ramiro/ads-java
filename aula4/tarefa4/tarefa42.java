//2.Crie um programa que  armazene 10 notas em um array e os mostre em seguida
import javax.swing.*;
import javax.swing.JOptionPane;

public class Tarefa4ex2{
  public static void main (String [] args){
    int [] notas = new int[10];

    for(int i = 0; i < notas.length; i++){
      int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota da posição "+ (i+1)));
      notas[i] = nota;
    }
    for(int nota:notas){
      System.out.println(nota);
    }
  }
}