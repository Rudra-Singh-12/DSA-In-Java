package Bit_Manipulation;

public class Practice01 {
    public static void main(String[] args) {
        System.out.println(powerOfXOfX(4));
        swapWithoutThirdVariable(5,6);
        System.out.println(printAfterAdd1(5));
    }
    public static int powerOfXOfX(int x){
        int ans=1;int a=x;
        while(x>0){
            if((x&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            x=x>>1;
        }
        return ans;
    }
    public  static void swapWithoutThirdVariable(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swapping the value become:"+x+","+y);
    }
    public static int printAfterAdd1(int n){
        return (~n+1)^n;
    }
}
