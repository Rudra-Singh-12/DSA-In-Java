package Object_Oriented_Programming;

public class Concept1 {
    public static void main(String[] args) {
        MethodOverRiding1 m= new MethodOverRiding1();
        m.eat();
    }
}
class MethodOverloading{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,int b){
        return a+b;
    }double sum(double a,int b){
        return a+b;
    }
}
class MethodOverRiding{
    void eat(){
        System.out.println("Carnivorous eats herbivorous");
    }
}
class MethodOverRiding1 extends MethodOverloading{

    void eat(){
        System.out.println("Herbivorous eats grass");
    }
}