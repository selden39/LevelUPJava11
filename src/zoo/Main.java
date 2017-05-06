package zoo;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dogVasya = new Animal("Vasya", 'm', "dogs");
        Animal dogZuchka = new Animal("Zuchka", 'f', "dogs");
        Animal catBanifciy = new Animal("Banifciy", 'm', "cat");
        Animal catMurka = new Animal("Murka", 'f', "cat");
        Animal bearTaptish = new Animal("Taptish", 'm', "bear");
        Animal birdKesha = new Animal("Kesha", 'm', "bird");
        Animal birdInya = new Animal("Inya", 'f', "bird");
        Animal birdHugo = new Animal("Hugo", 'm', "bird");

        ArrayList<Animal> animalCell = new ArrayList<>();
        animalCell.add(dogVasya);
        animalCell.add(dogZuchka);
        animalCell.add(catBanifciy);
        animalCell.add(catMurka);
        animalCell.add(bearTaptish);
        animalCell.add(birdKesha);
        animalCell.add(birdInya);
        animalCell.add(birdHugo);

        dogVasya.printing();
        dogZuchka.printing();
        catBanifciy.printing();
        catMurka.printing();
        bearTaptish.printing();
        birdKesha.printing();
        birdInya.printing();
        birdHugo.printing();

        System.out.println(" --------------------------- ");

        int i = 0;
        animalCell.get(i).move();

        dogZuchka.fight(catMurka.kind, catMurka.name);

        //
        String game = bearTaptish.game();
        System.out.println(game + birdKesha.kind + " " + birdKesha.name);

    }




}
