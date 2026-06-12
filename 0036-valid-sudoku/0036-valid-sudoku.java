class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                String row = "r" + i + c;
                String col = "c" + j + c;
                String box = "b" + (i/3) + (j/3) + c;
                if (!seen.add(row) || !seen.add(col) || !seen.add(box)) return false;
            }
        }
        return true;
    }
}