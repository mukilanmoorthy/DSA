public class NaturalSum {
    public static void main(String[] args) {
        int sum =20;
        int res = nat(sum);
        System.out.println("The natural total number is :"+res);
    }
   public static int nat(int sum){
    if(sum<=1)
    return sum;
    return sum + nat(sum-1);
   }
}
