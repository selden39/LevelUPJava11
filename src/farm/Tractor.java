package farm;
public class Tractor {
    int fuel;
    boolean haveTrailer;

    public Tractor(int fuel, boolean haveTrailer) {
        this.fuel = fuel;
        this.haveTrailer = haveTrailer;
    }

    public String returnColor() {
        return "blue";
    }

    public void rideTractor(int fuel, boolean haveTrailer){
        if (fuel > 10 && haveTrailer) {
            System.out.println("Fuel " + fuel + " liters");
            System.out.println("We have trailer - " + haveTrailer);
            System.out.println("We can RIDE!!!");
        } else {
            System.out.println("Fuel " + fuel + " liters");
            System.out.println("We have trailer - " + haveTrailer);
            System.out.println("Dammit, we do not have trailer or fuel for ride");
        }

    }


}
