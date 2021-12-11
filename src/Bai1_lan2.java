import java.util.Scanner;

public class Bai1_lan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10, k=8;
//        System.out.print("Nhập n: ");
//        n = sc.nextInt();

//        System.out.print("Nhập k: ");
        sc = new Scanner(System.in);
//        k = sc.nextInt();
        System.out.print("Nhập mảng: \n");
        int arr[] = {1,5,7,8,1,2,3,6,9,7};
//        for (int i = 0; i < n; i++) {
//            System.out.print("a[" + i + "]: ");
//            arr[i] = sc.nextInt();
//        }
        Bai1_lan2.quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        int mid=n/2;
        int position = n/2;
        System.out.print("\n");
        for(int i = 0 ; i< mid ; i++){
            if(arr[i] + arr[mid] < 8){
                position=mid ++;
                i--;
                position++;
            }else {
                if(arr[i] + arr[mid] > 8){
                    mid--;
                    i--;
                }else {
                    System.out.print("("+arr[i] + "," +arr[mid]+")");
                    mid--;
                }
            }
        }
    }
    public static int  partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void quickSort(int arr[],int low,int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
