package program;
public class numberProgram {
    public static void main(String[] args) {
        

        // print number write a number
        // print 5 num
        // out put 12345

        //stack over flow!
        //base condition ! why need
        // no base codition !
//seperate memeory

print1(1);
    }
    static void  print1(int n){
        if(n==5){     /*the fuction call its self    //base condition recurison condition  where  or rec  will stop making new call *. no base condition  call will keep happpening  stack wiil be filed again again */
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print1(n+1);
    }
}
/* 
    static void  print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void  print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void  print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void  print5(int n){
        System.out.println(n);
    }
        */

