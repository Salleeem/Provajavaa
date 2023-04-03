package Provinha;

import java.util.Scanner;

public class Exe {
    Scanner sc = new Scanner(System.in);

    public void arit() {

        System.out.println("Escolha um operação Aritmética(1=Adição, 2=Subtração, 3=Multiplicação, 4=Divisão)");
        int op = sc.nextInt();
        System.out.println("Informe o primeiro número");
        int first = sc.nextInt();
        System.out.println("Informe o segundo número");
        int second = sc.nextInt();
        int result;
        if (op == 1) {
            result = first + second;
            System.out.println("O resultado da soma é de " + result);
        } else if (op == 2) {
            result = first - second;
            System.out.println("O resultado da subtração é de " + result);
        } else if (op == 3) {
            result = first * second;
            System.out.println("O resultado da multiplicação é de " + result);
        } else if (op == 4) {
            result = first / second;
            System.out.println("O resultado da divisão é de " + result);
        } else {
            System.out.println("A operação não é válida");
        }

    }

    public void brook() {
        System.out.println("Digite o número da matrícula");
        int matr = sc.nextInt();
        double team = matr % 4;
        if (team == 1) {
            System.out.println("O aluno competirá no time Chris");

        } else if (team == 2) {
            System.out.println("O aluno competirá no time Chris");

        } else if (team == 3) {
            System.out.println("O aluno competirá no time Chris");

        } else if (team == 4) {
            System.out.println("O aluno competirá no time Chris");
        }

    }

    public void quitanda() {
        System.out.println("Informe o peso de Morangos comprdaos(em Kg)");
        double strawkg = sc.nextDouble();
        System.out.println("Informe o peso de Bananas comprdaos(em Kg)");
        double bananakg = sc.nextDouble();
        System.out.println("Informe o peso de Maça comprdaos(em Kg)");
        double applekg = sc.nextDouble();

        double strawprice = strawkg * 3.50;
        double bananaprice = bananakg * 1.80;
        double appleprice = applekg * 2.30;

        double weight = strawkg + bananakg + applekg;
        double asprice = strawprice + bananaprice + appleprice;

        double discount;
        double price;

        if (asprice >= 30 && weight >= 15) {
            discount = asprice / 10;
            price = asprice - discount;
            System.out.println("O valor a ser pago é de " + price);
        } else if (asprice >= 30) {
            discount = asprice / 10;
            price = asprice - discount;
            System.out.println("O valor a ser pago é de " + price);

        } else if (weight >= 15) {
            discount = asprice / 10;
            price = asprice - discount;
            System.out.println("O valor a ser pago é de " + price);
        } 
       else{
        System.out.println(" O valor a ser pago é de " + price);
       }
    }
 }

