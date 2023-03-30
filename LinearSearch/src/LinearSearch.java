
import java.util.Random;
import java.util.Scanner;


public class LinearSearch {
    static int LinearSearch(int a[], int x){
        while(true){
            for (int i = 0; i < a.length; i++) {
                if(a[i]==x)
                    return i;
            }  
            return -1;
        }
        
    }
    public static void RandomArr(int[] a, int n) {
        Random rand = new Random();
        for (int i = 0; i <n ; i++) {
            a[i] = rand.nextInt(n);
        }
    }

    //Xuất Mảng
    public static void DisplayArr(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }

    }
    public static int CheckInput(int n){       
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap so phan tu");
            n = Integer.parseInt(sc.nextLine());
            if(n<0)
                break;
        }
        return n;
    }
   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());   
        int[] a=new int [n];
        RandomArr(a, n);
        DisplayArr(a, n);
        System.out.println();
        System.out.println("Số cần tìm: ");
        int x = Integer.parseInt(sc.nextLine());        
        LinearSearch(a, x);
        if(LinearSearch(a, x)!=-1){
        System.out.println("Vị trí của "+x+" là: "+LinearSearch(a, x));
        }else{
            System.out.println("Not found");
        }
        
        
        
        
    }
    
    

    
}
