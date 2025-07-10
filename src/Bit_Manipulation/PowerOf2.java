package Bit_Manipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOf2(65));
        System.out.println(isPowerOf2(26));
        System.out.println(isPowerOf2(97));
        System.out.println(isPowerOf2(12));
        System.out.println(isPowerOf2(1024));
    }
    public static boolean isPowerOf2(int n){
        return (n&(n-1))==0;
    }
}
