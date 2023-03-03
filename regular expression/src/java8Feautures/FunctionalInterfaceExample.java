package java8Feautures;


@FunctionalInterface
public interface FunctionalInterfaceExample {
 
    void print(String message);
 
    default void display() {
        System.out.println("hello");
    }
 
    static int num() {
        return 10;
    }
 
    static double printDouble() {
        return 90.00;
    }
 
    int hashCode();
 
    String toString();
 
    boolean equals(Object obj);
}
 




