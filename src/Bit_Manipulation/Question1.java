package Bit_Manipulation;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(26));
        System.out.println(isEvenOrOdd(75));
        System.out.println(isEvenOrOdd(16));
        System.out.println(isEvenOrOdd(15));
    }
    public static boolean isEvenOrOdd(int n){
        return (n & 1) != 1;
    }
}
