package pl.devopsi.akademia;

import javax.swing.plaf.metal.MetalRadioButtonUI;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal( "Gekon", 2005, type.REPTILE);
        Animal animal2 = new Animal( "Jaszczurka", 2008, type.REPTILE);
        Animal animal3 = new Animal( "Zaba", 2015, type.AMPHIBIAN);
        Animal cat1 = new Cat("Dachowiec", 2020, type.MAMMAL,"Red");
        Animal cat2 = new Cat("Perski", 2018, type.MAMMAL,"Gray");
        Animal cat3 = new Cat("Brytyjski", 2001, type.MAMMAL,"Blue");
        Animal penguin1 = new Penguin("Kowalski", 2014, type.BIRD, 56);
        Animal meerkat1 = new Meerkat("Stefan", 2000, type.MAMMAL, false);

        animal.setName("Zaskroniec");
        animal2.setType(type.AMPHIBIAN);
        animal3.setYearOfBirth(2001);

        Zoo zoo = new Zoo("Central Park", 1853, new ArrayList<>());


        zoo.addAnimal(animal);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(cat1);
        zoo.addAnimal(cat2);
        zoo.addAnimal(cat3);
        zoo.addAnimal(penguin1);
        zoo.addAnimal(meerkat1);


        List<Speakable> soundOfAnimals = new ArrayList<Speakable>();
        soundOfAnimals.add(cat2);
        soundOfAnimals.add(penguin1);
        soundOfAnimals.add(cat1);
        soundOfAnimals.forEach(Speakable::sound);

        penguin1.sound();
        meerkat1.sound();
        cat1.sound();


        zoo.showInfo();
        System.out.println(cat2.toString());
        zoo.showAnimal();
        System.out.println("Numbers of animals in zoo: " + zoo.countAnimal());



        Numbers numbers = new Numbers(new int[]{-1,2,50,100});

        // Lambda1 sum of numbers
        Lambda1 lambda1 = (int[] numbers1)-> {
            int a = 0;
            int i;
            for (i = 0; i < numbers1.length; i++) {
                a += numbers1[i];
            }
            return a;
        };
        System.out.println("Sum of numbers: " + numbers.add(lambda1));

        // Lambda2 average of numbers
        Lambda2 lambda2 = (int[] numbers1)-> {
            int b = 0;
            int j;
            int c = 0;
            for (j = 0; j < numbers1.length; j++) {
                b += numbers1[j];
                c = b / numbers1.length;
            }
            return c;

        };
        System.out.println("Avg of numbers: " + numbers.avg(lambda2));

        // Lambda3 elements higher than 2
        Lambda3 lambda3 = (int[] numbers2)-> {
            for (int z = 0; z < numbers2.length; z++) {
                if (numbers2[z]>2){
                    System.out.println(numbers2[z]);
                }
            }
        };
        System.out.println("Numbers higher than 2:");
        numbers.show(lambda3);




//        int age = animal3.ageAnimal();
//        System.out.println(age);
//
//
//        if (animal.equals(animal2)) {
//            System.out.println("te obiekty sa sobie rowne");
//        }
//        else{
//            System.out.println("Obiekty nie są równe");
//        }


//        System.out.println(animal.getName());
//        System.out.println(animal.getYearOfBirth());
//        System.out.println(animal.getType());
//        System.out.println(animal2.getName());
//        System.out.println(animal2.getYearOfBirth());
//        System.out.println(animal2.getType());
//        System.out.println(animal3.getName());
//        System.out.println(animal3.getYearOfBirth());
//        System.out.println(animal3.getType());



    }


}
