public class GameOfLifeStep {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 0},
            {0, 1, 0},
            {0, 1, 0}
        };
        int[][] next = new int[3][3];
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                int n = 0;
                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {
                        if (dr == 0 && dc == 0) continue;
                        int rr = r + dr, cc = c + dc;
                        if (rr >= 0 && rr < 3 && cc >= 0 && cc < 3) {
                            n += grid[rr][cc];
                        }
                    }
                }
                next[r][c] = (grid[r][c] == 1) ? ((n == 2 || n == 3) ? 1 : 0)
                                               : (n == 3 ? 1 : 0);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                sb.append(next[r][c] == 1 ? '#' : '.');
            }
            if (r < 2) sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
