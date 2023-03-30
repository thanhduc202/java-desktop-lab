


public class Fibo {

    public static void print() {
        System.out.println("The 45 sequence fibonanci: ");
        System.out.println("0, 1, ");
    }
    static int fibonanci(int count, int f1, int f2) {
        int f3;
        
        f3 = f1+f2;
        System.out.println(f3+", ");
        if(count == 10){
            return 0;
        }
        return fibonanci(count+1, f2, f3);
    }


    public static void main(String[] args) {
        print();
        fibonanci(3, 0, 1);
    }

}
