package zoo;

public class Animal {
    String name;
    char sex;
    String kind;

    public Animal (String name, char sex, String kind) {
        this.name = name;
        this.sex = sex;
        this.kind = kind;
    }

    public static void printingAnimal(int i, Animal animal){
        System.out.printf("%12s %4s %8s %12s %1s", animal.name, animal.sex, animal.kind, "cell -", i+1);
        System.out.println();
    }

    public static void move(Animal animal){
        System.out.println(animal.kind + " " + animal.name + " run");

    }

    public static void fight(Animal animal1, Animal animal2){
        System.out.println(animal1.kind + " " + animal1.name +  " fight with " + animal2.kind + " " + animal2.name);

    }

    public static void game(Animal animal){
        System.out.print(animal.kind + " " + animal.name + " game with ");

    }
}
