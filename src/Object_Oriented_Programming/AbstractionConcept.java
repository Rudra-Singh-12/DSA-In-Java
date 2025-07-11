package Object_Oriented_Programming;

public class AbstractionConcept {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.walk();
        h.eat();
    }
}
abstract  class Animal3{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal3{
    void walk(){
        System.out.println("Walks with 4 legs");
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up down diagonal left right");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up down left right");
    }
}