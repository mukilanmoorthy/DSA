package program;

public class nto1 {
    public static void main(String[] args) {
        rev(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
       System.out.println(n);
       fun(n-1);
    }
    static void rev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        rev(n-1);
        System.out.println(n);
    }
}
