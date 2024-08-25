package program;
public class fibo1 {
    public static void main(String[] args) {
        System.out.println(fibo1(7));
    }
    static int fibo1(int n){
// base condtion

if(n<2){
    return n;
}

return fibo1(n-1)+fibo1(n-2);
    }
}
