/*
 * This section involves the code for Alignment of the Subsequences.
 * The feasible solution is to introduce gaps into the strings, 
 * so as to equalize the lengths. 
 * Since it can be easily proved that the addition of extra gaps after equalizing the lengths will only 
 * lead to increment of penalty.
 */

package Main_Package;
import java.io.*;
import java.util.*;
import java.lang.*;

class Alignment {
		
		//-----------------------------------------------------------------------------

		/*
		 * We use the Optimal Substructure of the code such that Time Complexity =  O(m*n)
		 */
	
	static String[] getMinimumPenalty(String x, String y, int pxy, int pgap) {
		
		//-----------------------------------------------------------------------------

		/*
		 * Initialize the variables
		 * Get the length of String1
		 * Get the length of String2
		 * 
		 */
		
		int i, j; 
		int m = x.length(); 
		int n = y.length(); 

		//-----------------------------------------------------------------------------

		/*
		 * Maintain a table 'dp' whose size is n+m+1
		 * We fill the dp[][] completely with x1[] array value of 0
		 */
		
		
		int dp[][] = new int[n + m + 1][n + m + 1];

		for (int[] x1 : dp)
			Arrays.fill(x1, 0);

		//-----------------------------------------------------------------------------
		
		/*
		 * Initialize the table with PenaltyGap multiplied by its position Such that 
		 * Integers at position (i,j) and (j,i) remains the same
		 */

		
		for (i = 0; i <= (n + m); i++) {
			dp[i][0] = i * pgap;
			dp[0][i] = i * pgap;
		}
		
		//-----------------------------------------------------------------------------
		
		/*
		 * Calculate Minimum Penalty for the the Optimal Substructure 
		 * for position i from 1 to string 1 length
		 * 		for position j from 1 to string 2 length
		 * 			if character at x [i] = character at y [j]
		 * 				Assign the previous diagonal value to the dp[i][j]
		 * 			else
		 * 				Choose the minimum value min =  dp(previous_diagonal_value) + penaltyMismatch and dp(Previous_Horizonal_value + penaltyGap)
		 * 				Choose the minimum value from vertical_previous value added with PenaltyGap and Previous min value
		 * 				Assign this minimum value to dp[i][j]
		 */
		
		for (i = 1; i <= m; i++) {
			for (j = 1; j <= n; j++) {
				if (x.charAt(i - 1) == y.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1] + pxy, dp[i - 1][j] + pgap), dp[i][j - 1] + pgap);
				}
			}
		}

		//-----------------------------------------------------------------------------

		/*
		 * Reconstruct the Solution with the total length of n+m 
		 * Maximum possible length 
		 * Assign the string 1 position starting index as last value;
		 * Assign the string 2 position starting index as last value;
		 */

		int l = n + m; 

		i = m;
		j = n;

		int xpos = l;
		int ypos = l;

		//-----------------------------------------------------------------------------

		/*
		 * Finally the answer is obtained for the respective strings as
		 * String1 ans = xans of length l+1;
		 * String2 ans = yans of length l+1;
		 * 
		 * 
		 * 
		 * Till i != 0 or j!=0 do,
		 * 		if string1_position-1 matches string2_position
		 * 				assign string1.position i-1 to xans
		 * 				assign string2.position j-1 to yans
		 * 				decrement i and j by 1
		 * 
		 * 
		 * 		else if after adding penalty for mismatch the  value is equal to the previous table value
		 * 				assign string1.position i-1 to xans
		 * 				assign string2.position j-1 to yans
		 * 				decrement i and j by 1
		 * 
		 * 
		 * 		else if after adding penalty for gap the value is equal to the Horizontal previous table value
		 * 				assign string1.position i-1 to xans
		 * 				assign '-' to yans
		 * 				decrement i
		 * 
		 * 
		 * 		else if after adding penalty for gap the value is equal to the Vertical previous table value
		 * 				assign '-' to xans
		 * 				assign string2.position j-1 to yans
		 * 				decrement j
		 * 
		 */
		
		int xans[] = new int[l + 1];
		int yans[] = new int[l + 1];

		while (!(i == 0 || j == 0)) {
			if (x.charAt(i - 1) == y.charAt(j - 1)) {
				xans[xpos--] = (int) x.charAt(i - 1);
				yans[ypos--] = (int) y.charAt(j - 1);
				i--;
				j--;
			} else if (dp[i - 1][j - 1] + pxy == dp[i][j]) {
				xans[xpos--] = (int) x.charAt(i - 1);
				yans[ypos--] = (int) y.charAt(j - 1);
				i--;
				j--;
			} else if (dp[i - 1][j] + pgap == dp[i][j]) {
				xans[xpos--] = (int) x.charAt(i - 1);
				yans[ypos--] = (int) '-';
				i--;
			} else if (dp[i][j - 1] + pgap == dp[i][j]) {
				xans[xpos--] = (int) '-';
				yans[ypos--] = (int) y.charAt(j - 1);
				j--;
			}
		}
		while (xpos > 0) {
			if (i > 0)
				xans[xpos--] = (int) x.charAt(--i);
			else
				xans[xpos--] = (int) '-';
		}
		while (ypos > 0) {
			if (j > 0)
				yans[ypos--] = (int) y.charAt(--j);
			else
				yans[ypos--] = (int) '-';
		}
		//-----------------------------------------------------------------------------

		/*
		 * Since we have assumed the answer to be n+m long,we need to remove the extra gaps in the starting id
		 * represents the index from which the arrays xans,yans are useful
		 */

		int id = 1;
		for (i = l; i >= 1; i--) {
			if ((char) yans[i] == '-' && (char) xans[i] == '-') {
				id = i + 1;
				break;
			}
		}

		//-----------------------------------------------------------------------------


		String[] str = new String[2];
		str[0] = "";
		str[1] = "";
		for (i = id; i <= l; i++) {
			str[0] += (char) xans[i];
		}
		for (i = id; i <= l; i++) {
			str[1] += (char) yans[i];
		}
		return str;
	}
}
