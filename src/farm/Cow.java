package farm;
public class Cow extends Mammals{
    public Cow(String name){
        super(name);
    }

    public void printName(String name){
        System.out.println("Cow name is " + name);
    }
    public void breathe() {
    }

    public void run(int speed) {
        System.out.println("It can run " + speed + " km/h");
    }
    public void voice(String voice){
        System.out.println("It voice: " + voice + " - " + voice + " - " + voice);
    }
    public void giveMilk(int volumeMilk){
        System.out.println("It can give " + volumeMilk + " liters milk per day");
    }


}
