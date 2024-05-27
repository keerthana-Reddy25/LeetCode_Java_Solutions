public class Main {

    public static void findfib(int n){
        if(n<=1){
            return ;
        }
        int a =0,b=1,fib =0;
        System.out.print(a);
        for(int i =1;i<n;i++){
            System.out.print(" ,"+b);
            fib=a+b;
            a=b;
            b=fib;

        }

    }


    public static void main(String[] args) {

        findfib(5);

    }
}