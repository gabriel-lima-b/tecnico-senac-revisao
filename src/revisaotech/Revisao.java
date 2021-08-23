/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaotech;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gabriellimab
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //tipos primitivos de variáveis
        boolean verifica; // variavel booleana

        int num1; // numero inteiro
        short num2; // inteiro pequeno
        long num3; // inteiro grande
        byte b; //numero inteiro de -128 até 127

        double num4; // numero flutuante 8bytes
        float num5; //numero flutuante 4bytes

        String texto;// qualquer texto
        char caractere; //um caractere da tabela ASCII
        
        //ArrayList -> vetor mais sofisticado
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println("Hello World!");

        System.out.print("Informe um numero inteiro:");
        num1 = leitor.nextInt();

        System.out.println("Informe um inteiro até 127:");
        b = leitor.nextByte();

        System.out.print("Informe um inteiro pequeno:");
        num2 = leitor.nextShort();

        System.out.println("Informe um inteiro grande:");
        num3 = leitor.nextLong();

        System.out.print("Informe um numero decimal:");
        num4 = leitor.nextDouble();

        System.out.print("Informe um decimal pequeno:");
        num5 = leitor.nextFloat();

        System.out.print("Digite algo ai:");
        texto = leitor.nextLine();

        System.out.print("Digite um caractere:");
        caractere = leitor.next().charAt(0);

        System.out.println("--- Impressão ---");
        System.out.println("int: " + num1);
        System.out.println("byte: " + b);
        System.out.println("short: " + num2);
        System.out.println("long: " + num3);
        System.out.println("double: " + num4);
        System.out.println("float: " + num5);
        System.out.println("String: " + texto);
        System.out.println("char: " + caractere);

        verifica = num1 > num2;

        System.out.println("num1 > num2 ? " + verifica);

        System.out.println("ArrayList");
        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Posição: " + i + " | Valor: " + lista.get(i));

        }

        System.out.println("ArrayList-Impressão 2");
        lista.forEach((i) -> System.out.println("Valor: " + i));

        System.out.println("ArrayList-Impressão 3");
        System.out.println("Valores: " + lista.toString());

        System.out.println("ArrayList-Impressão 4");
        for (Integer integer : lista) {
            System.out.println("Valores: " + lista.get(integer));
        }

    }

}
