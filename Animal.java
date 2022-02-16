package pl.devopsi.akademia;

import java.util.Objects;

public class Animal implements Speakable{


    private String name;
    private int yearOfBirth;
    private Enum type;
    private static int CURRENT_YEAR = 2022;

    public Animal(String name, int yearOfBirth, Enum type){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return yearOfBirth == animal.yearOfBirth && getName().equals(animal.getName()) && getType().equals(getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYearOfBirth(), getType());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", type='" + getType() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Enum getType() {
        return type;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public int ageAnimal(){
        return CURRENT_YEAR - yearOfBirth;
    }

        public void sound() {
        System.out.println("Animal sound");
    }
}



