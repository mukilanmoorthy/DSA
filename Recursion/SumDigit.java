package program;
public class SumDigit {
    public static void main(String[] args) {
        int res = sum(1234);
        System.out.println(res);
    }
    static int sum (int n){
        if(n<=1){
            return n;
        }
       return n+sum(n-1);
    }
}
