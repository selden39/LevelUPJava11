package generic;

// создаем класс Poin с типом <Т>, в который можем позднее задавать конкретный тип
public class Point<T> {
    T x;
    T y;

    Point(T x, T y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point<Integer> pInt = new Point<>(1, 3);
        Point<Double> pDouble = new Point<>(4.67, 33.543);
    }
}
