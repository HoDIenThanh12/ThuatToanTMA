import java.util.*;

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
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int l=0, r=arr.length-1;
        while (l <r){
            int sum =arr[l]+arr[r];
            if(sum ==k){
                System.out.print("("+arr[l]+","+arr[r]+")");
                l++;r--;
            }else {
                if(sum >k) r--;
                else  l++;
            }
        }
    }
}
