import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nome do funcionário: ");
     String nome = sc.nextLine();

    System.out.print("Peso do funcionário: ");
     Double peso = sc.nextDouble();

    System.out.print("Quantidade de água tomada no dia: ");
     Double qntAguaTomada = sc.nextDouble();

    Double qntIdeal = (peso * 35) / 1000;

    Double qntFaltante = (qntIdeal - qntAguaTomada);

    System.out.println("Nome do funcionário: " + nome);

    System.out.println("Peso do funcionário: " + peso);

    System.out.println("Quantidade de água tomada no dia: " + qntAguaTomada);

    System.out.println("Quantidade ideal de água a ingerir: " + qntFaltante);

    if (qntFaltante <=0) {
     System.out.println("Parabéns, você atingiu a meta de hidratação diária");
    }
    else {
      System.out.println("Continue focado em se hidratar por hoje, ainda faltam " +(qntFaltante)+ " litros! Você consegue!");
    }
