import java.util.*;

public class EmployeeID{
    private static int smallestIdAvailable(int[] arr){
        Arrays.sort(arr);
        int x = 0;
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i+1] - arr[i] > 1) {
                x = arr[i] + 1;
                return x;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(smallestIdAvailable(arr));
    }
}