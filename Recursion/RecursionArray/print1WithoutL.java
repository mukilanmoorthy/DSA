public class print1WithoutL {
     public static void main(String[] args) {
        int n=10;
        num(n);
     }
     static void num(int n){
        if(n>0){
           
            num(n-1);
        }
       System.out.println(n+" ");
     }
}
