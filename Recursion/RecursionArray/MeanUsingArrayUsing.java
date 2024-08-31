public class MeanUsingArrayUsing {
    public static void main(String[] args) {
      
    
        int a[] ={1,2,3,4,56,7,9};
        int n = a.length;
        double Res=res(a, n);
        System.out.println("Mean of array is :"+ Res);
    }
    static double res(int a[],int n){
        if(n==1){
            return a[0];
        }else{
           return ((res(a, n-1) *(n-1))+a[n-1])/n;
        }
    }
}
