package farm;
public class Turkey {
    String name;

    public Turkey(String name) {
        this.name = name;
    }

    public void voice (String name){
        System.out.println("Turkey " + name + " hasn`t voice");
    }

    public String activeTurkey (int moodTurkey){
        String turkeyDo;
        switch(moodTurkey){
            case 0: turkeyDo = "whines";
                break;
            case 1: turkeyDo = "asleep";
                break;
            case 2: turkeyDo = "eating";
                break;
            default: turkeyDo = "nothing";
        }
        return turkeyDo;
    }

}
