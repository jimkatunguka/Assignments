package lab7_Prob4;

public interface Flyable {
    default void fly(){
        System.out.println("Fly with wings");
    }
}
