public class DecimalToBinary {
    public static void main(String[] args) {
        int dec=10;
        System.out.println(find(dec));
    }
    static int find(int dec){
        if(dec==0){
            return 0;
        }
     return (dec%2+10 * find(dec/2));
    }
}
