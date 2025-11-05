package com.igorspinola;

public class Pet {

    enum Type {
        CAT,
        DOG
    }

    enum Gender {
        MASCULINE,
        FEMININE
    }

    private String name;
    private String surname;
    private Type petType;
    private Gender gender;
    private Address address;
    private int age;
    private int weight;
    private String race;

    public Pet() {}

    public Pet(String name, String surname, Type petType, Gender gender, Address address, int age, int weight, String race) {
        this.name = name;
        this.surname = surname;
        this.petType = petType;
        this.gender = gender;
        this.address = address;
        this.age = age;
        this.weight = weight;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", petType='" + petType + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Type getPetType() {
        return petType;
    }

    public void setPetType(Type petType) {
        this.petType = petType;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
