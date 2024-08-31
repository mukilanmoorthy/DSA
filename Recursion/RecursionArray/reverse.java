public class reverse {
   public static void main(String[] args) {
    int n=10;
    rev(n);
   }
   static void rev(int n){
    if(n>0){
        System.out.println(n+" ");
        rev(n-1);
    }
    return;
   }
}
