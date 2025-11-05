package com.igorspinola;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void printFile(File file) {
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        } finally {
            if(sc != null) {
                sc.close();
            }
        }

    }

    public static void main(String[] args)  {
        String path = "src/main/resources/";
        File form = new File(path + "form.txt");
        File menu = new File(path + "menu.txt");

        printFile(form);

        System.out.println("");
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("");

        printFile(menu);

        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int input = 1;

        while(input != 6) {
            System.out.printf("Digite o comando desejado:");
            try {
                input = sc.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                throw new IllegalArgumentException("Argumento invalido");
            }
            if(input <= 0) {
                System.out.println("Numero inválido!");
                System.out.println("");
                printFile(menu);
                continue;
            }
            switch (input) {
                case 1:
                    Menu.savePet(sc);
                    break;
                case 2:
                    System.out.println("2");
                    break;
            }
        }
    }
}