package br.senai.sp.jandira;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Exemplo Array

        String [] carros = {"x1", "fusca","ferrari", "renegade"};

        System.out.println("=====================================");
        System.out.println("------------- BEM VINDO -------------");
        System.out.println("=====================================");

        for(int i = 0; i<carros.length; i++){

            System.out.println("Carro "+ (i+1) +": " + carros[i]);
        }

        System.out.println("Escolha seu carro: [ 1 à " + carros.length + " ] ");
        String  optionUser = teclado.nextLine();

        boolean validaCar =false;

        for (int i=0; i< carros.length; i++){

            if (optionUser.equalsIgnoreCase(carros[i])){
                System.out.println(carros[i] + " Está disponivel!");
                validaCar=true;

            }
        }

        if (!validaCar){

            System.out.println(optionUser + " não está disponivel!");

        }



    }
}








