package farm;
import java.util.Random;

public class MyFarm {
    public static void main(String[] args){
        System.out.println("              my farm                ");

        System.out.println("------------  Chickens  -------------");
        Chicken Chicken1 = new Chicken("Vasya", 3);
        Chicken Chicken2 = new Chicken("Petya", 3);
        Chicken Chicken3 = new Chicken("Imka", 2);
        Chicken1.voice(Chicken1.name, "pi");
        Chicken1.dance(Chicken1.name, "Latina");
        Chicken2.voice(Chicken2.name, "kou");
        Chicken2.dance(Chicken2.name, "Break");
        Chicken1.voice(Chicken3.name, "mi");
        Chicken1.dance(Chicken3.name, "Folk Dance");

        System.out.println("--------  Mother Chickens  --------");
        MotherChickens mChickens = new MotherChickens ("Mama Chicka", "ko");
        mChickens.voice (mChickens.name, mChickens.voice);
        mChickens.dance(mChickens.name, "BellyDance");

        System.out.println("--------  Father Chickens  --------");
        FatherChickens fChickens = new FatherChickens ("Mr Chick", "ku");
        fChickens.voice (fChickens.name, fChickens.voice);
        fChickens.dance(fChickens.name, "Hip-hop");

        System.out.println("-------------  Turkey  ------------");
        Turkey turkey1 = new Turkey("Valdemar");
        turkey1.voice(turkey1.name);

        Random random = new Random();
        int moodTurkey = random.nextInt(4);

        String turkeyDo = turkey1.activeTurkey(moodTurkey);
        System.out.println("Turkey do " + turkeyDo);

        System.out.println("-------------  Cat  ------------");
        Cat cat1 = new Cat("Matroskin");
        cat1.printName(cat1.name);
        cat1.run(10);
        cat1.voice("mur");
        cat1.jamp(3);

        System.out.println("-------------  Dog  ------------");
        Dog dog1 = new Dog("Myha");
        dog1.printName(dog1.name);
        dog1.run(12);
        dog1.voice("guv");

        System.out.println("-------------  Cow  ------------");
        Cow cow = new Cow("Murka");
        cow.printName(cow.name);
        cow.run(5);
        cow.voice("mu");
        cow.giveMilk(7);

        System.out.println("-----------  Tractor  ----------");
        int howFuel = random.nextInt(50);
        boolean haveTrailer = random.nextBoolean();

        Tractor tractor1 = new Tractor(howFuel, haveTrailer);

        String colorTractor = tractor1.returnColor();
        System.out.println("Our tractor is " + colorTractor);

        tractor1.rideTractor(howFuel, haveTrailer);



    }



}
