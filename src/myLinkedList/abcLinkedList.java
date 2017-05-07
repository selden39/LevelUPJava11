package myLinkedList;

public class abcLinkedList {


    public static void main(String[] args) {

        abcElement a = new abcElement(1);
        abcElement b = new abcElement(2);
        abcElement c = new abcElement(3);

        System.out.println(a.nextElement);
        System.out.println(b.nextElement);
        System.out.println(c.nextElement);
    // связываем элементы
        a.nextElement = b;
        b.nextElement = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("a.nextElement = " + a.nextElement);
        System.out.println("b.nextElement = " + b.nextElement);
        System.out.println("c.nextElement = " + c.nextElement);

        System.out.println("a.nextElement.nextElement = " + a.nextElement.nextElement);


        System.out.println("a.value = " + a.value);
        System.out.println("b.value = " + b.value);
        System.out.println("c.value = " + c.value);

        System.out.println("a.nextElement.nextElement.value = " + a.nextElement.nextElement.value);
        System.out.println("b.nextElement.value = " + b.nextElement.value);
    }



}
