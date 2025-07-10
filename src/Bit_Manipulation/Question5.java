package Bit_Manipulation;
public class Question5 {
    public static void main(String[] args) {
        System.out.println(updateIthBit(10,2,1));
    }
    public static int updateIthBit(int n,int i,int newBit){
         n=clearIthBit(n,i);
        int bitmask=newBit<<i;
        return n| bitmask;
    }
    public static int clearIthBit(int n,int i){
        int bitmask= ~(1<< i);
        return n & bitmask;
    }
}
