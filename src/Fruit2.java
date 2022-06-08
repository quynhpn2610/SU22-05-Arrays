import java.util.*;

public class Fruit2{
    private static int countFruit(int[][] baskets) {
        int index = 0;
        int maxApple = 0;
        int maxOrange = 0;

        // Find max apples
        for (int[] basket:
                baskets){
            if (basket[0] > maxApple){
                maxApple = basket[0];
            }
        }


        for (int i = 0; i < baskets.length; i++) {
            if (baskets[i][0] == maxApple && baskets[i][1] > maxOrange) {
                maxOrange = baskets[i][1];
                index = i;
            }
        }

        return (index+1);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] baskets = new int[n][2];
        for (int i = 0; i < baskets.length; i++) {
            baskets[i][0] = sc.nextInt();
            baskets[i][1] = sc.nextInt();
        }
        System.out.println(countFruit(baskets));

        sc.close();
    }
}