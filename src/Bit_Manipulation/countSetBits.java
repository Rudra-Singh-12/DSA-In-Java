package Bit_Manipulation;

public class countSetBits {
    public static void main(String[] args) {
        System.out.println(countSet(10));
    }
    public static int countSet(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
