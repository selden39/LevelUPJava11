package farm;

abstract public class Mammals implements ActionMammals{
    String name;
    public Mammals(String name){
        this.name = name;
    }

    public abstract void breathe();
    public abstract void run(int speed);
    public abstract void voice(String voice);


}
