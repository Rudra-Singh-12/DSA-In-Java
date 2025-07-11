package Object_Oriented_Programming;

public class OOPS {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("blue");
        p1.setThickness(5);
        System.out.println("The color of the  pen is:"+p1.color+" and thickness is "+p1.thickness);
        BankAccount myAcc= new BankAccount();
        myAcc.username="Rudra";
        myAcc.setPassword("25@45");
        System.out.println(myAcc.getPassword());
        System.out.println(p1.getColor());
        System.out.println(p1.getThickness());
    }
}
class Pen{
//    Attributes+properties
    String color;
    int thickness;

    public void setColor(String color) {
        this.color = color;
    }
    String getColor(){
        return this.color;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    int getThickness(){
        return this.thickness;
    }
}
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String password){
        this.password=password;
    }
    String getPassword(){
        return this.password;
    }
}