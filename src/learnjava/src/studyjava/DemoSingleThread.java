package studyjava;

public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Foo");
        Singleton anothersingleton = Singleton.getInstance("bar");
        System.out.println(singleton.value);
        System.out.println(anothersingleton.value);
    }
}
