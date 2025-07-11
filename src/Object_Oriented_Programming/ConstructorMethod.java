package Object_Oriented_Programming;

public class ConstructorMethod {
    public static void main(String[] args) {
//        Non Parameterized Constructor
        Student s1= new Student();
//        Parametrized Constructor
        Student s2= new Student("sonia");
        Student s3= new Student(25);
        Student s4= new Student("mona",25);
    }
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Student is called");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
    Student(String name,int roll){
        System.out.println("The name of the student is "+name+" with roll number"+roll);
    }
}