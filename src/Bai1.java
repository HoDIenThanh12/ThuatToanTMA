import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Nhập n: ");
        n = sc.nextInt();

        System.out.print("Nhập k: ");
        sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.print("Nhập mảng: \n");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("n/k: " + n + "/" + k);
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1; j <n ; j++){
                if((arr[i]+arr[j])==k){
                    System.out.print("("+arr[i] + "," +arr[j]+")");
                    for(int l=j; l<n-1 ; l++){
                        arr[l]=arr[l+1];
                    }
                    n--;
                    j=n+1;
                }
            }
        }
    }
}
