package zoo;

public class Zoo {
    String nameZoo;
    Animal[] animalsCell = new Animal[8];
    int lastEmpty = 0;

    public Zoo (String name){
        nameZoo = name;
    }

    void put (Animal a) {
        if (lastEmpty < animalsCell.length) {
            animalsCell[lastEmpty] = a;
            lastEmpty++;
        }
    }

    static void printNameZoo (String nameZoo){
        System.out.println("------------- " + nameZoo + " -------------");
    }



}
