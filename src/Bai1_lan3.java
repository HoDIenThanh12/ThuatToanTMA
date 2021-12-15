import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1_lan3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        System.out.print("Input totals numbers n: ");
        n = sc.nextInt();

        System.out.print("Sum k: ");
        sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.print("Input Arrays : \n");
        int arr[] = new int[n];
        Map<Integer, Integer> arrCheck = new HashMap<>();
        int [] l = new int[1];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            arr[i] = sc.nextInt();
            if(arrCheck.containsKey(arr[i])){
                arrCheck.put(arr[i], arrCheck.get(arr[i]) + 1);
            }else{
                arrCheck.put(arr[i], 1);
            }
        }
        for(int i = 0 ; i < n ; i++){
            if( arrCheck.get(k - arr[i]) != null && arrCheck.get(k - arr[i])>=1 && arrCheck.get( arr[i])>=1  ){
                System.out.println("("+arr[i] + " , " + (k - arr[i])+")");
                arrCheck.put(k - arr[i], arrCheck.get(k - arr[i]) - 1);
                arrCheck.put(arr[i], arrCheck.get(arr[i]) - 1);
            }
        }
    }
}
