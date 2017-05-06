package zoo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create Zoo
        Zoo zoo1 = new Zoo("ZooFannyAnimals");
        // Create Animal and put them in cell Zoo
        Animal dogVasya = new Animal("Vasya", 'm', "dogs");
        zoo1.put(dogVasya);
        Animal dogZuchka = new Animal("Zuchka", 'f', "dogs");
        zoo1.put(dogZuchka);
        Animal catBanifciy = new Animal("Banifciy", 'm', "cat");
        zoo1.put(catBanifciy);
        Animal catMurka = new Animal("Murka", 'f', "cat");
        zoo1.put(catMurka);
        Animal bearTaptish = new Animal("Taptish", 'm', "bear");
        zoo1.put(bearTaptish);
        Animal birdKesha = new Animal("Kesha", 'm', "bird");
        zoo1.put(birdKesha);
        Animal birdInya = new Animal("Inya", 'f', "bird");
        zoo1.put(birdInya);
        Animal birdHugo = new Animal("Hugo", 'm', "bird");
        zoo1.put(birdHugo);

        // print name Zoo
        Zoo.printNameZoo(zoo1.nameZoo);

        // print all animals in Zoo
                /*for (int i = 0; i < zoo1.animalsCell.length; i++ ) {
                    Animal.printingAnimal(i, zoo1.animalsCell[i]);
                }*/
        printAllAnimals(zoo1);

        // Print Show program
        System.out.println(" -------- Program " + zoo1.nameZoo + " --------");
        Random randomCell = new Random();

        //first show - run
        System.out.println("First show:");
        Animal.move(zoo1.animalsCell[randomCell.nextInt(zoo1.animalsCell.length)]);

        //second show - fight
        System.out.println("Second show:");
        Animal.fight(zoo1.animalsCell[randomCell.nextInt(zoo1.animalsCell.length)], zoo1.animalsCell[randomCell.nextInt(zoo1.animalsCell.length)]);

        //third show - game
        System.out.println("Third show:");
        for (int i = 0; i < zoo1.animalsCell.length - 1; i++ ) {
            Animal.game(zoo1.animalsCell[i]);
        }
        System.out.println(zoo1.animalsCell[zoo1.animalsCell.length - 1].kind + " " + zoo1.animalsCell[zoo1.animalsCell.length - 1].name);
        System.out.println();
    }

    private static void printAllAnimals(Zoo zoo){
        for (int i = 0; i < zoo.animalsCell.length; i++ ) {
            Animal.printingAnimal(i, zoo.animalsCell[i]);
        }
    }
/*
    private static void printShowProgram(Zoo zoo){
        System.out.println(" -------- Program " + zoo.nameZoo + " --------");
        Random randomCell = new Random();
        System.out.println("First show:");
        Animal.move(zoo.animalsCell[randomCell.nextInt(zoo.animalsCell.length)]);
*/




}
