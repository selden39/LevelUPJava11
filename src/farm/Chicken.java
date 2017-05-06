package farm;
public class Chicken {
    String name;
    int age;

    public Chicken(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice(String name, String chikenVoice) {
        System.out.println("Voice " + name + ": " + chikenVoice + " - " + chikenVoice + " - " + chikenVoice);
    }

    public void dance (String name, String chikenDance) {
        System.out.println("Dance " + name + " - " + chikenDance);
    }
}
