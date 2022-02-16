package pl.devopsi.akademia;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Zoo {

    private String name;
    private int yearOfEstablishment;
    private List<Animal> animals;




    public Zoo(String name, int yearOfEstablishment, List<Animal> animals){
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.animals = animals;


    }
    public List<Animal> getAnimals() {
        return animals;
    }


    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void showAnimal(){
        this.animals.forEach(System.out::println);
    }

    public int countAnimal(){
        return this.animals.size();
    }
    private int avgAge(){
        int ageSum = 0;
        for (Animal animal : this.animals){
            ageSum = ageSum + animal.ageAnimal();
        }
        return ageSum / this.countAnimal();
    }

    public void showInfo(){
        System.out.println("Informacje dotyczące ZOO: " + this.name);
        System.out.println("Średni wiek zwierząt: " + this.avgAge() + "lat");
        System.out.println("Rok założenia: " + this.yearOfEstablishment);

    }


}
