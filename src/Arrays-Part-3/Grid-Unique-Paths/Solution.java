public class Solution {
	public static int uniquePaths(int m, int n) {
		// Reference table to store subproblems.
		int[][] dp = new int[m][n];

		// Paths to reach a cell in column 1.
		for (int i = 0; i < m; i++) {
			dp[i][0] = 1;
		}

		// Paths to reach a cell in row 1.
		for (int j = 0; j < n; j++) {
			dp[0][j] = 1;
		}

		// Bottom up approach.
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		// Returning answer.
		return dp[m - 1][n - 1];
	}
}