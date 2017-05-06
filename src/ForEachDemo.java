import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        int[] arr = {3,77,6};
      /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        for (int i : arr) System.out.println(i);

        // foreach for ArryList
        System.out.println("---- print Arraylist with foreach ------");
        ArrayList list = new ArrayList();
        list.add("first");
        list.add("second");
        list.add("third");
        list.forEach((e)-> System.out.println(e));


    }


}
