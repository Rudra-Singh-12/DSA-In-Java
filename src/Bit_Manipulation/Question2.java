package Bit_Manipulation;

public class Question2 {
    public static void main(String[] args) {
//        Get ith position value
        int n=15,position=2;
        System.out.println("The ith bit value of "+n+" is "+getIthBit(n,position));
    }
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
       return (n& bitMask)==0?0:1;
    }
}
