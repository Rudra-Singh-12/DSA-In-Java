package Bit_Manipulation;

public class Question4 {
    public static void main(String[] args) {
        // clear the ith bit
        System.out.println(clearIthBit(10,1));
    }
    public static int clearIthBit(int n,int i){
        int bitmask= ~(1<< i);
        return n & bitmask;
    }
}
