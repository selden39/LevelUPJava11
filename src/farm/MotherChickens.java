package farm;

public class MotherChickens {
    String name;
    String voice;

    public MotherChickens(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void voice (String name, String voice) {
        System.out.println("Voice " + name + ": " + voice + " - " + voice + " - " + voice);
    }

    public void dance (String name, String dance) {
        System.out.println("Dance " + name + " - " + dance);
    }


}
