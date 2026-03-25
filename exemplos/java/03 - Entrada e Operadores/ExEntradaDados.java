package aulasjava;
import java.util.Scanner;

public class ExEntradaDados {
  public static void main(String[] args) {
    String nome;
    int idade;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o seu nome? ");
    nome = teclado.next();
    System.out.println("Qual a sua idade? ");
    idade = teclado.nextInt();

    System.out.println(nome + " tem " + idade + " anos de idade .");
    teclado.close();
}}
