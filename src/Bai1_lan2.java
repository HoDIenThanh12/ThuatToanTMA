import java.util.Scanner;

public class Bai1_lan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Nhập n: ");
        n = sc.nextInt();

        System.out.print("Nhập k: ");
        sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.print("Nhập mảng: \n");
        int arr[][] = new int[2][n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            arr[0][i] = sc.nextInt();
            arr[1][i] =0;
        }
        System.out.println("n/k: " + n + "/" + k);
        for (int i = 0; i < n-1; i++) {
            if(arr[1][i]==0){
                for(int j=i+1; j <n ; j++){
                    if((arr[0][i]+arr[0][j])==k && arr[0][j]!=0){
                        System.out.print("("+arr[i] + "," +arr[j]+")");
                        break;
                    }
                }
            }

        }
    }
}
