import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
    // Create Linked List
        List<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Hello");
        myLinkedList.add("Medved");
        myLinkedList.add("!");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
    // change value in cell
        myLinkedList.set(1, "Russia");
        System.out.println(myLinkedList);
    // add cell
        myLinkedList.add(2,"Medved");
        myLinkedList.add("Russ");
        System.out.println(myLinkedList);
    // remove cell
        myLinkedList.remove(1);
        myLinkedList.remove("russ");
        System.out.println(myLinkedList);
        myLinkedList.remove("Russ");
        System.out.println(myLinkedList);

        for (String i : myLinkedList){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

    //addAll
        List<String> myLinkedList2 = new LinkedList<>();
        myLinkedList2.add("1");
        myLinkedList2.add("3");
        myLinkedList.addAll(myLinkedList2);
        System.out.println(myLinkedList);


    }

}
