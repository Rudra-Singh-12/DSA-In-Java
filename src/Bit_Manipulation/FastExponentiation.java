package Bit_Manipulation;

public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(exponentiation(2,5));
    }
    public static int exponentiation(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans*=a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
}
