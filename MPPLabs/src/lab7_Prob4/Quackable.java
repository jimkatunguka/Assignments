package lab7_Prob4;

public interface Quackable {
    default public void quack(){
        System.out.println("Quacking");
    }
}
