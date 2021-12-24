import java.util.*;

public class Bai1_lan4 {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Input totals numbers n: ");
        n = sc.nextInt();
        System.out.print("Sum k: ");
        sc = new Scanner(System.in);
        k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        slution(arr, k);
    }

    private static void slution(int[] arr, int sum) {
        System.out.println("Output: ");
        for (int i = 0; i < arr.length; i++) {
//          System.out.println("a[i]"+arr[i]);
            if (map.get(sum - arr[i]) != null && map.get(sum - arr[i]) >= 1 && map.get(arr[i]) >= 1) {
                if (sum - arr[i] == arr[i]) {
                    if (map.get(sum - arr[i]) > 1) {
                        System.out.println("(" + arr[i] + " - " + (sum - arr[i]) + ")");
                        map.put(sum - arr[i], map.get(sum - arr[i]) - 1);
                        map.put(arr[i], map.get(arr[i]) - 1);
                    }
                } else {
                    System.out.println("(" + arr[i] + " - " + (sum - arr[i]) + ")");
                    map.put(sum - arr[i], map.get(sum - arr[i]) - 1);
                    map.put(arr[i], map.get(arr[i]) - 1);
                }
            }
        }
    }
}
