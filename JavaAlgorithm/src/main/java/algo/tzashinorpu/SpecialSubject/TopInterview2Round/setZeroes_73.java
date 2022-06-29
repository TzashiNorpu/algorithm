package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class setZeroes_73 {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        boolean first_row = false, first_col = false;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                first_col = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                first_row = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) matrix[i][0] = matrix[0][j] = 0;
            }
        }

        for (int i = m - 1; i >= 1; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }
        if (first_row) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
        if (first_col) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
