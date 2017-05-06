package farm;
public class Dog extends Mammals{
    public Dog(String name){
        super(name);
    }

    public void printName(String name){
        System.out.println("Dog name is " + name);
    }
    public void breathe() {
    }

    public void run(int speed) {
        System.out.println("It can run " + speed + " km/h");
    }
    public void voice(String voice){
        System.out.println("It voice: " + voice + " - " + voice + " - " + voice);
    }


}
