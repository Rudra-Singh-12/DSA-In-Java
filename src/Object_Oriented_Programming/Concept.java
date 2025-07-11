package Object_Oriented_Programming;

public class Concept {
    public static void main(String[] args) {
        Fish sharks= new Fish(25);
        sharks.eat();
        sharks.breathe();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{

    Fish(int fins){
        System.out.println("Fish have "+fins+" fins");
    }
}

class Mammal extends Animal{
    int legs;

    public void setLegs(int legs) {
        System.out.println(this.legs=legs);
    }
}
class Dog extends Mammal{
    String breeds;
    void setBreeds(String breeds){
        System.out.println("The breeds is:"+ (this.breeds=breeds));
    }
}
