import java.util.*;

class CountPrime{
    private static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++){
            if (n % i != 0){
                return false;
            }
        }
        return true;
    }

    public static void countPrime(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (isPrime(arr[i])){
                count ++;
            }
        }
        System.out.print(count);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        countPrime(arr);
        sc.close();

    }
}