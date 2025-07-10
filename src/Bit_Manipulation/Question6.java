package Bit_Manipulation;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15,2));
    }
    public static  int clearLastIthBit(int n,int i){
        int bitMask=((~0)<<i);
        return n & bitMask;
    }
}
