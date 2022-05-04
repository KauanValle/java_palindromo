package com.kauan;

import java.util.*;

public class Palindromo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua palavra");
        String palindromoUsuario = s.nextLine();

        String palindromo = "";

        palindromoUsuario = (palindromoUsuario.toUpperCase()).replace(" ", "");
        int tamanhoPalindromo = palindromoUsuario.length();

        for(int i = tamanhoPalindromo; i > 0; i--){
            palindromo += palindromoUsuario.charAt((i - 1));
        }

        if(palindromoUsuario.equals(palindromo)){
            System.out.println("Sua palavra é um Palindromo!");
        }else{
            System.out.println("Sua palavra não é um Palindromo!");
        }
    }
}
