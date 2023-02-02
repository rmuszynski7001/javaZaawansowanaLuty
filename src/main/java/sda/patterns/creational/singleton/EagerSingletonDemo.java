package sda.patterns.creational.singleton;

public class EagerSingletonDemo {
    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("Counter na 1 instancji = " + instance1.getCounter());
        System.out.println("Counter na 2 instancji = " + instance2.getCounter());
        instance1.incerment();
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("Counter na 1 instancji = " + instance1.getCounter());
        System.out.println("Counter na 2 instancji = " + instance2.getCounter());
        instance2.decrement();
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("Counter na 1 instancji = " + instance1.getCounter());
        System.out.println("Counter na 2 instancji = " + instance2.getCounter());

        /**
         * modyfikowanie countera na 1 obiekcie zmienia go też na 2 obiekcie czyli
         * mamy do czynienia z tym samym obiektem podpiętym do 2 zmiennych
         */


    }
}
