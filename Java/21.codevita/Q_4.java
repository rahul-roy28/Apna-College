import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] tokens = line.split("\\s+");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = tokens[j].charAt(0);
            }
        }
        int Q = sc.nextInt();

        // Process each query
        for (int q = 0; q < Q; q++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int size = sc.nextInt();
            size = Math.min(size, Math.min(n - row, n - col));
            processQuery(matrix, row, col, size);
        }
        StringBuilder sb = new StringBuilder();
        for (char[] chars : matrix) {
            for (char c : chars) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
    private static void processQuery(char[][] matrix, int row, int col, int size) {
        int totalLayers = size / 2;
        for (int layer = 1; layer <= totalLayers; layer++) {
            List<int[]> positions = new ArrayList<>();
            List<Character> elements = new ArrayList<>();
            int startRow = row + layer - 1;
            int startCol = col + layer - 1;
            int endRow = row + size - layer;
            int endCol = col + size - layer;
            for (int j = startCol; j <= endCol; j++) {
                positions.add(new int[]{startRow, j});
                elements.add(matrix[startRow][j]);
            }
            for (int i = startRow + 1; i <= endRow - 1; i++) {
                positions.add(new int[]{i, endCol});
                elements.add(matrix[i][endCol]);
            }
            if (endRow > startRow) {
                for (int j = endCol; j >= startCol; j--) {
                    positions.add(new int[]{endRow, j});
                    elements.add(matrix[endRow][j]);
                }
            }
            if (endCol > startCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    positions.add(new int[]{i, startCol});
                    elements.add(matrix[i][startCol]);
                }
            }
            if (elements.size() == 0) continue;
            int K = layer;
            if (K % 2 == 1) {
                rotate(elements, K % elements.size(), true);
                for (int i = 0; i < elements.size(); i++) {
                    elements.set(i, prevChar(elements.get(i)));
                }
            } else {
                rotate(elements, K % elements.size(), false);
                for (int i = 0; i < elements.size(); i++) {
                    elements.set(i, nextChar(elements.get(i)));
                }
            }
            for (int i = 0; i < positions.size(); i++) {
                int[] pos = positions.get(i);
                matrix[pos[0]][pos[1]] = elements.get(i);
            }
        }
    }
    private static void rotate(List<Character> list, int k, boolean counterClockwise) {
        int n = list.size();
        if (k == 0 || n == 0) return;
        k = k % n;
        if (counterClockwise) {
            reverse(list, 0, k - 1);
            reverse(list, k, n - 1);
            reverse(list, 0, n - 1);
        } else {
            reverse(list, 0, n - 1);
            reverse(list, 0, k - 1);
            reverse(list, k, n - 1);
        }
    }
    private static void reverse(List<Character> list, int start, int end) {
        while (start < end) {
            char temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    private static char nextChar(char c) {
        return c == 'Z' ? 'A' : (char) (c + 1);
    }
    private static char prevChar(char c) {
        return c == 'A' ? 'Z' : (char) (c - 1);
    }
}
