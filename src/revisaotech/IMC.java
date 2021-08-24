/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaotech;

import java.util.Scanner;

/**
 *
 * @author gabriellima
 */
/*

    Como é calculado?

    O IMC é a relação entre peso e altura e o cálculo é feito de acordo 

    com a fórmula: IMC = peso/ (altura x altura), devendo o peso estar 

    em kg e a altura em metro, e o resultado é dado em kg/m2. 

    Depois de obter o resultado, é possível verificar em que faixa o IMC 

    se encontra, podendo indicar:



    Magreza, quando o resultado é menor que 18,5 kg/m2;

    Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;

    Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;

    Obesidade, quando o resultado é maior que 30 kg/m2.

 */
public class IMC {

    /**
     * @param altura altura da pessoa
     * @param peso peso da pessoa
     * @return o resultado do cálculo do IMC
     */
    public static float calculaIMC(float altura, float peso) {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        float altura, imc, peso;
        boolean magreza, normal, sobrepeso;
        Scanner ler = new Scanner(System.in);

        System.out.println("");
        System.out.println("Informe seu peso: ");
        peso = ler.nextFloat();
        System.out.println("Informe sua altura: ");
        altura = ler.nextFloat();

        imc = calculaIMC(altura, peso);

        magreza = imc < 18.5;
        normal = 18.5 <= imc && imc <= 24.9;
        sobrepeso = 24.9 <= imc && imc <= 30;

        if (magreza) {
            System.out.printf("Seu IMC é: %.2f você está magrx.", imc);
        } else if (normal) {
            System.out.printf("Seu IMC é: %.2f você está no seu peso ideal.", imc);
        } else if (sobrepeso) {
            System.out.printf("Seu IMC é:  %.2f você está em sobrepeso.", imc);
        } else {
            System.out.printf("Seu IMC é:  %.2f você está com obesidade.", imc);
        }

    }

}
