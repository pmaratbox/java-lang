void main() {
    int[][] grid = {
        {0, 1, 0},
        {0, 1, 0},
        {0, 1, 0}
    };
    var next = new int[3][3];
    for (var r = 0; r < 3; r++) {
        for (var c = 0; c < 3; c++) {
            var n = 0;
            for (var dr = -1; dr <= 1; dr++) {
                for (var dc = -1; dc <= 1; dc++) {
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
    var sb = new StringBuilder();
    for (var r = 0; r < 3; r++) {
        for (var c = 0; c < 3; c++) {
            sb.append(next[r][c] == 1 ? '#' : '.');
        }
        if (r < 2) sb.append('\n');
    }
    IO.println(sb.toString());
}
