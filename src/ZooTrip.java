import java.util.*;

public class ZooTrip{
    public static void gameHeld(int[] arr){
        if (arr.length % 2 != 0){
            System.out.println("NO");
            return;
        }

        int count1 = 0;
        int count0 = 0;
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == 1){
                count1++;
            }
//            else if (arr[i] == 0){
//                count0++;
//            }
        }
        count0 = arr.length - count1;
        if (count1 != count0){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        gameHeld(arr);
        sc.close();
    }
}