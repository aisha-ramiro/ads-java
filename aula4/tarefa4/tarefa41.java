//1.Crie um programa que  armazene 5 nomes no array e os mostre em seguida

import javax.swing.*;
import javax.swing.JOptionPane;

public class Tarefa4ex1{
  public static void main (String [] args){
    String [] nomes = new String[5];

    for(int i = 0; i < nomes.length; i++){
      String nome = JOptionPane.showInputDialog("Informe o nome da posição "+ (i+1));
      nomes[i] = nome;
    }
    for(String nome:nomes){
      System.out.println(nome);
    }
  }
}