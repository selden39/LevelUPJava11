package farm;
public class Cat extends Mammals {
    public Cat(String name) {
        super(name);
    }

    public void printName(String name){
        System.out.println("Cat name is " + name);
    }
    public void breathe() {
    }

    public void run(int speed) {
        System.out.println("It can run " + speed + " km/h");
    }
    public void voice(String voice){
        System.out.println("It voice: " + voice + " - " + voice + " - " + voice);
    }

    public void jamp(int lengthJump){
        System.out.println("It can jump: " + lengthJump + "m");
    }

}
