package com.sdajava.liczbaautomorficzna;

import java.util.Scanner;

public class Main {

    public static void liczbaAutomorficzna(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = input.nextInt();
        System.out.println("Podaj wykładnik: ");
        int m = input.nextInt();
        int a;
        int b = m;

        while(b < n){
            b = b * m;
        }

        a = (int) Math.pow(n,2) % b;

        if (a == n){
            System.out.println("Liczba " + n + " jest automorficzna.");
        }else{
            System.out.println("Liczba " + n + " nie jest automorficzna.");
        }
    }

    public static void main(String[] args) {
    Main.liczbaAutomorficzna();
    }
}
