package Bit_Manipulation;

public class Question3 {
    public static void main(String[] args) {
        // setting the ith bit
        System.out.println(setIthBit(10,2));
    }
    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
}
