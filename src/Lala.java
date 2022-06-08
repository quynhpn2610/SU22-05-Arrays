import java.util.Scanner;

public class Lala {
    private static boolean isOK(int[] arr){
        int count = 0;
        int limit = 3;
        for (int i:
             arr) {
            if(i == 0){
                count ++;
                if(count > limit){
                    return false;
                }
            }
            if(i == 1){
                count = 0;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if(isOK(arr)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
