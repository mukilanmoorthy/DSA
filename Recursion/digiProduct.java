package program;

public class digiProduct {
    public static void main(String[] args) {
        int ans = pro(1234);
        System.out.println(ans);
    }
    static int pro(int n){
    if(n%10==n){
        return n;
    }
    return (n%10) * pro(n/10);
}
}
