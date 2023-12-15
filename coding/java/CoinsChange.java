import java.util.Arrays;

public class CoinsChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int ans = coinsChange ( coins, amount );
        System.out.println ( ans );

    }

    public static int coinsChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill ( dp, amount + 1 );
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min ( dp[i], 1 + dp[i - coin] );
                }
            }
        }
        if (dp[amount] != (amount + 1)) {
            return dp[amount];

        } else {
            return -1;
        }
    }


}
