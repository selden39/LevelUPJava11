import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("------- Array List Integer -------");
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        arrayListInt.add(1);
        arrayListInt.add(2);
        arrayListInt.add(3);
        arrayListInt.add(4);
        System.out.println(arrayListInt);


        System.out.println("------- Array List String -------");
        ArrayList<String> arrayListString = new ArrayList<>();
        System.out.println(arrayListString.size());
        arrayListString.add("Hello");
        System.out.println(arrayListString.size());
        arrayListString.add("Medved");
        System.out.println(arrayListString.size());
        arrayListString.add("!");
        System.out.println(arrayListString.size());

        System.out.println(arrayListString);

    // change value in cell
        arrayListString.set(1, "Russia");
        System.out.println(arrayListString);

    // add value in center
        arrayListString.add(2, "Medved");
        System.out.println(arrayListString);

    // remove cell
        arrayListString.remove(1);
        System.out.println(arrayListString);


    //
        for (String i : arrayListString){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayListString.size(); i++){
            System.out.print(arrayListString.get(i) + " ");
        }
        System.out.println();
    }
}
