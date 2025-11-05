package com.igorspinola;

import java.util.Scanner;

public class Menu {
    public static void savePet(Scanner sc) {
        sc.nextLine();

        Pet pet = new Pet();

        try {
            System.out.printf("Digite o nome do pet:");
            String name = sc.nextLine();
            System.out.printf("Digite o sobrenome do pet:");
            String surname = sc.nextLine();
            System.out.println("");
            name = name.replaceAll("[^a-zA-Z0-9]", "");
            surname = surname.replaceAll("[^a-zA-Z0-9]", "");

            pet.setName(name);
            pet.setSurname(surname);
            System.out.println("teste:" + name + " " + surname);
        } catch (Exception e) {
            System.out.println("é necessário nome e sobrenome!");
            throw new RuntimeException(e);
        }

        System.out.printf("Digite o numero da casa onde o pet foi encontrado:");
        String house_number = sc.nextLine();
        System.out.printf("Digite a cidade onde ele foi encontrado:");
        String city = sc.nextLine();
        System.out.printf("Digite a rua:");
        String street = sc.nextLine();
        System.out.println("");

        Address address = new Address(Integer.parseInt(house_number), city, street);
        System.out.println(address.toString());
        pet.setAddress(address);







    }
}
