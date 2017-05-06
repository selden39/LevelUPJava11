package zoo;

import java.util.Objects;

public class Animal {
    String name;
    char sex;
    String kind;

    public Animal (String name, char sex, String kind) {
        this.name = name;
        this.sex = sex;
        this.kind = kind;
    }

    public void printing(){
        System.out.printf("%12s %4s %8s", name, sex, kind);
        System.out.println();
    }

    public void move(){
        System.out.println(kind + " " + name + " run");

    }

    public void fight(String kindAnimal, String nameAnimal){
        System.out.println(kind + " " + name + " fight with " + kindAnimal + " " + nameAnimal);

    }

    public String game(){
        return kind + " " + name + " game with ";

    }
    public void eat(){}
}
