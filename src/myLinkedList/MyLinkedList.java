package myLinkedList;

public class MyLinkedList {

    // один элемент списка
    static class Element {
        int value;
        Element next;
        public Element (int value){
            this.value = value;
        }
    }
    // корневой элемент списка
    Element root = null;

    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        // add element to list
        list1.addToBeginning(5);
        list1.addToBeginning(4);
        list1.addToBeginning(3);
        list1.addToBeginning(2);
        list1.addToBeginning(1);
        list1.addToEnd(6);
        list1.addToEnd(666);
        list1.addToBeginning(100);

        // print all elements
        list1.printList();

        // print current element
        int index = 0;
        int index1 = 5;
        System.out.printf("Element with index %5s - %45s     value - %5s \n", index, list1.getElementByIndex(index), list1.getElementByIndex(index).value);
        System.out.printf("Element with index %5s - %45s     value - %5s \n", index1, list1.getElementByIndex(index1), list1.getElementByIndex(index1).value);

        // delete Element by index
        int indexForDelete = 4;
        list1.deleteElementByIndex(indexForDelete);
        list1.printList();

        // does list2 have element?
        MyLinkedList list2 = new MyLinkedList();
        //list2.addToBeginning(6);
        if (list2.listHasElement()){
            System.out.println("List " + list2 + " has elements");
        } else {
            System.out.println("List " + list2 + "  hasn't elements");
        }

        // Size list
        System.out.println("List1 has " + list1.sizeList() + " elements");
        System.out.println("List2 has " + list2.sizeList() + " elements");

        // print parameter List for learn
        //list1.printListForCheck (list1);
    }

    private int sizeList (){
        int result = 0;
        if (listHasElement()){
            Element currentElement = root;
            while (currentElement != null){
                currentElement = currentElement.next;
                result = result + 1;
            }
        }
        return result;
    }

    private boolean listHasElement (){
        if (root == null) {
            return false;
        } else {
            return true;
        }
    }

    private void deleteElementByIndex(int index){
        Element currentElement;
        currentElement = getElementByIndex(index - 1);
        currentElement.next = currentElement.next.next;
    }

    private Element getElementByIndex(int index){
        Element currentElement = root;
        for (int i = 0; i < index; i++){
            currentElement = currentElement.next;
            if (currentElement == null){
                System.out.println("List hasn't this element");
    // надо бы подумать что вернуть пользователю
                break;
                //return null;
            }
        }
        return currentElement;
    }

    private void addToEnd(int value){
        Element element = new Element(value);
        Element currentElement = root;
        Element preCurrentElement = null;
        if (currentElement == null) {
            addToBeginning(value);
        } else {
            while (currentElement != null) {
                preCurrentElement = currentElement;
                currentElement = currentElement.next;
            }
            preCurrentElement.next = element;
            element.next = null;
        }
    }

    private void addToBeginning (int value) {
        Element element = new Element(value);
        element.next = root;
        root = element;

    }

    private void printList () {
        Element currentElement = root;
        while (currentElement != null){
            System.out.printf("Element - %40s", currentElement);
            System.out.printf("      Value -%5s", currentElement.value);
            System.out.printf("      Next element - %40s", currentElement.next);
            System.out.println();
            currentElement = currentElement.next;
        }
    }

    private void printListForCheck (MyLinkedList list){
        System.out.println(list);
        System.out.println("list.root - " + list.root);
        System.out.println("list.root.next - " + list.root.next);
        System.out.println("list.root.next.next - " + list.root.next.next);
        System.out.println("list.root.next.next.next - " + list.root.next.next.next);
        System.out.println("root value - " + list.root.value);
        System.out.println("1 value - " + list.root.next.value);
        System.out.println("2 value - " + list.root.next.next.value);

    }

}
