import java.util.*;
import java.io.*;

public class Q_2 {
    static class Pair {
        int len;
        int wor;

        Pair(int len, int wor) {
            this.len = len;
            this.wor = wor;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int n = s.length();
        int[] w = new int[n];
        String[] worthStrings = br.readLine().trim().split("\\s+");
        int sum_w = 0;
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(worthStrings[i]);
            sum_w += w[i];
        }
        Pair[][] dp = new Pair[n + 1][3];
        dp[0][0] = new Pair(0, 0);
        for (int i = 0; i < n; i++) {
            int s_i = s.charAt(i) - '0'; 
            int s_i_idx = s_i + 1;
            for (int c_idx = 0; c_idx <= 2; c_idx++) {
                Pair curr = dp[i][c_idx];
                if (curr != null) {
                    int c = c_idx - 1;
                    if (c == -1 || s_i != c) {
                        Pair temp = new Pair(curr.len + 1, curr.wor + w[i]);
                        if (dp[i + 1][s_i_idx] == null || dp[i + 1][s_i_idx].len < temp.len ||
                            (dp[i + 1][s_i_idx].len == temp.len && dp[i + 1][s_i_idx].wor< temp.wor)) {
                            dp[i + 1][s_i_idx] = temp;
                        }
                    }
                    if (dp[i + 1][c_idx] == null || dp[i + 1][c_idx].len < curr.len ||
                        (dp[i + 1][c_idx].len == curr.len && dp[i + 1][c_idx].wor < curr.wor)) {
                        dp[i + 1][c_idx] = curr;
                    }
                }
            }
        }
        Pair result = null;
        for (int c_idx = 1; c_idx <= 2; c_idx++) {
            Pair candidate = dp[n][c_idx];
            if (candidate != null) {
                if (result == null || candidate.len > result.len ||
                    (candidate.len == result.len && candidate.wor > result.wor)) {
                    result = candidate;
                }
            }
        }

        int total_Worth_Kept = result != null ? result.wor : 0;
        int total_Worth_Removed = sum_w - total_Worth_Kept;
        System.out.println(total_Worth_Removed);
    }
}
