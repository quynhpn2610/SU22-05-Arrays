import java.util.*;

public class Fruit{
    private static int countFruit(int[][] baskets) {
        int index = 0;
        int maxApple = 0;
        int maxOrange = 0;
        List<int[]> maxAppleBaskets = new ArrayList<int[]>();
        for (int[] basket:
             baskets){
            if (basket[0] > maxApple){
                maxApple = basket[0];
            }
        }

        // Add baskets with maxApple to the maxAppleBaskets
        for (int[] basket:
             baskets) {
            if(basket[0] == maxApple){
                maxAppleBaskets.add(basket);
            }
        }
        // get the basket with most oranges in maxAppleBaskets
        for (int[] basket:
             maxAppleBaskets) {
            if(basket[1] > maxOrange){
                maxOrange = basket[1];
            }
        }
        for (int i = 0; i < baskets.length; i++) {
                if (baskets[i][0] == maxApple && baskets[i][1] == maxOrange) {
                    index = i;
                    break;
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